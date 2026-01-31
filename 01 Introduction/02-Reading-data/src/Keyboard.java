
//Java Provides a class named Scanner present in util package, that is used for reading the data from different sources
//here in the program source is keyboard


import java.util.Scanner;

public class Keyboard {
    static void main(String[] args) {
        System.out.println("Reading Data from Keyboard");

        //Class ref.    constructor
        // ^     ^         ^
        Scanner s = new Scanner(System.in);

//        int a, b, c;
//        System.out.println("Enter two numbers: ");
//        a = s.nextInt();
//        b = s.nextInt();
//
//        c = a+b;
//        System.out.println("Sum of two numbers is " + c);

        //Reading a name
        String name;
        System.out.print("Enter your name :");
        name = s.next();                  //read only one word or will stop reading after a space use nextLine() to get multiple words as input
        System.out.println("Hi "+name);

        Boolean married = false;
        System.out.print("Are you Married? (true/false): ");
        married = s.nextBoolean();
        if(married)
            System.out.println("Why are you married! "+ name);
        else
            System.out.println("hmmm. Congratulations!");
    }
}



//Class Scanner as methods
/*
nextInt()       //to read integer values
nextFloat()     // to read float values
nextDouble()    // to read double values
next()          // reading string   JUST ONE WORD
nextLine()       //read multiple words
nextByte()
nextShort()
nextLong()
nextBoolean()


hasNextInt()   //return true or false whether next value coming from user is int or not
hasNextFloat()

 */

//to find methods available in a class
//javap java.util.Scanner
