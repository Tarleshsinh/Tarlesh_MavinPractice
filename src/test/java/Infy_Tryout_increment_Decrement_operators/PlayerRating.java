package Infy_Tryout_increment_Decrement_operators;

class PlayerRating {
    private String playerName;
    private String playerPosition;
    private double averageRating;
    private String category;

    // Constructor to initialize player details
    public PlayerRating(String playerName, String playerPosition) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
    }

    // Method to calculate average rating (Overloaded for 2 critics)
    public void calculateAverageRating(double criticOneRating, double criticTwoRating) {
        this.averageRating = (criticOneRating + criticTwoRating) / 2;
        determineCategory();
    }

    // Method to calculate average rating (Overloaded for 3 critics)
    public void calculateAverageRating(double criticOneRating, double criticTwoRating, double criticThreeRating) {
        this.averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
        determineCategory();
    }

    // Method to determine the category based on average rating
    private void determineCategory() {
        if (averageRating >= 8) {
            this.category = "A";
        } else if (averageRating >= 5 && averageRating < 8) {
            this.category = "B";
        } else {
            this.category = "C";
        }
    }

    // Method to display player details
    public void displayDetails() {
        System.out.println("The player name is " + playerName);
        System.out.println("The player position is " + playerPosition);
        System.out.println("The average rating is " + averageRating);
        System.out.println("The category is " + category);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        // Test case 1: Ratings from 2 critics
        PlayerRating player1 = new PlayerRating("Beckham", "Midfielder");
        player1.calculateAverageRating(10.0, 10.0);
        player1.displayDetails();

        // Test case 2: Ratings from 3 critics
        PlayerRating player2 = new PlayerRating("Oscar", "Striker");
        player2.calculateAverageRating(20, 20, 20);
        player2.displayDetails();
    }
}
