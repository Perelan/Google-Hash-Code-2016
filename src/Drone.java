<<<<<<< HEAD
class Drone extends Thread {

     private int drone_id;
     private String drone_cmd;
     private boolean waiting = true;
     private boolean ready   = false;
     private int row_position;
     private int column_position;

     public Drone(int drone_id, String drone_cmd, row_position, column_position){
         this.drone_id          = drone_id;
         this.drone_cmd         = drone_cmd;
         this.row_position      = row_position;
         this.column_position   = column_position;
     }

     public void run(){
         System.out.println("Starting: " + Thread.currentThread().getName() + "Drone-id: " + drone_id);
         synchronized(this){
            // Execute drone COMMAND here!

            if(drone_cmd.equalsIgnoreCase("load")){
                //Execute load
                load();
            }else if(drone_cmd.equalsIgnoreCase("deliver")){
                //Execute deliver
            }else{
                System.out.println(String.format("Drone(%d) had an incorrect command", drone_id));
            }


            notify(); //Notify main when task is completed
         }
     }

     public void load(){
         // Check throught the warehause arraylist and determein the x and y position of the warehouse vs the drones x and y positon
     }

     public int getDrone_ID(){
         return drone_id;
     }

     public String getDrone_cmd(){
         return drone_cmd;
     }

     /*
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
   }*/
}
