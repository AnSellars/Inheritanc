import java.util.ArrayList;
import java.util.Objects;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        ArrayList<Worker> workerList = new ArrayList<>();
        Worker Tom = new Worker("0001", "Tom", "Carol", "Sir.", 2004, 16.5);
        workerList.add(0,Tom);
        Worker Jeff = new Worker("0002", "Jeffery", "Thompson", "Mr.", 1989, 17.0);
        workerList.add(1,Jeff);
        Worker Billy = new Worker("0003", "Billy", "Clarkson", "Mr.", 2000, 15.25);
        workerList.add(2,Billy);

        SalaryWorker Cole = new SalaryWorker("0004", "Cole", "Rhea", "Mr.", 2004, 0.0, 82885.0);
        workerList.add(3,Cole);
        SalaryWorker Rick = new SalaryWorker("0005", "Richard", "Nolde", "Mr.", 1988, 0.0, 67852.0);
        workerList.add(4,Rick);
        SalaryWorker Greg = new SalaryWorker("0006", "Gregorio", "Delorosa", "Mr.", 1990, 0.0, 55829.0);
        workerList.add(5,Greg);


        for (Worker worker : workerList) {
            System.out.printf("\n%-20s%5s%10s", worker.calculateWeeklyPay(40), "  |  ", worker.getFormalName());
        }
        System.out.printf("\n----------------------------------------------");
        for (int i = 0; i < workerList.size(); i++)
        {
            System.out.printf("\n%-20s%5s%10s",workerList.get(i).calculateWeeklyPay(50),"  |  ",workerList.get(i).getFormalName());
        }
        System.out.printf("\n----------------------------------------------");
        for (int i = 0; i < workerList.size(); i++)
        {
            System.out.printf("\n%-20s%5s%10s",workerList.get(i).calculateWeeklyPay(40),"  |  ",workerList.get(i).getFormalName());
        }
        System.out.printf("\n----------------------------------------------");

        System.out.println(Tom);
    }
}
