public class Map{
    private final int GRID_SIZE = 10000;

    private int[][] grid;
    private ArrayList<Drone> drone_list;

<<<<<<< HEAD
    public Map(ArrayList<Drone> drone_list){
        grid            = new int[GRID_SIZE - 1][GRID_SIZE - 1];
        this.drone_list = drone_list;
=======
    public Map(int row, int col, int nrOfDrones,int deadLine, int maxLoad){
        grid = new int[GRID_SIZE - 1][GRID_SIZE - 1];
    }

    public ArrayList<Drone> getList(){
        return list;
>>>>>>> 631edf589a49e5dc06f3c09818a27352cbd545c0
    }
}
