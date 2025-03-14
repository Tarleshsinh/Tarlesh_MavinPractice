package Infy_Tryout_increment_Decrement_operators;

public class Arrays {

    // Declare an integer array of size 5
    private int[] marks = new int[15];

    // Method to store marks for 5 subjects
    public void storeMarks(int[] inputMarks) {
        if (inputMarks.length == 15) {
            for (int i = 0; i < 15; i++) {
                marks[i] = inputMarks[i];
            }
        } else {
            System.out.println("Invalid input: Array size should be 5.");
        }
    }

    // Method to display the marks using an enhanced for loop
    public void displayMarks() {
        System.out.println("Marks of the 5 subjects are:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Arrays student = new Arrays();

        // Example marks for 5 subjects
        int[] subjectMarks = {85, 90, 78, 92, 88,1,2,3,4,5,6,7,8,9,10};

        // Store marks in the array
        student.storeMarks(subjectMarks);
        

        // Display the marks
        student.displayMarks();
    }
}
