package ru.gather;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

/**
 * Created by turge on 012 12.10.16.
 */
public class BytesToStringAppTest {
    @Test
    public void readAsString() throws Exception {
        byte[] bytes = {48, 49, 50, 51};
        String exResult = "0123";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        BytesToStringApp main = new BytesToStringApp();

        String acResult = main.readAsString(inputStream, StandardCharsets.US_ASCII);

        System.out.println("Expected ouput: " + exResult);
        System.out.println("Actual ouput: " + acResult);

        assertEquals(exResult, acResult);
    }

}