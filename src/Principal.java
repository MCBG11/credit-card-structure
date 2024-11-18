import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.println("Write card limit: ");
        double limit = reading.nextDouble();
        CreditCard card = new CreditCard(limit); // this "card" is the main variable for the CreditCard class

        int out = 1;
        while (out != 0){
            System.out.println("write any item to shop: ");
            String description = reading.next();

            System.out.println("write the value of the item: " );
            double price = reading.nextDouble();

            Products product = new Products(description, price);
            boolean purchaseMade = card.placeOrder(product);

            if (purchaseMade){
                System.out.println("Purchase made");
                System.out.println("write 0 to quit or 1 to continue purchasing");
                out = reading.nextInt();
            } else {
                System.out.println("Insufficient balance");
                out = 0;
            }
            System.out.println("\n***********************");
            System.out.println("purchase made ");
            Collections.sort(card.getShoppingList());//orders the list according to price

            for (Products producto : card.getShoppingList()){
                System.out.println(producto.getDescription() + " - " +producto.getPrice());
            }
            System.out.println("\n***********************");
            System.out.println("\nCard's balance: " +card.getBalance());


        }

    }
}
