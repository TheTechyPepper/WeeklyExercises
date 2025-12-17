package week5_and_6.Section13;

import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the quantity of the product: ");
        double quantity = sc.nextDouble();


        if(quantity > 0) {
            System.out.println("Enter the location of the customer (USA/Canada/Other):");

            sc.nextLine();
            String location = sc.nextLine();
            double price = 0.0;

            if(location.equals("USA")) {
                if(quantity >= 100) {
                    price = 2.00;
                } else {
                    price = 2.50;
                }
            }else if(location.equals("Canada")) {
                if(quantity >= 100) {
                    price = 2.50;
                } else {
                    price = 3.00;
                }
            }else if(location.equals("Other")) {
                if(quantity >= 100) {
                    price = 3.00;
                } else {
                    price = 3.50;
                }
            }else {
                System.out.println("Invalid location");
                return;
            }
            price *=quantity;
            System.out.printf("The total cost of the product is: $%.1f", price);
        }else {
            System.out.println("Quantity cannot be 0 or less");

        }
    }
}