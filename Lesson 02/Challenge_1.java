import java.util.Scanner;

public class Challenge_1 {
 public static void main (String[] args) {
   //Setup Scanner
   Scanner userInput = new Scanner(System.in);
   
   //Ask user for name, weight, and age
   System.out.print("Welcome to the most accurate BMI calculator!\n\n");
   System.out.print("What is your name?:: ");
   String name = userInput.nextLine();
   System.out.print("What is your weight in pounds?:: ");
   double weight = userInput.nextDouble();
   System.out.print("What is your height in inches?:: ");
   double height = userInput.nextDouble();
   
   //User BMI
   System.out.print("Ok ");
   System.out.print(name);
   System.out.println(", your BMI is ");
   final double USMETRIC = 703;
   double BMI = (weight / height / height * USMETRIC);
   System.out.printf("%.2f",BMI);
   
   //Weight Class
    if (BMI > 18.5 && BMI < 24.9) {
		System.out.println("\nYour healthy!");
	} else if (BMI < 18.5) {
	  System.out.println("\nYour underweight!");
	} else {
	  System.out.println("\nYour overweight!");
  }
 }
}