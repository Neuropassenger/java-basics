import java.math.BigInteger;

/**
 * Created by turge on 002 02.10.16.
 */
public class main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 2; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
