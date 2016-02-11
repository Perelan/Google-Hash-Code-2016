class Product{
      private int product_id;
      private int product_weight;
      private boolean deliveryStatus;

      public Product(int product_id, int product_weight){
        this.product_id = product_id;
        this.product_weight = product_weight;
      }

      public int getProduct_id(){
        return product_id;
      }

      public int getProduct_weight(){
        return product_weight;
      }

      public boolean getDeliveryStatus()
      {
          return deliveryStatus;
      }

      public boolean setDeliveryStatus(boolean status)
      {
          deliveryStatus = status;
      }
}
