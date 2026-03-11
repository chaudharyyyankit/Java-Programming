public class StringMethods {
    static void main() {

        String str = "Java"; // JAVA literal Obj is created in pool not in heap

        //1. Length
        int l = str.length(); //returns length of string here it is 4
        System.out.println("Length of string is "+ l); //4

        //2. toLowerCase
        System.out.println(str.toLowerCase()); //java

        System.out.println(str); //Java //see the og not changed String Objects are immutable (not changeable) so another one is created in above line

        //3. toUpperCase
        System.out.println(str.toUpperCase());  //JAVA //new one is created the og remains as it is

        //4. trim
        String str1 = "   Java   "; //it has leading and tailing white spaces
        System.out.println(str1);
        System.out.println(str1.trim()); //will remove those white spaces

        //5. substring(index)
        String str2 = "welcome";
        //             0123456
        // .substring takes starting index and creates another string obj that starts from that index to the end of the og string
        System.out.println(str2.substring(3)); //come

        // if we give both beginning and ending string then the substring obj out of og string is created
        System.out.println(str2.substring(3, 6)); //com //the last index is not included

        //6 .replace(char old, char new)
        System.out.println(str2.replace('o', 'u')); //welcume //dont try to create substring (3,6) //it will be com :) strings are immutable we have to create another one but we haven't created here

        //7. boolean startsWith()
        String website = "http://www.yetidigitallabs.com";
        System.out.println(website.startsWith("https")); //false

        //8. boolean endsWith()
        System.out.println(website.endsWith(".com")); //true we can differentiate .org, .gov or anything

        //9. charAt(index)
        System.out.println(website.charAt(0)); //h

        //10. indexOf(char in string)  //first
        System.out.println(website.indexOf('.')); //10

        //11. lastIndexOf()
        System.out.println(website.lastIndexOf('w')); //9
    }
}