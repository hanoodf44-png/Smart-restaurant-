
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {
    public static void main(String[] args) {
        final double drink_price = 15.50;
        final double student_Discount = 0.10;
        final double senior_Discount = 0.05;
        final double tip_rate = 0.10;

        Scanner pro = new Scanner(System.in);

        System.out.println("Enter customers name:");
        String name = pro.nextLine();

        System.out.println("Enter customers age:");
        int age = pro.nextInt();

        System.out.println("Enter price of the meal:");
        double price = pro.nextDouble();

        System.out.println("Enter number of drinks ordered:");
        int drinks = pro.nextInt();

        System.out.println("Is the customer a student?(true/false):");
        boolean student = pro.nextBoolean();

        System.out.println("Enter service rating from 1 to 5:");
        int rating = pro.nextInt();

        if (rating < 1 || rating > 5) {
            System.out.println("Error: Service rating must be between 1 and 5!");
        } else {
            double drinkscost = drinks * drink_price;
            double subtotal = price + drinkscost;

            double discountrate;
            if (student) {
                discountrate = student_Discount;
            } else if (age >= 60) {
                discountrate = senior_Discount;
            } else {
                discountrate = 0;
            }

            double discount = subtotal * discountrate;
            double afterdiscount = subtotal - discount;
            double tip;
            
            if (rating == 4 || rating == 5) {
                tip = afterdiscount * tip_rate;
            } else {
                tip = 0;
            }

            double finalbill = afterdiscount + tip;
            int wholebill = (int) finalbill;

            System.out.println();
            System.out.println("==========SMART RESTAURANT==========");
            System.out.println("Customer: " + name);
            System.out.printf("Meal: $%.2f%n", price);
            System.out.printf("Drinks: $%.2f%n", drinkscost);
            System.out.printf("Discount: $%.2f%n", discount);
            System.out.printf("Tip: $%.2f%n", tip);
            System.out.printf("Final bill: $%.2f%n", finalbill);
            System.out.println("Whole amount: $" + wholebill);
            System.out.println("====================================");
        }
        
    }
}    
        
       
    

