import java.util.*;

public class Warehouse {

    private ArrayList<Product> list;
    private int warehouse_id;

    public Warehouse(int warehouse_id){
        this.warehouse_id = warehouse_id;
        list = new ArrayList<>();
    }

    public void insert(Product p){
        list.add(p);
        //System.out.println(String.format("Product %s were inserted into %s", p.getProduct_id, warehouse_id));
    }
}
