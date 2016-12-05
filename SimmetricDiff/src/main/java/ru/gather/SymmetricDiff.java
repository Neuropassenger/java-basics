package ru.gather;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by turge on 018 18.10.16.
 */
public class SymmetricDiff {
    public static void main(String[] args) {

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> temp1 = new HashSet<T>(set1);
        Set<T> temp2 = new HashSet<T>(set2);

        temp1.removeAll(set2);
        temp2.removeAll(set1);

        temp1.addAll(temp2);

        return temp1;
    }
}
