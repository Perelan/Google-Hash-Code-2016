public class Map extends Thread{
    private final int GRID_SIZE = 10000;

    private int[][] grid;
    private ArrayList<Drone> drone_list;

    public Map(){
        grid = new int[GRID_SIZE - 1][GRID_SIZE - 1];
    }

    public void run(){
        // Execute a command. - In main class call: object.start()
    }

    public ArrayList<Drone> getList(){
        return list;
    }
}
