package EmployeePayrollProgram;

public class PersonEmployeePayroll 
{

    private String name;
    private float hourlyRate;
    private int numberHoursWorked;
    private EmployedType employedType;   
    private float totalEarned = 0;

    public enum EmployedType 
    {
        CONTRACTORS,
        EMPLOYEES,
        SALARYEMPLOYEES
    }

    
    public PersonEmployeePayroll() { }

    public PersonEmployeePayroll(String name, float hourlyRate, int numberHoursWorked,
                                 EmployedType employedType, float totalEarned) 
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
        this.employedType = employedType;
        this.totalEarned = totalEarned;
    }

    
    
    public float getTotalEarned() 
    {
        return totalEarned;
    }

    public void setTotalEarned(float totalEarned) 
    {
        this.totalEarned = totalEarned;
    }

    public String getName() 
    {
        return name;
    }
    
    public float getHourlyRate() 
    {
        return hourlyRate;
    }
    
    public void setHourlyRate(float hourlyRate)
    {
    	this.hourlyRate = hourlyRate;
    }

    public int getNumberHoursWorked() 
    {
        return numberHoursWorked;
    }
    
    public void setNumberHoursWorked(int numberHoursWorked)
    {
    	this.numberHoursWorked = numberHoursWorked;
    }

    public EmployedType getEmployedType() 
    {      //  return the enum type
        return employedType;
    }

    public void setEmployedType(EmployedType employedType) 
    {  
        this.employedType = employedType;
    }

	public float calculatePay()
	{

		return 0;
	}
	
	public static void main(String[] args) 
	{

        PersonEmployeePayroll[] workers = 
        	{
            new Contractors(),
            new Employee(),
            new SalaryEmployee()
        };

        // Contractor: paid all hours worked
        workers[0].setHourlyRate(50);
        workers[0].setNumberHoursWorked(45);

        // Hourly Employee with overtime
        workers[1].setHourlyRate(20);
        workers[1].setNumberHoursWorked(45);

        // Salary Employee (always 40 hrs)
        workers[2].setHourlyRate(30);

        System.out.println("=== Payroll Report ===");

        for (PersonEmployeePayroll p : workers) 
        	{
            float pay = p.calculatePay();
            System.out.println(p.getEmployedType() + " earned: $" + pay);
        }
    }
}

