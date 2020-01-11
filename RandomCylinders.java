import java.util.Random;
import java.text.DecimalFormat;
/**
 * Write a description of class RandomCylinders here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomCylinders
{
    public static void main(String [] args)
    {
        int firstNum, lastNum, range, radius, height;
        double volume, area;
        firstNum = 1;
        lastNum = 11;
        range = (lastNum - firstNum) + firstNum;
        
        Random generate = new Random();
        DecimalFormat fmt = new DecimalFormat("0.#");
        
        radius = generate.nextInt(range);
        height = generate.nextInt(range);
        volume = Math.PI * Math.pow(radius,2) * height;
        area = 2 * Math.PI * radius * height;
        
        System.out.println("Cylinder Information");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + fmt.format(volume));
        System.out.println( "Surface Area: " + fmt.format(area)); 
    }
}
