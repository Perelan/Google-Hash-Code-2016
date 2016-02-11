public class Map{
    private final int GRID_SIZE = 10000;

    private int[][] grid;
    private ArrayList<Drone> drone_list;

    public Map(ArrayList<Drone> drone_list){
        grid            = new int[GRID_SIZE - 1][GRID_SIZE - 1];
        this.drone_list = drone_list;
    }
}
