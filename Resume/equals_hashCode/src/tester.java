/**
 * Created by turge on 006 06.10.16.
 * Класс для тестирования и обучения
 */
public class tester {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(6, 10);
        //BlackBox object2 = object1;

        System.out.println(object1.equals(object2));
    }
}
