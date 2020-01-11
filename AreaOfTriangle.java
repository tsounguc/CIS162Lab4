import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Write a description of class AreaOfTriangel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AreaOfTriangle
{
    public static void main(String [] args)
    {
        int a, b, c;
        double s, area;
        
        
        Scanner scnr = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println("Enter Side A: ");
        a = scnr.nextInt();
        System.out.println("Enter Side B: ");
        b = scnr.nextInt();
        System.out.println("Enter Side C: ");
        c = scnr.nextInt();
        
        s = (a + b + c)/ 2.0;
        
        area = Math.sqrt( s*(s-a) * (s-b) * (s-c));
        
        System.out.println("The area of the triangle is: " + fmt.format(area));
        
        
    }
}
