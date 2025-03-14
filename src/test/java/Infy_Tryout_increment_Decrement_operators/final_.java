package Infy_Tryout_increment_Decrement_operators;

class StudentInfo {
    private int stipend;
    private int studentId;
    private int aggregateMarks;

    // Getter and Setter for studentId
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter for aggregateMarks
    public int getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    // Getter for stipend
    public int getStipend() {
        return stipend;
    }

    // Method to calculate total stipend
    public double calculateTotalStipend() {
        if (aggregateMarks >= 85 && aggregateMarks <= 90) {
            stipend = 10; // Bonus stipend amount
        } else if (aggregateMarks > 90 && aggregateMarks <= 95) {
            stipend = 15; // Bonus stipend amount
        } else if (aggregateMarks > 95) {
            stipend = 20; // Bonus stipend amount
        } else {
            stipend = 0; // No bonus stipend
        }
        return stipend;
    }
}

public class final_ {
    public static void main(String[] args) {
        // Create the first student object
        StudentInfo student1 = new StudentInfo();
        student1.setStudentId(1212);
        student1.setAggregateMarks(91);

        // Calculate total stipend for the first student
        double totalStipend1 = student1.calculateTotalStipend();
        System.out.println("The final stipend of student " + student1.getStudentId() + " is $" + totalStipend1);

        // Create the second student object
        StudentInfo student2 = new StudentInfo();
        student2.setStudentId(1233);
        student2.setAggregateMarks(96);

        // Calculate total stipend for the second student
        double totalStipend2 = student2.calculateTotalStipend();
        System.out.println("The final stipend of student " + student2.getStudentId() + " is $" + totalStipend2);
    }
}
