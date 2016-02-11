import java.util.ArrayList;

public class Order
{
    private ArrayList<Product> products;
    private int column;
    private int row;
    private boolean isDelivered;
    private static int order_id;

    /*Constructor*/
    public Order()
    {
        products = new ArrayList<Product>();
        order_id++;
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

    /*Size of order*/
    public int orderSize()
    {
        return products.size();
    }

    public void isDelivered(boolean status)
    {
        isDelivered = status;
    }

    public boolean getDeliveryStatus()
    {
        return isDelivered;
    }
}//End class
