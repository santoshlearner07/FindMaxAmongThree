package com.company;

public class FindMaxAmongThree<E extends Comparable<E>> {
    E x;

    public FindMaxAmongThree(E x) {
        this.x = x;
    }

    public E maximum() {
        return FindMaxAmongThree.maximum(x);
    }

    public static <E extends Comparable<E>> E maximum(E x) {
        E max = x;
        printMax(x, max);
        return max;
    }

    public static String testMaximum(String x) {
        String max = x;
//        printMax(x, max);
        return max;
    }

    public static <E> void printMax(E x, E max) { // E y, E z,
        System.out.printf("Max num -> " +  x); //y, z,
    }

    public static void main(String[] args) {
        Integer xInt = 3;
        String xStr = " ";

        FindMaxAmongThree.testMaximum(xStr);
        new FindMaxAmongThree(xInt).maximum();
    }


}