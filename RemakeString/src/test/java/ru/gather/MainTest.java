package ru.gather;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by turge on 010 10.10.16.
 */
public class MainTest {
    @Test
    public void remakeStrings() throws Exception {
        byte[] inputBytes = {65, 13, 10, 10, 13};
        byte[] outputBytes = {65, 10, 10, 13};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(inputBytes);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Main.remakeStrings(inputStream, outputStream);

        assertEquals(Arrays.toString(outputBytes), Arrays.toString(outputStream.toByteArray()));
    }
}