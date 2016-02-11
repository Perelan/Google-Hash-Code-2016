import java.util.*;

public class Warehouse
{

    private int[] list;
    private int column;
    private int row;
    private static int warehouse_id;

    public Warehouse(int row, int column, int[] prodList)
    {
        this.row = row;
        this.column = column;
        this.list = prodList;
        warehouse_id++;
    }

    /*Inser product in warehouse*/
    public void insert(Product product)
    {
        //list.add(product);
        //System.out.println(String.format("Product %s were inserted into %s", p.getProduct_id, warehouse_id));
    }

    public int getWarehouse_id(){
        return warehouse_id;
    }

    public int[] getList(){
        return list;
    }

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }
}//End class
