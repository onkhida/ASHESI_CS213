import java.util.Scanner;

public class CombinedPlayerPicker {
    public static void main(String[] args) {
        // task 1
        String name;
        int age;
        float height_in_meters;
        float weight_in_pounds;
        int jerseyNumber;
        String position;
        boolean attackingJersey;
        boolean eligibility;
        boolean inStartingLineup;

        final double pound = 0.45359237;
        final int meter = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Age: ");
        age = input.nextInt();

        System.out.print("Height (in meters): ");
        height_in_meters = input.nextFloat();

        System.out.print("Weight (in pounds): ");
        weight_in_pounds = input.nextFloat();

        System.out.print("Jersey Number: ");
        jerseyNumber = input.nextInt();

        int weight_in_kilos = (int) (weight_in_pounds * pound);
        float height_in_centimeters = height_in_meters * meter;

        // Determine player position based on jersey number
        switch (jerseyNumber) {
            case 1:
                position = "Goalkeeper";
                attackingJersey = false;
                break;
            case 2, 3, 4, 5:
                position = "Defender";
                attackingJersey = false;
                break;
            case 6, 8:
                position = "Midfielder";
                attackingJersey = true;
                break;
            case 7, 11:
                position = "Winger";
                attackingJersey = true;
                break;
            case 9:
                position = "Striker";
                attackingJersey = true;
                break;
            case 10:
                position = "Playmaker";
                attackingJersey = true;
                break;
            default:
                position = "Unknown. We can only predict for jersey numbers 1-11";
                attackingJersey = false;
        }

        // Check eligibility
        eligibility = age >= 18 && age <= 35 && weight_in_kilos < 90;

        // Check if player is in starting lineup
        boolean primePlayer = age >= 20 && age <= 30;
        inStartingLineup = primePlayer && weight_in_kilos < 80;

        // Print player information
        System.out.println(""); // using this to create a blank line between inputs and outputs
        System.out.println("Player Information:");
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height_in_centimeters + "cm");
        System.out.println("Weight: " + weight_in_kilos + "kg");
        System.out.println("Jersey Number: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacking Jersey: " + (attackingJersey ? "Yes" : "No"));
        System.out.println("Eligibility: " + (eligibility ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + (inStartingLineup ? "In Lineup" : "On Bench"));
        System.out.println("Final Decision: " + (eligibility ? "Play" : "Rest"));

        input.close();
    }
}
