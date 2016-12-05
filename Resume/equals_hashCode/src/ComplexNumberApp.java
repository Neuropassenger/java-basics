/**
 * Created by turge on 006 06.10.16.
 */
public class ComplexNumberApp {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1.1, 10.2);
        ComplexNumber b = new ComplexNumber(10.2, 1.1);

        System.out.println("Хэш-код a: " + a.hashCode());
        System.out.println("Хэш-код b: " + b.hashCode());

        System.out.println("Комплексные числа " + (a.equals(b) ? "равны" : "не равны") + ".");
    }
}

