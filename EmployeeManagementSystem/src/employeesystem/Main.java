package employeesystem;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			Employee employee = null;
			
			System.out.println("Hi, Welcome to the Employee Management System, where you can track your income this month.");
			System.out.println("Enter your full name: ");
			String name = scanner.nextLine();

			System.out.println("Select Your Employee Type: 1.Full-Time | 2.Part-Time");
			int option = scanner.nextInt();
			scanner.nextLine();

			if (option == 1) {
				System.out.println("Select Your Position: 1.Junior Developer | 2.Mid Developer | 3.Senior Developer");
				int value = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Enter hours worked: ");
				int hoursWorked = scanner.nextInt();

				if (hoursWorked < 0) {
					throw new ArithmeticException("You cannot work for negative hours");
				}

				if (value == 1) {
					employee = new FullTimeJob(name, hoursWorked);
					System.out.println(name + " Your Salary for this month is: " + employee.JsalaryCalculation());
				} else if (value == 2) {
					employee = new FullTimeJob(name, hoursWorked);
					System.out.println(name + " Your Salary for this month is: " + employee.MsalaryCalculation());
				} else if (value == 3) {
					employee = new FullTimeJob(name, hoursWorked);
					System.out.println(name + " Your Salary for this month is: " + employee.SsalaryCalculation());
				} else {
					System.out.println("Invalid choice. Please select the options available");
					return;
				}

			} else if (option == 2) {
				System.out.println("Enter hours worked: ");
				int partTimeHoursWorked = scanner.nextInt();

				if (partTimeHoursWorked < 0) {
					throw new ArithmeticException("You cannot work for negative hours");
				}

				employee = new PartTimeJob(name, partTimeHoursWorked);
				System.out.println(name + " Your Salary for this month is: " + employee.MpartTimeCalculation());
			} else {
				System.out.println("Invalid choice. Please select the options available");
				return;
			}

			employee.userDetails();
			scanner.close();

		} catch (ArithmeticException e) {
			System.out.println("Cannot add negative values" + e);
		}
	}

}
