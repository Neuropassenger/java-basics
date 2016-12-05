/**
 * Created by turge on 006 06.10.16.
 * Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов
 * (их коды влезают в один байт) в массиве byte. По сравнению с классом String, хранящим каждый символ как char,
 * AsciiCharSequence будет занимать в два раза меньше памяти.
 */
public class AsciiCharSequence implements java.lang.CharSequence {
    byte[] sequence;

    AsciiCharSequence(byte[] sequence) {
        this.sequence = new byte[sequence.length];
        System.arraycopy(sequence, 0, this.sequence, 0, sequence.length);
    }

    @Override
    public int length() {
        return sequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) sequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subS = new byte[end - start];
        System.arraycopy(sequence, start, subS, 0, end - start);
        return new AsciiCharSequence(subS);
    }

    public String toString() {
        StringBuilder string = new StringBuilder("");
        for(int i = 0; i < sequence.length; i++)
            string.append((char)sequence[i]);
        return string.toString();
    }
}
