package io.CustomerTimes.HW6;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Example {
    private final String first, last;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return Objects.equals(first, example.first) && Objects.equals(last, example.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));

    }
}


