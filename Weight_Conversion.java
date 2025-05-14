import java.util.*;
class Weight_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //WEIGHT CONVERSION PROGRAM

        //Declare variables
        double weight, newWeight;
        int choice;

        //welcome message
        System.out.println("Welcome to the Weight Conversion Program!");
        System.out.println("1. Convert pounds to kilograms (lbs to kg)");
        System.out.println("2. Convert kilograms to pounds (kg to lbs)");

        //prompt user for input
        System.out.print("Select an option (1 or 2): ");
        choice = sc.nextInt();

        //option 1 convert pounds to kilograms (lbs to kg)
        if(choice == 1){
            System.out.print("Enter weight in pounds (lbs): ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight (%.2f lbs) in kilogram is: %.2f kg\n",weight,newWeight);
        }
        //option 2 convert kilograms to pounds (kg to lbs)
        else if(choice == 2){
            System.out.print("Enter weight in kilograms (kg): ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The weight (%.2f kg) in pounds is: %.2f lbs\n",weight,newWeight);
        }
        //else print error message
        else{
            System.out.println("Invalid choice! Please try again.");
        }
        sc.close();
    }
}