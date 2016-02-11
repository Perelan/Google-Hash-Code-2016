class Product
{
      private static int product_id = -1;
      private int product_weight;
      private boolean delivery_status;

      public Product(int product_weight){
        this.product_weight = product_weight;
        product_id++;
      }

      public int getProduct_id(){
        return product_id;
      }

      public int getProduct_weight(){
        return product_weight;
      }

      public boolean getDeliveryStatus()
      {
          return delivery_status;
      }

      public void setDeliveryStatus(boolean status)
      {
          delivery_status = status;
      }
}
