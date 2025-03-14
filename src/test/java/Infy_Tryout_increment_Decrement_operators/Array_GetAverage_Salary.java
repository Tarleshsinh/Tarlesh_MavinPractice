package Infy_Tryout_increment_Decrement_operators;


public class Array_GetAverage_Salary
{

    public static void main(String[] args) {
        // Array of employee salaries
        double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

        // Variables to calculate total salary and average salary
        double totalSalary = 0;
        double averageSalary;
        int greaterCount = 0;
        int lesserCount = 0;

        // Calculate total salary
        for (double s : salary) {
            totalSalary += s;
            System.out.println(totalSalary);
        }

        // Calculate average salary
        averageSalary = totalSalary / salary.length;
        System.out.println("This is Total Salary " + totalSalary);
        // Count employees with salaries greater and lesser than average
        for (double s : salary) {
            if (s > averageSalary) {
                greaterCount++;
            } else {
                lesserCount++;
            }
        }

        // Print the results
        System.out.println("The average salary of the employee is: " + averageSalary);
        System.out.println("The number of employees having salary greater than the average is: " + greaterCount);
        System.out.println("The number of employees having salary lesser than the average is: " + lesserCount);
    }
}