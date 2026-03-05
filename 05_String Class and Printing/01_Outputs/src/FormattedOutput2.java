public class FormattedOutput2 {
    static void main(String[] args) {
        int a = 10;

        System.out.printf("%5d", a);
                         // |
            //              5 is width 10 will print in 5 places
        //___10

        System.out.printf("%05d", a);
        //                  |
        //                  flag(fill empty places with zero)       //00010
    }
}
