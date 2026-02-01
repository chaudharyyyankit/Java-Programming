public class Main {
    static void main(String[] args) {
        //variables are name given to some data
        //RULES to DECLARE VARIABLE NAMES
        /*
        1. Variables are case-sensitive NAME != name
        2. Contains Alphabets, numbers, or _, $
        3. can start only with alphabet, _ or $
        4. should not have keyword
        5. Not use built in class names
        6. Can not contain space follow camel Cases
         */

        //1.
        String name = "Ankit";
        String NAME = "Anki";
        String Name = "Anku";

        System.out.println(name);  //Ankit
        System.out.println(NAME);  //Anki
        System.out.println(Name);   //Anku

        //2.
        int _a = 5;
        int $b = 10;
        System.out.println(_a+$b);   //15

        //3.
        //int 5a= 10; //not allowed can not start with number or any special character except _ and $

        //4.
        //int float = 5;      //float is reserved cant be used as a variable name
        //int break  = 10;


        byte b = 5;           // -128 to 127    //byte is data type b is variable name
        //b = 129;           //out of range and will be treated as int and byte cant store int
        System.out.println(b);

        int x, y, sum;        //declaration
        x = 20;
        y = 10;
        sum = x + y;
        System.out.println(sum);

        short s = 123;

        char c = 'A';

        float f = 1.6f;
        long l = 178L;
        double d = 1.677d;

        System.out.println(l);

    }
}
