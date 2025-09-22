import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {
        // task 1
        String name;
        int age;
        float height_in_meters;
        float weight_in_pounds;
        int jerseyNumber;

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

        // Print selected output unto the screen
        System.err.println(""); // using this to create a blank line between inputs and outputs
        System.out.println("Output for Task #1:");
        System.out.println("Player Name — " + name);
        System.out.println("Age — " + age);
        System.out.println("Height (in meters) — " + height_in_meters);
        System.out.println("Weight (in pounds) — " + weight_in_pounds);
        System.out.println("Jersey Number — " + jerseyNumber);

        // task 2
        System.out.println(""); // using this to create a blank line between outputs of different tasks
        final double pound = 0.45359237;
        final int meter = 100;

        int weight_in_kilos = (int) (weight_in_pounds * pound);
        float height_in_centimeters = height_in_meters * meter;

        System.out.println("Output for Task #2:");
        System.out.println("Player Name — " + name);
        System.out.println("Age — " + age);
        System.out.println("Height (in centimetres) — " + height_in_centimeters + "cm");
        System.out.println("Weight (in kilograms) — " + weight_in_kilos + "kg");
        System.out.println("Jersey Number — " + jerseyNumber);

        // task 3
        System.out.println(""); // using this to create a blank line between outputs of different tasks
        System.out.println("Output for Task #3:");
        System.out.println("Right now " + name + " is " + age);
        System.out.println("At the end of this season, " + name + " will be " + ++age);
        System.out.println("Original jersey number was " + jerseyNumber);
        System.out.println("Due to a penalty, the jersey number is now " + --jerseyNumber);

        // task 4
        System.out.println(""); // using this to create a blank line between outputs of different tasks
        System.out.println("Output for Task #4:");
        boolean eligibility = age >= 18 && age <= 35 && weight_in_kilos < 90;
        // and
        if (eligibility) {
            System.out.println("Eligible");
            System.out.println(name + " is ELIGIBLE to play");
        } else {
            System.out.println("Not ELIGIBLE");
            System.out.println(name + " is not ELIGIBLE to play");
        }

        // or
        if (age < 18 || weight_in_kilos >= 90) {
            System.out.println("Player has a problem (either too young or too heavy)");
        }

        // not
        if (!eligibility) {
            System.out.println("Not ELIGIBLE");
            System.out.println(name + " is not ELIGIBLE to play");
        } else {
            System.out.println("Eligible");
            System.out.println(name + " is ELIGIBLE to play");
        }

        // task 5
        System.out.println(""); // using this to create a blank line between outputs of different tasks
        System.out.println("Output for Task #5:");
        if (age < 20) {
            System.out.println("Player is a rising star");
        } else if (age <= 30) {
            System.out.println("Player is a prime player");
        } else {
            System.out.println("Player is a veteran");
        }

        // task 6
        System.out.println(""); // using this to create a blank line between outputs of different tasks
        System.out.print("Coach, please enter a jersey number: ");
        int jerseyNumberToCheck = input.nextInt();
        System.out.println("Output for Task #6:");
        switch (jerseyNumberToCheck) {
            case 1:
                System.out.println("Player is a Goalkeeper");
                break;
            case 2:
                System.out.println("Player is a Defender");
                break;
            case 5:
                System.out.println("Player is a Defender");
                break;
            case 6:
                System.out.println("Player is a midfielder");
                break;
            case 8:
                System.out.println("Player is a midfielder");
                break;
            case 7:
                System.out.println("Player is a winger");
                break;
            case 9:
                System.out.println("Player is a striker");
                break;
            case 10:
                System.out.println("Player is a playmaker");
                break;
            case 11:
                System.out.println("Player is a winger");
                break;
            default:
                System.out.println("Player position is not known");
        }

        // task 7
        System.out.println(""); // using this to create a blank line between outputs of different tasks
        System.out.println("Output for Task #7:");
        System.out.print("Coach, please enter a jersey number: ");
        jerseyNumberToCheck = input.nextInt();
        // PART A: The unwanted behaviour in this part has been commented out. Only Part
        // B code runs.
        // switch (jerseyNumberToCheck) {
        // case 1:
        // System.out.println("Player is a Goalkeeper");
        // break;
        // case 2:
        // System.out.println("Player is a Defender");
        // case 5:
        // System.out.println("Player is a Defender");
        // break;
        // case 6:
        // System.out.println("Player is a midfielder");
        // case 8:
        // System.out.println("Player is a midfielder");
        // break;
        // case 7:
        // System.out.println("Player is a winger");
        // case 9:
        // System.out.println("Player is a striker");
        // break;
        // case 10:
        // System.out.println("Player is a playmaker");
        // break;
        // case 11:
        // System.out.println("Player is a winger");
        // break;
        // default:
        // System.out.println("Player position is not known");
        // }
        // PART B:
        switch (jerseyNumberToCheck) {
            case 1:
                System.out.println("Player is a Goalkeeper");
                break;
            case 2, 5:
                System.out.println("Player is a Defender");
                break;
            case 6, 8:
                System.out.println("Player is a midfielder");
                break;
            case 7, 11:
                System.out.println("Player is a winger");
                break;
            case 9:
                System.out.println("Player is a striker");
                break;
            case 10:
                System.out.println("Player is a playmaker");
                break;
            default:
                System.out.println("Player position is not known");
        }

        // task 8
        System.out.println(""); // using this to create a blank line between outputs of different tasks
        System.out.println("Output for Task #8:");
        boolean primePlayer = age >= 20 && age <= 30;
        boolean weightBelowEighty = weight_in_kilos < 80;
        if (primePlayer) {
            if (weightBelowEighty) {
                System.out.println(name + " is in the starting lineup");
            } else {
                System.out.println(name + " is not in the starting lineup");
            }
        } else {
            System.out.println(name + " is not in the starting lineup");
        }

        // task 9
        System.out.println(""); // using this to create a blank line between outputs of different tasks
        System.out.println("Output for Task #9:");
        String finalDecision = eligibility ? "Play" : "Rest"; // eligibility is from task 4
        System.out.println(finalDecision);

        // finally close the scanner (Task 10 is in the adjacent file
        // CombinedPlayerPicker.java)
        input.close();
    }
}