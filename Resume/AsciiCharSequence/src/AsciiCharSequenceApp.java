/**
 * Created by turge on 006 06.10.16.
 */
public class AsciiCharSequenceApp {
    public static void main(String[] args) {
        byte[] oleg = {79, 108, 101, 103, 33};
        AsciiCharSequence seq = new AsciiCharSequence(oleg);

        System.out.println("length() = " + seq.length());
        System.out.println("toString() = " + seq.toString());
        System.out.println("subSequence(2, 5) = " + seq.subSequence(1, 5).toString());
        System.out.println("charAt(3) = " + seq.charAt(4));
    }
}
