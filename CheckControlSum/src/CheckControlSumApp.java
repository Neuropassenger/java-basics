/**
 * Created by turge on 009 09.10.16.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by meanmail on 30.09.2016.
 * https://vk.com/meanmail
 */
public class CheckControlSumApp {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        // Paste your a code here
        int buf;
        int cSum = 0;
        while ((buf = inputStream.read()) != -1) {
            cSum = Integer.rotateLeft(cSum, 1) ^ buf;
        }
        return cSum;
    }

    private static byte[] testSet1 = new byte[]{10, 20, 30, 50, 1, 125};
    private static byte[] testSet2 = new byte[]{111, -45, 0, -2, 58, -1};
    private static byte[] testSet3 = new byte[]{0, 0, 0, 0, 0, 0};
    private static byte[] testSet4 = new byte[]{-1, -1, -1, -1, -1, -1};
    private static byte[] testSet5 = new byte[]{0x33, 0x45, 0x01};
    private static byte[] testSet6 = new byte[]{};
    private static byte[] testSet7 = new byte[]{-1};

    public static void main(String[] args) throws IOException {

        System.out.println(checkSumOfStream(new ByteArrayInputStream(testSet1)));
        System.out.println(checkSumOfStream(new ByteArrayInputStream(testSet2)));
        System.out.println(checkSumOfStream(new ByteArrayInputStream(testSet4)));
        System.out.println(checkSumOfStream(new ByteArrayInputStream(testSet5)));
        System.out.println(checkSumOfStream(new ByteArrayInputStream(testSet6)));
        System.out.println(checkSumOfStream(new ByteArrayInputStream(testSet7)));
    }
}
