import java.io.File;
import java.util.Arrays;

/**
 * Created by turge on 007 07.10.16.
 */
public class Tester {
    public static <T> T getFirstValue(T[] array) {
        return array[0];
    }

    public static void main(String[] args) throws Exception {
        Long[] a = {1L, 2L};
        long b = Tester.getFirstValue(a);


    }
}
