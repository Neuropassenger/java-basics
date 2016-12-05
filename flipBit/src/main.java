/**
 * Created by turge on 002 02.10.16.
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Number is " + flipBit(2, 32));
    }

    public static int flipBit(int value, int bitIndex) {
        String binValue = Integer.toBinaryString(value);
        if(bitIndex > binValue.length()) {
            String expandBinValue = "";
            for(int i = 0; i < bitIndex - binValue.length(); i++)
                expandBinValue += '0';
            binValue = expandBinValue + binValue;
        }
        String changedBinValue = "";
        bitIndex = binValue.length() - bitIndex;
        for(int i = 0; i < binValue.length(); i++) {
            if(i == bitIndex) {
                if (binValue.charAt(i) == '0')
                    changedBinValue += '1';
                else
                    changedBinValue += '0';
            } else
                changedBinValue += binValue.charAt(i);
        }

        return Integer.parseInt(changedBinValue, 2);
    }
}
