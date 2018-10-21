package sample;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Task 2. Даны числа int a, b. Найти наименьшее.");
        int a = (int) Math.round(Math.random() * 1000);
        int b = (int) Math.round(Math.random() * 1000);

        System.out.println("a=" + a + ";  b=" + b);

        if (a < b) {
            System.out.println("a<b :  " + a + " < " + b);
        } else {
            System.out.println("a>b :  " + a + " > " + b);
        }
        System.out.println("_______________________________________________________________________________");
    }

}
