/**
 * Created by turge on 026 26.09.16.
 */
public class main {
    public static void main(String[] args) {
        boolean test = booleanExpression(false,  false, true, true);

        System.out.println(test);
    }

    /**
     * Метод возвращает true тогда и только тогда, когда истинны любые 2 параметра
     */
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean stock[] = new boolean[4];
        stock[0] = a;
        stock[1] = b;
        stock[2] = c;
        stock[3] = d;

        int count = 0;

        for (int i = 0; i < 4; i++) {
            if(stock[i] == true)
                count++;
        }

        if(count == 2)
            return true;
        else
            return false;
    }
}
