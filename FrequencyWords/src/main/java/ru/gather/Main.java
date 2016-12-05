package ru.gather;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by turge on 020 20.10.16.
 */
public class Main {
    public static void main(String[] args) {
    }

    public static String[] showFreqWords(InputStream in) {
        Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
        BufferedReader bReader = new BufferedReader(reader);

        Stream<String> stream = bReader.lines()
                .map(line -> line.toLowerCase())
                .map(line -> line.split("[^а-яА-Яa-zA-Z0-9]+"))
                .flatMap(Arrays::stream);

        Map<String, Long> storage = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Stream<String> words = storage.entrySet().stream().sorted((e1, e2) -> {
            int comp = e1.getValue().compareTo(e2.getValue());
            if (comp == 0)
                return e1.getKey().compareTo(e2.getKey());
            return -comp;
        }).map(e -> e.getKey()).limit(10);

        return words.toArray(size -> new String[size]);
    }
}
