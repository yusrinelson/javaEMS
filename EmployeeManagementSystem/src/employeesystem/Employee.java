package employeesystem;

public abstract class Employee {
protected String name;
	
	//intialize the name of employees
	public Employee(String name) {
		this.name = name;
	}
	
	//function that get defined in sub classes
	public abstract double JsalaryCalculation();
	public abstract double MsalaryCalculation();
	public abstract double SsalaryCalculation();
	
	public abstract double JpartTimeCalculation();
	public abstract double MpartTimeCalculation();
	
	
	public void userDetails() {
		System.out.println("Thank you " + name + ", feel free to track your records again!");
	}
}
