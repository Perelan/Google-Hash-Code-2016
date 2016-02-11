import java.util.*;

public class Warehouse
{

    private ArrayList<Product> list;
    private int column;
    private int row;
    private static int warehouse_id;

    public Warehouse(int row, int column)
    {
        list = new ArrayList<>();
        this.row = row;
        this.column = column;
        warehouse_id++;
    }

    /*Inser product in warehouse*/
    public void insert(Product product)
    {
        list.add(product);
        //System.out.println(String.format("Product %s were inserted into %s", p.getProduct_id, warehouse_id));
    }
}//End class
