import java.util.*;
import java.lang.*;

class Drone extends Thread
{
     private int drone_id;
     private String drone_cmd;
     private boolean waiting = true;
     private boolean ready   = false;
     private int row;
     private int column;
     private Product product;   // What the drone is carrying - DRONE CAN ONLY CARRY ONE ITEM (ATM);
     private ArrayList<Warehouse> wh;

     public Drone(int drone_id, String drone_cmd, int row, int column){
         this.drone_id  = drone_id;
         this.drone_cmd = drone_cmd;
         this.row = row;
         this.column = column;
     }

     public void run(){
         System.out.println("Starting: " + Thread.currentThread().getName() + "Drone-id: " + drone_id);
         synchronized(this){
            // Execute drone COMMAND here!
            load();
            deliver();

            notify(); //Notify main when task is completed
         }
     }

     public void insert_item(Product p){
         product = p;
     }

     public void insert_warehouse(ArrayList<Warehouse> wh){
         this.wh = wh;
     }

     public void load(){
        //Check if drone is at a warehouse
            // True: GET ITEM
            // False: Fly to path
        int shortest = 0;
        Warehouse shortest_wh = null; // Store the warehouse closes to the drone

        for(int i = 0; i < wh.size(); i++){
            if(row == wh.get(i).getRow() && column == wh.get(i).getColumn()){
                break;// If true break list
            }else{
                if(shortest > find_distance(wh.get(i))){
                    shortest = find_distance(wh.get(i));
                    shortest_wh = wh.get(i);
                }
            }
        }

        // Change drone position;
        this.row = shortest_wh.getRow();
        this.column = shortest_wh.getColumn();

        // Check if warehouse has item
        if(shortest_wh.getList().contains(product)){
            System.out.println(String.format("The warehouse(%d) has the product(%d)!", shortest_wh.getWarehouse_id(), product.getProduct_id()));
        }else{
            System.out.println(String.format("The warehouse(%d) DO NOT have the product(%d)!", shortest_wh.getWarehouse_id(), product.getProduct_id()));
            return;
        }
        // NOT NEEDED ATM: Check if drone can carry the package
        //TODO
     }

     public void deliver(){

     }

     public int getDrone_ID(){
         return drone_id;
     }

     public String getDrone_cmd(){
         return drone_cmd;
     }

     synchronized void startWait() {
       try {
          while(!ready) wait();
       }
       catch(InterruptedException exc) {
          System.out.println("wait() interrupted");
       }
    }

    synchronized void notice() {
       ready = true;
       notify();
    }

     public int find_distance(Warehouse wh){
         return (int) Math.sqrt(((row - wh.getRow())*(row - wh.getRow())) + ((column - wh.getColumn())*(column - wh.getColumn())));
     }
}
