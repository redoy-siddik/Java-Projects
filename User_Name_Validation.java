import java.util.*;
public class User_Name_Validation {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // User name must be 4 to 12 characters long
        // User name must contain space or underscore

        String userName;
        System.out.print("Enter your new user name: ");
        userName = sc.nextLine();

        if(userName.length() < 4 || userName.length() >12)
        {
            System.out.println("User name must be between 4 to 12 characters!");
        }
        else if(userName.contains(" ") || userName.contains("_"))
        {
            System.out.println("User name must not contain space or underscore!");
        }
        else
        {
            System.out.println("Welcome " + userName);
        }

        sc.close();
    }
    
}
