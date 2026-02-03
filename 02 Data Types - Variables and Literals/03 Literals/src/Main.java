import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        System.out.println("Literals - Constant values used in a program");
        
        // Integer Literal: A fixed whole number value
        int value = 25;
        System.out.println("Integer Literal: " + value);

        // Character Literal: A single character enclosed in single quotes
        char c = 'A';
        System.out.println("Character Literal: " + c);
        
        // String Literal: A sequence of characters enclosed in double quotes
        String name = "JAVA";
        System.out.println("String Literal: " + name);

        // Float Literal: A decimal number with 'f' suffix (32-bit precision)
        float f = 67.7f;
        System.out.println("Float Literal: " + f);
        
        // Double Literal: A decimal number with high precision (64-bit, default)
        double d = 3.13456;
        System.out.println("Double Literal: " + d);

        // Long Literal: A large whole number with 'L' suffix
        long l = 7889988866L;
        System.out.println("Long Literal: " + l);
        
        // Long Literal with underscores: Improves readability (23 million)
        long M = 23_000L;
        System.out.println("Long with underscores: " + M);
    }
}
