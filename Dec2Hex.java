// Imports Java Scanner to read user input
import java.util.Scanner;

// Class Declaration
class Dec2Hex
{
    // Global Variable Declaration for integer Arg1
    public static int Arg1;

    // Main class
    public static void main(String args[])
    {
        // If statement to check if the value of args is greater than 0
        if (args.length > 0) 
        {
            // Try/Catch encapsulement to prevent errors
            try 
            {
                Arg1 = Integer.parseInt(args[0]);
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        else if (args.length == 0)
        {
            System.err.println("Please enter a decimal number!");
            System.exit(1);
        }

        // Char declaration as an array with values
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         int rem, num;
         
         num = Arg1;
         
         String hexadecimal=""; 

         System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        // While num doesn't equal 0 then the loop will continue
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        // Prints the result in a Hexadecimal format
        System.out.println("Hexadecimal representation is : " + hexadecimal);

    }
}
