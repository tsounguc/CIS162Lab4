import java.util.Scanner;
import java.util.Random; 
/**
 * Write a description of class LoginName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoginName
{
    public static void main(String [] args)
    {
        String firstName, lastName, loginName;
        int randNum;
        int firstNum = 10; 
        int lastNum = 99;
        
        Scanner scnr = new Scanner(System.in);
        Random  generate = new Random();
        
        System.out.println("Hello user");
        System.out.print("Enter first name: ");
        firstName = scnr.nextLine();
        System.out.print("\nEnter last name: ");
        lastName = scnr.nextLine();
        randNum = generate.nextInt((lastNum - firstNum) + firstNum);
        loginName = lastName.substring(0,5) + firstName.substring(0,1) + randNum;
        
        System.out.println(loginName);
        
        
    }
}
