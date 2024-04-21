import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the E-Commerce System!");
        ElectronicProduct e1 = new ElectronicProduct(1, "smartphone", 599.9f, "Samsung", 1);
        ClothingProduct c2 = new ClothingProduct(2,"T-shirt",19.99f,"Medium","cotton");
        bookProduct b1 = new bookProduct(3,"OPP", 39.99f,"Oreilly","X Publication");

        System.out.println("Please enter your id:");
        int customerId = in.nextInt();
        System.out.println("Please enter your name:");
        String name = in.next();
        System.out.println("Enter your address:");
        String address = in.next();
        Customer customer = new Customer(customerId, name, address);

        System.out.println("How many products would you like to add to your cart?");
        int nProducts = in.nextInt();
        Cart cart = new Cart(customerId, nProducts);
        for (int i = 0; i < nProducts; i++) {
            System.out.println("Which product would you like to add? \t 1-smartphone 2-T-Shirt  3-OOP");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    cart.addProduct(e1);
                    break;
                case 2:
                    cart.addProduct(c2);
                    break;
                case 3:
                    cart.addProduct(b1);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }    
        
        System.out.println("would you like to placeorder?\t 1-YES  2-NO");
        int x = in.nextInt();
        cart.Placeorder(x);
        float totalPrice= (float) cart.calculatePrice();
        System.out.println("Total price in the cart: $" +totalPrice);
        int orderId=1;
       Order o1 = new Order(customerId, orderId, totalPrice, cart.getProducts());
       if(x==1){
                  o1.printOrderInfo();
 }
       else if(x==2){
           System.out.println("Order not placed"); 
       }
    }    
}
