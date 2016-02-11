import java.util.ArrayList;

public class Order
{
    private ArrayList<Product> products;
    private int column;
    private int row;
    private boolean isDelivered;

    /*Constructor*/
    public Order()
    {
        products = new ArrayList<Product>();
    }

    public boolean makeOrder(int row, int col)
    {
        column = col;
        this.row = row;
        isDelivered = false; 
    }
    /*Add item to order*/
    public boolean addItem(Product productItem)
    {
        return products.add(productItem);
    }

    /*Return column*/
    public int getColumn()
    {
        return column;
    }

    /*Get row*/
    public int getRow()
    {
        return row;
    }






    /**
    Each   order   specifies   the   product   items   purchased   by   the   customer.   The   product   items   in   an   order   can   be   of
    one or multiple product types and can contain multiple product items of the same product type.

    Each   order   specifies   the   cell   in   the   grid   where   the   product   items   have   to   be   delivered.   It   is   possible   to   have
    multiple orders with the same delivery cell. No order has the delivery cell that is a location of a warehouse.

    The   order   is   considered   fulfilled   when   all   of   the   ordered   product   items   are   delivered.   Individual   product
    items   can   be   delivered   in   multiple   steps,   in   any   order.   It   is   valid   to   deliver   the   individual   product   items   of   an
    order using multiple drones, including using different drones at the very same time.

    It   is   guaranteed   that   for   each   product   type,   the   total   number   of   product   items   in   all   orders   is   ​
    not   greater
    than the total availability of product items of this product type in all warehouses.

    It is ​
    not​
 required to deliver all orders (see the Scoring section at the end).
    */
}
