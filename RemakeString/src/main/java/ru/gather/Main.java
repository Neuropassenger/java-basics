package ru.gather;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by turge on 010 10.10.16.
 */
public class Main {
    /* Идея с созданием класса буфера провалилась
    private static class Buffer {
        byte[] byteArray;
        int pos;

        Buffer() {
            byteArray = new byte[1];
            pos = 0;
        }

        public void addByte(byte value) {
            if(pos == byteArray.length) {
                byte[] temp = new byte[byteArray.length * 2];
                System.arraycopy(byteArray, 0, temp, 0, byteArray.length);
                byteArray = temp;
            }
            byteArray[pos++] = value;
        }

        public byte[] getByteArray() {
            return byteArray;
        }

        public int getSize() {
            return pos;
        }

        public void remake() {
            for(int i = 0; i < pos - 1; i++) {

                // Находим место вхождения /r/n
                if (byteArray[i] == 13 && byteArray[i+1] == 10) {

                    // Заменяем на /n
                    for(int j = i; j < pos - 1; j++) {
                        byteArray[j] = byteArray[j+1];
                    }
                    pos--;
                }
            }
        }
    }

    public static Buffer list = new Buffer();
    */
    public static void main(String[] args) {

    }

    public static void remakeStrings(InputStream in, OutputStream out) throws IOException {
        int buf, fub;
        int readBytes = 0;

        while ((buf = in.read()) != -1) {
            if (buf == 13) {
                if ((fub = in.read()) != -1) {
                    if (fub == 10)
                        out.write(fub);
                    else {
                        out.write(buf);
                        out.write(fub);
                    }
                } else
                    out.write(buf);
            } else
                out.write(buf);
        }
    }
}
