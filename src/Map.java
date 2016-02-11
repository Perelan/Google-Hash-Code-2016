public class Map
{
    private final int GRID_SIZE = 10000;

    private int[][] grid;
    private ArrayList<Drone> drone_list;

    public void run()
    {
        // Execute a command. - In main class call: object.start()
    }

    public Map(int row, int col, int nrOfDrones,int deadLine, int maxLoad){
        grid = new int[GRID_SIZE - 1][GRID_SIZE - 1];
    }

    public ArrayList<Drone> getList(){
        return list;
    }
}//End class
