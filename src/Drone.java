class Drone
{
      private int drone_id;
      private String drone_cmd;

      public int getDrone_ID()
      {
        return drone_id;
      }

      public String getDrone_cmd()
      {
        return drone_cmd;
      }

      public void set_cmd(String cmd)
      {
        this.drone_cmd = cmd;
      }

}
