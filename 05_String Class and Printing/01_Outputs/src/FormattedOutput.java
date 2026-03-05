public class FormattedOutput {
    static void main(String[] args) {
        int x = 10;
        float y = 12.25f;
        char c = 'a';
        /*
        %d for integer
        %f for float
        %c for char
        %s for string
        %o octal 12.25->12
        %x hexadecimal
        %e for exponential form or in 10 power
         */
        System.out.printf("Hello %d %f %c World", x,y,c);
    }
}
