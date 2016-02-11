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
            if(drone_cmd.equalsIgnoreCase("load")){
                load();
            }else if(drone_cmd.equalsIgnoreCase("deliver")){
                deliver();
            }else{
                System.out.println(String.format("Drone(%d) had an invaild command!", drone_id));
            }
            notify(); //Notify main when task is completed
         }
     }

     public void load(){
        //number of
        

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
         return Math.sqrt(((row - wh.row)*(row - wh.row)) + ((column - wh.column)*(colmn - wh.column)));
     }
}
