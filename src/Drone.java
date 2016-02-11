<<<<<<< HEAD
class Drone extends Thread {

     private int drone_id;
     private String drone_cmd;
     private boolean waiting = true;
     private boolean ready   = false;

     public Drone(int drone_id, String drone_cmd){
         this.drone_id  = drone_id;
         this.drone_cmd = drone_cmd;
     }

     public void run(){
         System.out.println("Starting: " + Thread.currentThread().getName() + "Drone-id: " + drone_id);
         synchronized(this){
            // Execute drone COMMAND here!


            notify(); //Notify main when task is completed
         }
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
}
=======
class Drone extends Thread{
  private int drone_id;
  private String drone_cmd;
  private Map deliveryMap;

  public Drone(int drone_id,Map delMap){
      this.drone_id = drone_id;
      this.deliveryMap = delMap;
  }

  public void run(){
      deliveryMap.delivered();
  }

  public int getDrone_ID(){
      return drone_id;
  }

  public String getDrone_cmd(){
      return drone_cmd;
  }

  public void set_cmd(String cmd){
      this.drone_cmd = cmd;
  }
}
>>>>>>> 631edf589a49e5dc06f3c09818a27352cbd545c0
