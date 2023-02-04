/*
 * Class :CMSC203
 * Instructor: Dr. Monshi
 * Description: Uses command-line to debug a WiFi issue using a series of questions.
 * Due: 1/31/2023
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Name: Alex Tseng
 */

// One zip folder contains java file + word document
// Other zip folder contains java file again, AlexTseng_Assignment1_MOSS.zip
// remember to remove the package header on the code

import java.util.Scanner;

public class WifiDiagnosis {
	
	public static void main(String[] args) {
		
		// create Scanner and String object
		Scanner key = new Scanner(System.in);
		String answer;
		
		// header text
		System.out.println("If you have a problem with internet connectivity "
				+ "this WiFi Diagnosis might work.\n");
	
		// get input for answer
		System.out.println("Reboot the computer and try to connect\n"
				+ "Did that fix the problem? (Yes or No)");
		answer = key.nextLine();
		
		// sequential questions for the user
		if (answer.equals("yes")) {
			System.out.print("\nDone");
		}
		else if (answer.equals("no")) { // ask new question
			System.out.println("Reboot the router and try to connect\n"
					+ "Did that fix the problem? (Yes or No)");
			answer = key.nextLine();
			
			if (answer.equals("yes")) {
				System.out.print("\nDone");
			}
			else if (answer.equals("no")) { // ask new question
				System.out.println("Make sure the cables connecting the router are "
						+ "firmly plugged in and power is getting to the router\n"
						+ "Did that fix the problem? (Yes or No)");
				answer = key.nextLine();
				
				if (answer.equals("yes")) {
					System.out.print("\nDone");
				}
				else if (answer.equals("no")) { // ask new question
					System.out.println("Move the computer closer to the router and try to connect\n"
							+ "Did that fix the problem? (Yes or No)");
					answer = key.nextLine();
					
					if (answer.equals("yes")) {
						System.out.print("\nDone");
					}
					else if (answer.equals("no")) { // ask new question
						System.out.println("Contact your ISP");
					}
					else {
						System.out.print("\nInvalid answer; try again"); // catch errors
					}
				}
				else {
					System.out.print("\nInvalid answer; try again"); // catch errors
				}
			}
			else {
				System.out.print("\nInvalid answer; try again"); // catch errors
			}
		}
		else {
			System.out.print("\nInvalid answer; try again"); // catch errors
		}
		
		// terminate program
		System.out.print("\nProgrammer: Alex Tseng");
		System.exit(0);
	}
}
