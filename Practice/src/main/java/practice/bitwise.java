
package practice;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class bitwise {
    public static void main(String[] args)
    {
        int a;
        Scanner input = new Scanner (System.in);
        
        
       System.out.print("Enter a number:");
        a = input.nextInt();
        int b = a>>2;
        int c = a<<2;
        System.out.println("Right Shift"+b);
        System.out.println("Left Shift"+c);
    }
    
}
