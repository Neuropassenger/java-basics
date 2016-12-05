package ru.gather;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by turge on 013 13.10.16.
 */
public class MainTest {
    @Test
    public void sumOfRealNumbers() throws Exception {
        String text = "Строка текста с 1 целыми числом и 2 вещественнами: 3,2 5,4\n";
        String exString = "11,600000";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(text.getBytes("UTF-8"));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Main main = new Main();

        PrintStream myStream = new PrintStream(outputStream);

        main.sumOfRealNumbers(inputStream, myStream);

        assertEquals(exString, outputStream.toString());
    }

}