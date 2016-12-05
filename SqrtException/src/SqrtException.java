/**
 * Created by turge on 007 07.10.16.
 */
public class SqrtException {
    public static void main(String[] args) {
        System.out.println(sqrt(-4));
    }

    public static double sqrt(double x) {
        if(x < 0)
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        else
            return Math.sqrt(x);
    }
}
