// Here's my second attempt at this.  I tried creating a separate class
// with the reverser as a method, but got hung up on errors that I 
// couldn't resolve.  Here it is:

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
        String str,rev;
       
        // Creates new scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.println("Enter a number and I'll reverse it:");
        
        // Wait for user to enter number        
        str = input.nextLine();

        // Define reversed value of user input
        rev = new StringBuffer(str).reverse().toString();
        
        // Print reversed number
        System.out.println("The reversed number is: " + rev);
    }
}
    

