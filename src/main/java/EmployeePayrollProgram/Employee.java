package EmployeePayrollProgram;

public class Employee extends PersonEmployeePayroll
{

	public Employee()
	{
		super();
		setEmployedType(EmployedType.EMPLOYEES);
	}
	
	public float calculatePay()
	{
		float pay = 0;
		int hours = getNumberHoursWorked();
		float rate = getHourlyRate();
		
		if (hours > 40)
			{
				int overtimeHours = hours - 40;
				pay = (40 *rate) +(overtimeHours * rate *1.5f);
			}
		else
			{
				pay = hours * rate;	
			}
		return pay;
	}
	public void printType()
	{
		System.out.println(getEmployedType());
	}
	
}
