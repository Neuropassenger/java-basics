import java.util.function.DoubleUnaryOperator;

/**
 * Created by turge on 006 06.10.16.
 * Реализуйте метод, выполняющий численное интегрирование заданной функции на
 * заданном интервале по формуле левых прямоугольников.
 */
public class Integrate {
    public static void main(String[] args) {
        System.out.println(integrate(x -> x + 2, 0, 10));
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double s = 0;
        int n = 1_000_000; // точность
        double h = (b - a) / n;
        for(int i = 0; i < n; i++) {
            s += f.applyAsDouble(a + h * (i + 0.5));
        }
        return s * h;
    }
}
