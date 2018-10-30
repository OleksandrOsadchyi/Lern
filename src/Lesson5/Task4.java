package Lesson5;

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть кількість пирогів:");
        int pie = Scan.nextInt();

        System.out.println("Введіть кількість людей:");
        int people = Scan.nextInt();

        System.out.println("Введена кількість пирогів: " + pie);

        if (pie <= 0)
            throw new IllegalArgumentException("Увага! Введено не коретні дані ");

        for (int j = 1; j <= people; j++) {

            System.out.println("Я " + j + "-а людина. Загалом я маю зїсти: " + pie + " пирогів");

            for (int i = 1; i <= pie; i++) {

                System.out.println("Я " + j + "-а людина. Я маю зїсти: " + i + " пирогів");
            }
            System.out.println();
        }
    }
}


