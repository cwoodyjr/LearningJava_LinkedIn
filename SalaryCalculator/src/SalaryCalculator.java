
import java.util.Scanner;

public class SalaryCalculator {



    public static double salaryCalc (double hoursPerWeek,
                                     double hourlyRate){
        double weeklySalary = hoursPerWeek*hourlyRate;
        return weeklySalary*52;
    }
    public static void taxCalc (double annualSalary,
                                  double taxAllowance) {
        double taxAmount = annualSalary - taxAllowance;
        double afterTax = annualSalary-(taxAmount*0.20);
        System.out.println("Taxable Salary: "+taxAmount);
        System.out.println("Tax to Pay: "+taxAmount*0.20);
        System.out.println("Annual Salary After Tax: "+afterTax);
    }
    public static void holidayCalc(double hourlyRate,
                                   double annualSalary,
                                   double holidayDays){
        double hoursPerDay = 8;
        double totalHours = holidayDays*hoursPerDay;
        System.out.println("total holiday hours taken: "+totalHours);
        double holidayPayDeduction = hourlyRate*totalHours;
        System.out.println("Total pay to be deducted from salary: "+holidayPayDeduction);
        double salaryAfterHoliday = annualSalary-holidayPayDeduction;
        System.out.println("Your Salary after holiday deductions is: "+salaryAfterHoliday);
    }
    public static void main(String[] args) {
        System.out.print("enter amount of hours worked per week: ");
        Scanner reader = new Scanner(System.in);
        double input1 = reader.nextDouble();
//        System.out.println(" ");
        System.out.print("enter hourly rate: ");
        double input2 = reader.nextDouble();
//        System.out.println(" ");

        double annualSalary = salaryCalc(input1,input2);
        System.out.println("The Annual Salary is: "+annualSalary);
        System.out.print("Would you like to work out your tax?: ");
        String answer = reader.next().toLowerCase().trim();
        if (answer.equals("yes")) {
            System.out.print("What's your tax allowance?: ");
            double taxAllowance = reader.nextDouble();
            taxCalc(annualSalary, taxAllowance);
        }
        System.out.println("Enter the amount of holiday days you took: ");
        double holidayDays = reader.nextDouble();
        if (holidayDays>0){
            holidayCalc(input2,annualSalary,holidayDays);
        }else{
            System.out.println("You didn't take any holiday.");
        }


    }


}
