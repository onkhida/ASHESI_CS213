import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {
        // task 1
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Height: ");
        float height = input.nextFloat();
        System.out.print("Weight: ");
        float weight = input.nextFloat();
        System.out.print("Jersey Number: ");
        int jerseyNumber = input.nextInt();

        // task 2
        System.out.println("");
        final double pound = 0.45359237;
        final int meter = 100;

        int weight_in_kilos = (int) (weight * pound);
        float height_in_centimers = height * meter;

        System.out.println("Player details");
        System.out.println("Player Name — " + name);
        System.out.println("Age — " + age);
        System.out.println("Height in centimetres — " + height_in_centimers + "cm");
        System.out.println("Weight in kilograms — " + weight_in_kilos + "kg");
        System.out.println("Jersey Number — " + jerseyNumber);

        // task 3
        System.out.println("");
        System.out.println("Right now " + name + " is " + age);
        System.out.println("At the end of this season, " + name + " will be " + ++age);
        System.out.println("Original jersey number was " + jerseyNumber);
        System.out.println("Due to a penalty, the jersey number is now " + --jerseyNumber);

        // task 4
        System.out.println("");
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
        if (age < 18 || weight_in_kilos <= 90) {
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
        System.out.println("");
        if (age < 20) {
            System.out.println("Player is a rising star");
        } else if (age <= 30) {
            System.out.println("Player is a prime player");
        } else {
            System.out.println("Player is a veteran");
        }

        // task 6
        System.out.println("");
        switch (jerseyNumber) {
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
        System.out.println("");
        switch (jerseyNumber) {
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
        System.out.println("");
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
        System.out.println("");
        String finalDecision = age >= 18 && age <= 35 && weight_in_kilos < 90 ? "Play" : "Rest";
        System.out.println(finalDecision);
    }
}