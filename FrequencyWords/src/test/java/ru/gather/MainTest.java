package ru.gather;

import java.nio.charset.StandardCharsets;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by turge on 020 20.10.16.
 */
public class MainTest {
    @org.junit.Test
    public void showFreqWords() throws Exception {
        String str = "Мама мыла-мыла-мыла раму!";
        String str2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";
        ByteArrayInputStream byteIn = new ByteArrayInputStream(str2.getBytes(StandardCharsets.UTF_8));
        Main testedClass = new Main();
        String[] actResult;
        String[] exResult1 = {"мыла", "мама", "раму"};
        String[] exResult2 = {"consectetur", "faucibus", "ipsum", "lorem", "adipiscing", "amet", "dolor", "eget", "elit", "mi"};

        actResult = testedClass.showFreqWords(byteIn);

        assertEquals(Arrays.toString(exResult2), Arrays.toString(actResult));
    }

}