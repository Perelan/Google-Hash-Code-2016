import java.util.ArrayList;

public class Map
{
    private final int GRID_SIZE = 10000;

    private int[][] grid;
    private int nrOfDrones;
    private int droneMaxLoad;
    private int deadLine;
    private ArrayList<Drone> drone_list;


    public Map(int row, int col, int nrOfDrones,int deadLine, int maxLoad){
        this.grid = new int[row - 1][col - 1];
        this.nrOfDrones = nrOfDrones;
        this.droneMaxLoad = maxLoad;
        this.deadLine = deadLine;
    }

    public ArrayList<Drone> getList(){
        return drone_list;
    }
}//End class
