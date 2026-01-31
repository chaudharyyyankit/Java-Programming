import java.util.Scanner;

public class useRadix {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        s.useRadix(2);   //means binary number
        int x = s.nextInt();   //read binary number 101

        System.out.println(x);            //5
    }
}
