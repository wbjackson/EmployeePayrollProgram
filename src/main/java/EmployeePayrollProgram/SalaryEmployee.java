package EmployeePayrollProgram;

public class SalaryEmployee extends PersonEmployeePayroll
{

    public SalaryEmployee() 
    {
        super();
        setEmployedType(EmployedType.SALARYEMPLOYEES);
    }

    @Override
    public float calculatePay() 
    {
        float pay = 40 * getHourlyRate();  // Always paid for 40 hours
        setTotalEarned(pay);
        return pay;
    }

    public void printType() {
        System.out.println(getEmployedType());
    }

}
