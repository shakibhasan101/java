
package getinput;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;
        String name;
        System.out.print("Write your name:");
        name =input.nextLine();
        System.out.println("Welcome "+name);
        System.out.print("Enter your age:");
        number = input.nextInt();
        System.out.println("Your age is "+number);
        
        

    }
}
