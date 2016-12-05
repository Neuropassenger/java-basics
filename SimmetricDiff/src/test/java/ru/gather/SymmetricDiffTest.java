package ru.gather;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by turge on 018 18.10.16.
 */
public class SymmetricDiffTest {
    @org.junit.Test
    public void symmetricDifference() throws Exception {
        Set<Integer> m1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
        Set<Integer> m2 = new HashSet<Integer>(Arrays.asList(0, 1, 2));
        Set<Integer> ex = new HashSet<Integer>(Arrays.asList(0, 3));
        Set<Integer> result;

        SymmetricDiff testedClass = new SymmetricDiff();
        result = testedClass.symmetricDifference(m1, m2);

        assertEquals(true, ex.equals(result));
    }

}