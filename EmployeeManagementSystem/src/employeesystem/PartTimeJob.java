package employeesystem;

public class PartTimeJob extends Employee {
	private static final double HOURLY_WAGE = 59.0;
	private int partTimeHoursWorked;
	
	public PartTimeJob(String name, int partTimeHoursWorked) {
		super(name);
		this.partTimeHoursWorked = partTimeHoursWorked;
	}
	@Override
	public double JpartTimeCalculation() {
		// TODO Auto-generated method stub
		return HOURLY_WAGE * partTimeHoursWorked;
	}
	@Override
	public double MpartTimeCalculation() {
		// TODO Auto-generated method stub
		return HOURLY_WAGE * partTimeHoursWorked;
	}
	@Override
	public double JsalaryCalculation() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double MsalaryCalculation() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double SsalaryCalculation() {
		// TODO Auto-generated method stub
		return 0;
	}

}
