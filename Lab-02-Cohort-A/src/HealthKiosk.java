import java.util.Scanner;

public class HealthKiosk {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.141866;
		System.out.println("P: Pharmacy");
		System.out.println("L: Lab");
		System.out.println("T: Triage");
		System.out.println("C: Counseling");
		System.out.println("----------------");
		System.out.print("Enter a service code (P/L/T/C): ");
		String serviceCodeStr = input.next().toLowerCase();
		char serviceCode = serviceCodeStr.charAt(0);
		char metric = '0';

		long metricVal = 0;

		switch (serviceCode) {
			case 'p':
				System.out.println("Go to Pharmacy Desk");
				break;
			case 'l':
				System.out.println("Go to Lab Desk");
				break;
			case 't':
				System.out.println("Go to Triage Desk");
				System.out.println("1: BMI Calculation");
				System.out.println("2: Dosage round-up");
				System.out.println("3: Trig Helper");
				System.out.println("----------------");
				System.out.print("Enter a health metric (1/2/3): ");
				metric = input.next().charAt(0);

				switch (metric) {
					case '1':
						System.out.print("Please enter your weight in kilograms: ");
						double weight = input.nextDouble();
						System.out.print("Please enter your height in meters: ");
						double height = input.nextDouble();
						double bmi = weight / Math.pow(height, 2);
						System.out.println(weight);
						System.out.println(height);
						System.out.println(bmi);
						double calculatedBMI = Math.round(bmi * 10) / 10.0;

						metricVal = Math.round(calculatedBMI);

						if (calculatedBMI < 18.5) {
							System.out.printf("Your BMI was %.1f, which makes you underweight%n", calculatedBMI);
						} else if (calculatedBMI < 24.9) {
							System.out.printf("Your BMI was %.1f, which makes you normal%n", calculatedBMI);
						} else if (calculatedBMI < 29.9) {
							System.out.printf("Your BMI was %.1f, which makes you overweight%n", calculatedBMI);
						} else {
							System.out.printf("Your BMI was %.1f, which makes you obese%n", calculatedBMI);
						}
						break;
					case '2':
						System.out.print("Please enter the required dosage: ");
						double dosage = input.nextDouble();
						int tablets = (int) Math.ceil(dosage / 250);
						System.out.println(tablets);
						System.out.printf("%.1f (mg) of the drug gives you %d tablets%n", dosage, tablets);
						metricVal = tablets;
						break;
					case '3':
						System.out.print("Please enter your angle in degrees: ");
						double degreeAngle = input.nextDouble();
						double radiansAngle = degreeAngle * PI / 180.0;
						double sinAngle = Math.round(Math.sin(radiansAngle) * 1000) / 1000.0;
						double cosAngle = Math.round(Math.cos(radiansAngle) * 1000) / 1000.0;

						System.out.printf("The sin value of your angle is %.3f and the cos value is %.3f%n", sinAngle,
								cosAngle);
						metricVal = Math.round(sinAngle * 100);
						break;
					default:
						System.out.println("Invalid metric");
						break;
				}
				break;
			case 'c':
				System.out.println("Go to Counseling Desk");
				break;
			default:
				System.out.println("Invalid service code");
				break;
		}

		System.out.println("");
		System.out.println("Moving to Task 3");
		System.out.println("------------------");
		char randomChar = (char) ('A' + (int) (Math.random() * 26));
		int randomNumber1 = 3 + (int) (Math.random() * 7);
		int randomNumber2 = 3 + (int) (Math.random() * 7);
		int randomNumber3 = 3 + (int) (Math.random() * 7);
		int randomNumber4 = 3 + (int) (Math.random() * 7);

		String fullID = "" + randomChar + randomNumber1 + randomNumber2 + randomNumber3 + randomNumber4;

		// fullID = "A3290"; // using an incorrect ID for testing

		System.out.println("Random ID is: " + fullID);

		if (fullID.length() == 5) {
			if (Character.isLetter(fullID.charAt(0))) {

				if (Character.isDigit(fullID.charAt(1)) && Character.isDigit(fullID.charAt(2))
						&& Character.isDigit(fullID.charAt(3)) && Character.isDigit(fullID.charAt(4))) {
					if ((fullID.charAt(1) >= '3' && fullID.charAt(1) <= '9')
							&& (fullID.charAt(2) >= '3' && fullID.charAt(2) <= '9')
							&& (fullID.charAt(3) >= '3' && fullID.charAt(3) <= '9')
							&& (fullID.charAt(4) >= '3' && fullID.charAt(4) <= '9')) {
						System.out.println("Valid ID :)");
					} else {
						System.out.println(
								"Incorrect formatting. The digits of each of the last 4 digits must be between 3 and 9");
					}

				} else {
					System.out.println("Incorrect formatting. Last 4 letters need to be digits");
				}

			} else {
				System.out.println("Incorrect formatting. First character must be a letter");
			}
		} else {
			System.out.println("ID needs to be 5 characters long.");
		}

		System.out.println("");

		System.out.println("Moving to Task 4");
		System.out.println("------------------");
		System.out.print("Please enter your first name: ");
		String fName = input.next().toUpperCase();
		char firstLetter = fName.charAt(0);
		char shiftedLetter = (char) ('A' + (firstLetter - 'A' + 2) % 26);
		String lastTwoChars = "" + randomNumber3 + randomNumber4;
		String finalCode = metricVal != 0 ? shiftedLetter + lastTwoChars + "-" + metricVal
				: shiftedLetter + lastTwoChars;
		System.out.println("Display code: " + finalCode);

		System.out.println("Moving to Task 5");
		System.out.println("------------------");

		switch (serviceCode) {
			case 'p':
				System.out.printf("PHARMACY | ID=%s | Code=%s%n", fullID, finalCode);
				break;
			case 't':
				switch (metric) {
					case '1':
						System.out.printf("TRIAGE | ID=%s | | BMI=%s | Code=%s%n", fullID, metricVal, finalCode);
						break;
					case '2':
						System.out.printf("TRIAGE | ID=%s | | TABLETS=%s | Code=%s%n", fullID, metricVal, finalCode);
						break;
					case '3':
						System.out.printf("TRIAGE | ID=%s | | SIN=%s | Code=%s%n", fullID, metricVal, finalCode);
						break;
					default:
						System.out.println("Invalid metric");
						break;
				}
				break;
			case 'l':
				System.out.printf("LAB | ID=%s | Code=%s%n", fullID, finalCode);
				break;
			case 'c':
				System.out.printf("COUNSELING | ID=%s | Code=%s%n", fullID, finalCode);
				break;
		}
	}
}
