package employeesystem;

public abstract class Employee {
protected String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public abstract double JsalaryCalculation();
	public abstract double MsalaryCalculation();
	public abstract double SsalaryCalculation();
	
	public abstract double JpartTimeCalculation();
	public abstract double MpartTimeCalculation();
	
	
	public void userDetails() {
		System.out.println("Thank you " + name + ", feel free to track your records again!");
	}
}
