package ru.gather;

import java.util.Objects;
import java.util.function.DoubleUnaryOperator;

/**
 * Created by turge on 014 14.10.16.
 */
public class Pair<T1, T2> {
    T1 value1;
    T2 value2;

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i.toString());

        String s = pair.getSecond(); // "hello"
        System.out.println(s.toString());

        Pair<Integer, String> pair2 = Pair.of(1, "hello");

        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);

        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);

        Pair<Integer, String> pair3 = Pair.of(1, "hello");

        System.out.println(pair.equals(pair3));
        System.out.println(pair.hashCode());
        System.out.println(pair2.hashCode());
        System.out.println(pair3.hashCode());
    }

    private Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public static Pair of(Object value1, Object value2) {
        return new Pair(value1, value2);
    }

    public T1 getFirst() {
        return value1;
    }

    public T2 getSecond() {
        return value2;
    }

    @Override
    public int hashCode() {
        int prime = 28;
        int result = 1;
        long value1Bits = Objects.hashCode(value1);
        long value2Bits = Objects.hashCode(value2);
        result = prime * result + (int) (value1Bits - (value1Bits >>> 32));
        result = prime * result + (int) (value2Bits - (value2Bits >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Pair<?, ?> other = (Pair<?, ?>) object;
        if(getFirst() != null ? !getFirst().equals(other.getFirst()) : other.getFirst() != null) return false;
        return getSecond() != null ? getSecond().equals(other.getSecond()) : other.getSecond() == null;
    }
}
