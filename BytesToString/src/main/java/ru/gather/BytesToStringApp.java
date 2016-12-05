package ru.gather;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Created by turge on 012 12.10.16.
 */
public class BytesToStringApp {
    public static void main(String[] args) {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        String result = "";
        int buf;

        while ((buf = reader.read()) != -1) {
            result += (char) buf;
        }

        return result;
    }
}
