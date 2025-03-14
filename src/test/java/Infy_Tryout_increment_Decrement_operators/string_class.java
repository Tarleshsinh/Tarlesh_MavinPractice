package Infy_Tryout_increment_Decrement_operators;

public class string_class {

    public static void main(String[] args) {
        
        // Declaring two string literals with the same value
        String s1 = "Infosys";
        String s2 = "Infosys";
        
        // '==' compares the references (memory location) of the two objects
        // Since both 's1' and 's2' refer to the same string literal in the string pool, this will be 'true'
        System.out.println(s1 == s2);  // true
        
        // 'equals()' compares the actual content of the strings
        // Both 's1' and 's2' have the same content "Infosys", so this will also be 'true'
        System.out.println(s1.equals(s2));  // true
        
        String s3 = "Limited";
        
        // '==' compares the references (memory location)
        // 's1' and 's3' are different objects referring to different string literals, 
        // so the reference comparison is 'false'
        System.out.println(s1 == s3);  // false
        
        // 'equals()' compares the content of the strings
        // 's1' is "Infosys" and 's3' is "Limited", so the content comparison is 'false'
        System.out.println(s1.equals(s3));  // false
        
        // Declaring a new string object using 'new' keyword
        String s4 = new String("Infosys");
        
        // '==' compares the references (memory location)
        // 's1' is a string literal pointing to the string pool, while 's4' is a new object created with 'new'
        // Since they are different objects in memory, the reference comparison is 'false'
        System.out.println(s1 == s4);  // false
        
        // 'equals()' compares the content of the strings
        // 's1' and 's4' have the same content "Infosys", so the content comparison is 'true'
        System.out.println(s1.equals(s4));  // true
        
        // Declaring another string object using 'new' keyword
        String s5 = new String("Infosys");
        
        // '==' compares the references (memory location)
        // 's1' refers to the string literal in the pool, while 's5' is a new object created with 'new'
        // Since they are different objects, the reference comparison is 'false'
        System.out.println(s1 == s5);  // false
        
        // 'equals()' compares the content of the strings
        // Both 's1' and 's5' have the same content "Infosys", so the content comparison is 'true'
        System.out.println(s1.equals(s5));  // true
    }
}
