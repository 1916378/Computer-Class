import java.util.Scanner;

public class Lab02_03 {
 public static void main (String[] args) {
   //Setup Scanner
   Scanner userInput = new Scanner(System.in);
   
   //Ask user for num1 and num2
   System.out.print("Welcome to the multiplication calculator!\n\n");
   System.out.print("What is your first number?:: ");
   int num1 = userInput.nextInt();
   System.out.print("What is your second number?:: ");
   int num2 = userInput.nextInt();
   
   //Answer to multiplication problem
   System.out.print("The answer is ");
   System.out.print(num1 * num2);
 }
}