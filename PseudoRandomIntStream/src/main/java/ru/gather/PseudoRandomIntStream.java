package ru.gather;

import java.util.stream.IntStream;

/**
 * Created by turge on 020 20.10.16.
 */
public class PseudoRandomIntStream {
    public static void main(String[] args) {
        IntStream myStream = pseudoRandomStream(13);
        myStream.forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        IntStream pseudoStream = IntStream.iterate(seed, (n) -> n * n / 10 % 1000);
        return pseudoStream.limit(20);
    }
}
