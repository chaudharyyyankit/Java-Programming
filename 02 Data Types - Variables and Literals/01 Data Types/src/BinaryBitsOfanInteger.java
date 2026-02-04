/**
 * BinaryBitsOfanInteger class demonstrates how to convert an integer to its binary representation.
 * 
 * This class provides a simple example of converting a decimal integer value to its equivalent
 * binary string representation using Java's built-in Integer utility method.
 * 
 * <p>
 * <b>Key Concepts:</b>
 * <ul>
 *   <li>Binary Representation: A number system using only two digits (0 and 1)</li>
 *   <li>Integer.toBinaryString(): Converts an integer to its binary string equivalent</li>
 * </ul>
 * </p>
 * 
 * <p>
 * <b>Example:</b><br>
 * The integer value 5 in decimal is represented as "101" in binary because:
 * <br>5 = (1 × 2²) + (0 × 2¹) + (1 × 2⁰) = 4 + 0 + 1
 * </p>
 * 
 * <p>
 * <b>Usage:</b><br>
 * Run the main method to see the binary representation of the integer 5 printed to the console.
 * </p>
 * 
 * @author Ankit
 * @version 1.0
 * @see Integer#toBinaryString(int)
 */
public class BinaryBitsOfanInteger {
    static void main(String[] args) {
        int x = 5;  //101

        System.out.println(Integer.toBinaryString(x));  //101
    }
}
