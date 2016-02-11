public class Map
{
    private final int GRID_SIZE = 10000;

    private int[][] grid;
    private int nrOfDrone;
    private int droneMaxLoad;
    private int deadLine;
    private ArrayList<Drone> drone_list;

    public void run()
    {
        // Execute a command. - In main class call: object.start()
    }

    public Map(int row, int col, int nrOfDrones,int deadLine, int maxLoad){
        this.grid = new int[row - 1][col - 1];
        this.nrOfDrones = nrOfDrones;
        this.droneMaxLoad = maxLoad;
        this.deadLine = deadLine;
    }

    public ArrayList<Drone> getList(){
        return list;
    }
}//End class
