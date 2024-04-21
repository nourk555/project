import java.util.Scanner;
 class Cart{
        protected int customerId;
        protected int nProducts;
        protected Product[]products;
         int currentIndex = 0;
        public Cart(int customerId, int nProducts){
            this.customerId=Math.abs(customerId);
            this.nProducts=Math.abs(nProducts);
            this.products=new Product[nProducts];
        }
    public void setCustomerId(int customerId){
        this.customerId =Math.abs(customerId);
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public Product[] getProducts() {
        return products;
    }
    public void addProduct(Product product){
         if (currentIndex < nProducts) {
            products[currentIndex++] = product;
        } else {
            System.out.println("Cart is full. Cannot add more products.");
        }
    }
    public void removeProduct(Product product){
          for (int i = 0; i < nProducts; i++) {
            if (products[i].getProductid() == product.getProductid()){
                products[i] = products[nProducts - 1];
                products[--nProducts] = null;
                return;
            }
        }
        System.out.println("Product not found in cart!");
    }
    public double calculatePrice(){
     double total_price=0;
     for(int i=0;i<nProducts;i++){
         total_price+=products[i].getPrice();
     }
     return total_price;
   
    }
        public void Placeorder(int x){
           Scanner in = new Scanner(System.in);
          if(x==1){
                System.out.println("Order placed successfully");
          }
          else if(x==2){
                System.out.println("Order not placed");       
          }   
      } 
              }
      class Order {
    protected int customerId;
    protected int orderId;
    protected float totalPrice;
    protected Product[] products;
    public Order(int customerId,int orderId,float totalPrice,Product[] products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(1);
        this.totalPrice = Math.abs(totalPrice);
         this.products = products;
    }
    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + (i + 1) + ": " + products[i].getName() + " - $" + products[i].getPrice());
        }
        System.out.println("Total Price: $" + totalPrice);
        
    }
}


    
