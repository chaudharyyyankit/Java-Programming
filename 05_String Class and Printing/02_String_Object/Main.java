public class Main {
    static void main(String[] args) {
        String str = "Java Program"; //created in pool of literals (String Constants)
        System.out.println(str);

        //USING CONSTRUCTORS
        //1. String(char[])
        //2. String(byte[])
        //3. String(string)

        char[] c = {'A', 'B', 'C', 'D'};
        String str1 = new String(c);
        //                 |
        //            Constructor
        //A constructor is a method that has sane name as class Name
        System.out.println(str1); //ABCD

        byte[] b = {65, 66, 67, 68, 69, 97};
        String str2 = new String(b);
        System.out.println(str2); //ABCDE as ASCII 65=A and so on also 97=a

        String str3 = new String("JAVA"); //Here we are creating a new string and as well giving a string literal
        System.out.println(str3);

        //INTERESTING THINGS
        String name1 = "Ankit";  //obj is created
        String name2 = "Ankit"; //as already exists java will not create another same obj
        // name1 points Ankit so does name2
    }
}
