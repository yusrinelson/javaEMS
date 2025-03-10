package employeesystem;

//this class is used to get inherited by sub classes
public class FullTimeJob extends Employee {
	//defining wages for each work position
	private static final double JUNIOR_HOURLY_WAGE = 112.0;
	private static final double MID_HOURLY_WAGE = 251.0;
	private static final double SENIOR_HOURLY_WAGE = 435.0;

	private int hoursWorked;
	
	public FullTimeJob(String name, int hoursWorked) {
		super(name);
		this.hoursWorked = hoursWorked;
	}
	
	//logic to calculate the salary of employees 
	@Override
	public double JsalaryCalculation() {
		// TODO Auto-generated method stub
		return JUNIOR_HOURLY_WAGE * hoursWorked;
	}
	@Override
	public double MsalaryCalculation() {
		// TODO Auto-generated method stub
		return MID_HOURLY_WAGE * hoursWorked;
	}
	@Override
	public double SsalaryCalculation() {
		// TODO Auto-generated method stub
		return SENIOR_HOURLY_WAGE * hoursWorked;
	}


	@Override
	public double JpartTimeCalculation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double MpartTimeCalculation() {
		// TODO Auto-generated method stub
		return 0;
	}

}
