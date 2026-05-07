package practiceProblem1.day3;


import java.util.Random;

class Employee{
    String name;
    String employeeId;
    int daysPresent;
    int partTimeDays;
    double totalWages;
    static final double WAGES_PER_HOUR = 20;
    static final double FULL_DAY_HOUR = 8;
    static final double PART_TIME_HOUR = 8;
    static final int TOTAL_WORKING_DAYS_PER_MONTH = 20;
    static final int TOTAL_HOURS_PER_MONTH = 100;

    Employee(String name, String employeeId){
        this.name = name;
        this.employeeId = employeeId;
        this.daysPresent = 0;
        this.partTimeDays = 0;
        this.totalWages = 0;
    }

    public double calculateWages(){
        int daysCount = 0;
        double workingHrs = 0;
        while(daysCount <= TOTAL_WORKING_DAYS_PER_MONTH && workingHrs <= TOTAL_HOURS_PER_MONTH){
            daysCount++;
            int attendance = (int)Math.floor(Math.random() * 10) %3;
            int empHrs = 0;
            switch (attendance){
                case 1:     //Full Day
                    daysPresent++;
                    empHrs = (int)FULL_DAY_HOUR;
                    break;
                case 2:     //Part time
                    partTimeDays++;
                    empHrs = (int)PART_TIME_HOUR;
                    break;
                default:
                    empHrs = 0;
            }
            workingHrs += empHrs;
        }
        totalWages = workingHrs * WAGES_PER_HOUR;
        return totalWages;
    }

    public void displayInformation(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Total Workings days of employee : "+daysPresent);
        System.out.println("Total days of working in Part-time: "+partTimeDays);
        System.out.println("Total wages of employee: "+totalWages);
    }
}
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM ON MASTER BRANCH");
        Employee emp1 = new Employee("Prabha","e1");
        emp1.calculateWages();
        emp1.displayInformation();

        Employee emp2 = new Employee("Kavin","e2");
        emp2.calculateWages();
        emp2.displayInformation();
        System.out.println();
    }
}
