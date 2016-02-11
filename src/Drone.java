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