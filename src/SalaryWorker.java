public class SalaryWorker extends Worker
{

    Double annualSalary;

    @Override
    public String toString()
    {
        return "SalaryWorker{" +
                super.toString() +
                "annualSalary=" + annualSalary +
                '}';
    }

    public SalaryWorker(String ID, String fName, String lName, String title, Integer YOB, Double hourlyPayRate, Double annualSalary)
    {
        super(ID, fName, lName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public Double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    @Override
    public Double calculateWeeklyPay(double hoursWorked)
    {

        return annualSalary / 52;

    }

    @Override
    public String displayWeeklyPay(double hoursWorked)
    {

        return annualSalary / 52 + " is the pay for 1 week with the annual salary of: " + annualSalary;

    }
}
