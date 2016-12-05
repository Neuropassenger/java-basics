import java.util.Arrays;

/**
 * Created by turge on 002 02.10.16.
 * Программа выполняет сортировку двух массивов в один итоговый методом слияния
 * Алгоритм взят:
 * https://ru.wikibooks.org/wiki/%D0%A0%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8_%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D0%BE%D0%B2/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0/%D0%A1%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D0%B5%D0%BC#Java_.28.D0.A0.D0.B5.D0.BA.D1.83.D1.80.D1.81.D0.B8.D0.B2.D0.BD.D0.B0.D1.8F_.D0.B8_.D0.BD.D0.B5.D1.80.D0.B5.D0.BA.D1.83.D1.80.D1.81.D0.B8.D0.B2.D0.BD.D0.B0.D1.8F_.D1.80.D0.B5.D0.B0.D0.BB.D0.B8.D0.B7.D0.B0.D1.86.D0.B8.D0.B8.29
 */
public class main {
    public static void main(String[] args) {
        int[] arrA = {1, 4, 7, 20};
        int[] arrB = {6, 8, 15, 19};
        int[] result = merge(arrA, arrB);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] arrA, int[] arrB) {
        int lenA = arrA.length, lenB = arrB.length;
        int a = 0, b = 0, len = lenA + lenB; // a и b - счетчики в массивах
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (b < lenB && a < lenA) {
                if (arrA[a] > arrB[b])
                    result[i] = arrB[b++];
                else
                    result[i] = arrA[a++];
            }
            else if (b < lenB)
                result[i] = arrB[b++];
            else
                result[i] = arrA[a++];
        }
        return result;
    }
}
