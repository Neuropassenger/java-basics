package ru.gather;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by turge on 018 18.10.16.
 */
public class MainTest {
    @org.junit.Test
    public void reverseEvenNumbers() throws Exception {
        int[] inputValues = {1, 2, 3, 4, 5, 6, 7};
        int[] exValues = {6, 4, 2};

        // int[] >>> byte[]
        ByteBuffer byteBuffer = ByteBuffer.allocate(inputValues.length * 4);
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        intBuffer.put(inputValues);

        ByteArrayInputStream bIn = new ByteArrayInputStream(byteBuffer.array());
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();

        Main testedClass = new Main();
        testedClass.reverseEvenNumbers(bIn, bOut);

        // int[] >>> byte[]
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(exValues.length * 4);
        IntBuffer intBuffer1 = byteBuffer1.asIntBuffer();
        intBuffer1.put(exValues);

        assertEquals(Arrays.toString(byteBuffer1.array()), Arrays.toString(bOut.toByteArray()));
    }
}