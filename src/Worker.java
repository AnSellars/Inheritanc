import java.sql.SQLOutput;

public class Worker extends Person
{
    Double hourlyPayRate;

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    public Worker(String ID, String fName, String lName, String title, Integer YOB, Double hourlyPayRate)
    {
        super(ID, fName, lName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(Double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    public Double calculateWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40)
        {
            return (40 * hourlyPayRate) + ((hoursWorked - 40) * hourlyPayRate * 1.5);
        }
        else
        {
            return hoursWorked * hourlyPayRate;
        }

    }

    public String displayWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40)
        {
            return
            "Hours of regular pay: 40\n" +
            "Total from regular pay:" + (40 * hourlyPayRate) + "\n" +
            "Hours of overtime pay: " + (hoursWorked - 40) + "\n" +
            "Total from overtime pay:" + (40 * hourlyPayRate * 1.5) + "\n" +
            "Combined total: " + (40 * hourlyPayRate) + ((hoursWorked - 40) * hourlyPayRate * 1.5);


        }
        else
        {
            return
            "Hours of regular pay: " + hoursWorked + "\n" +
            "Total from regular pay: " + (hoursWorked * hourlyPayRate) + "\n" +
            "Hours of overtime pay: 0\n" +
            "Total from overtime pay: 0\n" +
            "Combined total: " + (hoursWorked * hourlyPayRate);


        }
    }
}
