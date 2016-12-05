package ru.gather.junit;

import ru.gather.junit.TestJunit;

import static org.junit.Assert.assertEquals;

/**
 * Created by turge on 010 10.10.16.
 */
public class TestJunitTest {
    @org.junit.Test
    public void retOne() throws Exception {
        TestJunit mn = new TestJunit();
        assertEquals(1, mn.retOne(), 0);
    }
}