package Lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть кількість пирогів:");
        int pie = Scan.nextInt();

        System.out.println("Введена кількість пирогів: " + pie);

        for (int i = 1; i <=pie; i++ ) {
            System.out.println("Я маю зїсти: " + i + " пирогів");
        }
    }
}
