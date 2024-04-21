
public class Product{
    protected int productid;
    protected String name;
    protected float price;
   
   public Product(int productid, String name, float price){
       this.productid=Math.abs(productid);
       this.name=name;
       this.price=Math.abs(price);
   } 

    public void setProductid(int productid) {
        this.productid = Math.abs(productid);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }

    public int getProductid() {
        return productid;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    } 
}
 class ElectronicProduct extends Product{
    protected String brand;
    protected int warrantyPeriod;
    public ElectronicProduct(int productId, String name, float price, String brand, int warrantyPeriod) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod =Math.abs(warrantyPeriod) ;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod =Math.abs(warrantyPeriod);
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }   
}
   class ClothingProduct extends Product{
          protected String size,fabric;
          public ClothingProduct(int productid, String name, float price, String size, String fabric){
              super(productid, name, price);
              this.fabric=fabric;
              this.size=size;
          }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
          

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }     
      }
 class bookProduct extends Product{
      protected String author,publisher;
      public bookProduct(int productid, String name, float price,String author,String publisher){
          super(productid, name, price);
          this.author=author;
          this.publisher=publisher;
      }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
      
  }
