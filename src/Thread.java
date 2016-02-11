public class Thread extends Thread{
    private boolean waiting = true;
    private boolean ready   = true;


    public void run(){
        String thrdName = Thread.currentThread().getName();
        System.out.println("Starting: " + thrdName);
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
