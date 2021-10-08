package com.company;

public class FindMaxAmongThree<E extends Comparable<E>> {
    E x, y, z;

    public FindMaxAmongThree(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public E maximum() {
        return FindMaxAmongThree.maximum(x, y, z);
    }

    public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static <E> void printMax(E x, E y, E z, E max) {
        System.out.printf("Max of %s,%s and %s is %s\n", x, y, z, max);
    }

    public static void main(String[] args) {
        Integer xInt = 3, yInt = 4, zInt = 5;
        Float xF1 = 6.6f, yF1 = 8.8f, zF1 = 73.7f;
        String xStr = "Peach", yStr = "Apple", zStr = "Orange";

        FindMaxAmongThree.testMaximum(xStr, yStr, zStr);
        new FindMaxAmongThree(xInt, yInt, zInt).maximum();
        new FindMaxAmongThree(xF1, yF1, zF1).maximum();
        new FindMaxAmongThree(xStr, yStr, zStr).maximum();
    }


}