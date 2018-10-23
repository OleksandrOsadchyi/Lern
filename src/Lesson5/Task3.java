package Lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть кількість пирогів:");
        int pie = Scan.nextInt();

        System.out.println("Введена кількість пирогів: " + pie);

        if (pie <= 0)
            throw new IllegalArgumentException("Увага! Введено не коретні дані ");
        for (int i = 1; i <= pie; i++) {
            System.out.println("Я маю зїсти: " + i + " пирогів");

            if ((i % 2) == 0) {
                System.out.println("Wonderful world");
                System.exit(0);
            }
        }
    }
}



