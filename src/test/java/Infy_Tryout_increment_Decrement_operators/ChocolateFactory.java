package Infy_Tryout_increment_Decrement_operators;
// this class is about sealed class it is used to stop inheretence unless its ermitted 
public class ChocolateFactory {

    // Base class that uses sealed
    public sealed static class BaseChocolate permits BaseWhiteChocolate, DarkChocolate, MilkChocolate {
        public void display() {
            System.out.println("This is a chocolate.");
        }
    }

    // BaseWhiteChocolate class
    public final static class BaseWhiteChocolate extends BaseChocolate {
        @Override
        public void display() {
            System.out.println("This is white chocolate.");
        }
    }

    // DarkChocolate class with a further subclass
    public sealed static class DarkChocolate extends BaseChocolate permits CocoaPowder {
        @Override
        public void display() {
            System.out.println("This is dark chocolate.");
        }
    }

    // CocoaPowder subclass of DarkChocolate
    public final static class CocoaPowder extends DarkChocolate {
        @Override
        public void display() {
            System.out.println("This is cocoa powder derived from dark chocolate.");
        }
    }

    // MilkChocolate class that cannot be extended
    public final static class MilkChocolate extends BaseChocolate {
        @Override
        public void display() {
            System.out.println("This is milk chocolate.");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating objects of specific chocolate types
        BaseChocolate whiteChoco = new BaseWhiteChocolate();
        whiteChoco.display();

        // Cannot directly instantiate DarkChocolate, so we instantiate CocoaPowder (permitted subclass of DarkChocolate)
        BaseChocolate darkChoco = new CocoaPowder();
        darkChoco.display();

        BaseChocolate cocoa = new CocoaPowder();
        cocoa.display();

        BaseChocolate milkChoco = new MilkChocolate();
        milkChoco.display();
    }
}
