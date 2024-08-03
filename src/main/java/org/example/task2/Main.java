package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Integer[] intNums = {1, 2, 3, 4, 5};
        Double[] doubleNums = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        Integer[] intNums1 = {1, 2, 3, 4, 5};
        Object[] objects = {1, 2.0, 3, 4.0, 5};
        Object[] objects1 = {1, 2.0, 3, 4.0, 5};
        CompareArrays ca = new CompareArrays();
        System.out.println(ca.compareArrays(intNums, doubleNums));
        System.out.println(ca.compareArrays(intNums, intNums1));
        System.out.println(ca.compareArrays(intNums, objects));
        System.out.println(ca.compareArrays(objects1, objects));

    }
}
