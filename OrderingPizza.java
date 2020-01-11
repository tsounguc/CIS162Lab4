import java.util.Scanner; 
import java.text.NumberFormat;
/**
 * Write a description of class OrderingPizza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderingPizza
{
     public static void main(String [] args)
     {
         int pizzaNum;
         double subTotal, Total;
         final double price = 9.99;
         Scanner scnr = new Scanner(System.in);
         NumberFormat numb = NumberFormat.getCurrencyInstance();
         
         System.out.print("How many pizzas? ");
         pizzaNum = scnr.nextInt();
         subTotal = pizzaNum * price;
         Total = subTotal + (subTotal * 0.06);
         
         System.out.print("\nSub Total: " + numb.format(subTotal));
         System.out.print("\nTotal Due: " + numb.format(Total));
     }
}
