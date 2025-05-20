import java.util.*;

public class Duce_Roller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberOfDice, total = 0;

        System.out.println("Welcome to the Dice Roller!");
        numberOfDice = enterNumber(sc);

        for(int i = 0; i < numberOfDice; i++) {
            int roll = random.nextInt(1, 7);
            printDie(roll);
            System.out.println("You roolled: " + roll);
            total += roll;
        }
        System.out.println("Total: " + total);
        sc.close();
    }
    public static int enterNumber(Scanner sc) {
        int number;
        System.out.print("Enter the number of dice to roll: ");
        number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Number of dice must be greater than 0.");
            return enterNumber(sc);
        }
        return number;
    }
    public static void printDie(int roll){
        // win+r -> charmap
        String dice1 = """
                  -------
                 |       |
                 |   ●   |
                 |       |
                  -------
                """;
        String dice2 = """
                  -------
                 | ●     |
                 |       |
                 |     ● |
                  -------
                """;
        String dice3 = """
                  -------
                 | ●     |
                 |   ●   |
                 |     ● |
                  -------
                """;
        String dice4 = """
                  -------
                 | ●   ● |
                 |       |
                 | ●   ● |
                  -------
                """;
        String dice5 = """
                  -------
                 | ●   ● |
                 |   ●   |
                 | ●   ● |
                  -------
                """;
        String dice6 = """
                  -------
                 | ●   ● |
                 | ●   ● |
                 | ●   ● |
                  -------
                """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll.");
        }
    }
}