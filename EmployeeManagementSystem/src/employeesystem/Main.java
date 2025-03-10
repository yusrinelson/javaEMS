package employeesystem;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in); //scanner is used for user input
			Employee employee = null;
			
			System.out.println("Hi, Welcome to the Employee Management System, where you can track your income this month.");
			System.out.println("Enter your full name: ");
			String name = scanner.nextLine();

			System.out.println("Select Your Employee Type: \n1.Full-Time \n2.Part-Time");
			int option = scanner.nextInt();
			scanner.nextLine();

			//if you select Full-time you get to choose your position
			if (option == 1) {
				System.out.println("Select Your Position: \n1.Junior Developer \n2.Mid Developer  \n3.Senior Developer");
				int value = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Enter hours worked: ");
				int hoursWorked = scanner.nextInt();

				//throws error if negative value are input
				if (hoursWorked < 0) {
					throw new ArithmeticException("You cannot work for negative hours");
				}
				
				//function calculates the salary of the position you selected
				if (value == 1) {
					employee = new FullTimeJob(name, hoursWorked);//initialise FullTimeJob to calculate the salary
					System.out.println(name + " Your Salary for this month is: R" + employee.JsalaryCalculation());
				} else if (value == 2) {
					employee = new FullTimeJob(name, hoursWorked);
					System.out.println(name + " Your Salary for this month is: R" + employee.MsalaryCalculation());
				} else if (value == 3) {
					employee = new FullTimeJob(name, hoursWorked);
					System.out.println(name + " Your Salary for this month is: R" + employee.SsalaryCalculation());
				} else {
					System.out.println("Invalid choice. Please select the options available");
					return;
				}

			} else if (option == 2) { //function calculates the salary of the Part time you selected
				System.out.println("Enter hours worked: ");
				int partTimeHoursWorked = scanner.nextInt();

				if (partTimeHoursWorked < 0) {
					throw new ArithmeticException("You cannot work for negative hours");
				}

				employee = new PartTimeJob(name, partTimeHoursWorked);
				System.out.println(name + " Your Salary for this month is: R" + employee.MpartTimeCalculation());
			} else {
				System.out.println("Invalid choice. Please select the options available");
				return;
			}

			employee.userDetails();//displays text from parent class
			scanner.close(); //closes the scanner object

		} catch (ArithmeticException e) {
			System.out.println("Cannot add negative values" + e); //error message for negative values
		}
	}

}
