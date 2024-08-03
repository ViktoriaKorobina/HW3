package org.example.task1;


public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.print("5 + 6 = ");
        System.out.println(calc.sum(5.0, 6));
        System.out.print("5 * 6 = ");
        System.out.println(calc.multiply(5.0, 6));
        System.out.print("5 - 6 = ");
        System.out.println(calc.divide(5.0, 6));
        System.out.print("5 / 6 = ");
        System.out.println(calc.subtract(5.0, 6));
    }

}
