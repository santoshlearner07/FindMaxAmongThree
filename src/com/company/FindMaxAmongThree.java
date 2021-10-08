package com.company;

public class FindMaxAmongThree<E extends Comparable<E>> {
    E x, y;

    public FindMaxAmongThree(E x, E y) {
        this.x = x;
        this.y = y;

    }

    public E maximum() {
        return FindMaxAmongThree.maximum(x, y);
    }

    public static <E extends Comparable<E>> E maximum(E x, E y) {
        E max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        printMax(x, y, max);
        return max;
    }

    public static String testMaximum(String x, String y) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
//        printMax(x, y, max);
        return max;
    }

    public static <E> void printMax(E x, E y, E max) { // E y, E z,
        System.out.print("Max num -> " + max); //y, z,
    }

    public static void main(String[] args) {
        Integer xInt = 3, yInt = 4;
        String xStr = " ", yStr = " ";

        FindMaxAmongThree.testMaximum(xStr, yStr);
        new FindMaxAmongThree(xInt, yInt).maximum();
    }


}