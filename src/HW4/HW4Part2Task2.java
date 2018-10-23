package HW4;

import java.util.Scanner;

public class HW4Part2Task2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть ширину 1-го трикутника:");
        int widht1 = Scan.nextInt();

        System.out.println("Введіть висоту 1-го трикутника:");
        int height1 = Scan.nextInt();

        System.out.println("Введіть ширину 2-го трикутника:");
        int widht2 = Scan.nextInt();

        System.out.println("Введіть висоту 2-го трикутника:");
        int height2 = Scan.nextInt();

        if (widht1 < 0 || height1 < 0 || widht2 < 0 || height2 < 0)
        {
            throw new IllegalArgumentException("Увага! Серед введених даних присутнє відємне значаення ");
        }

        if (widht1 > 0 || height1 > 0 || widht2 > 0 || height2 > 0) {
            int AreaOfRectangle1 = widht1 * height1;
            int AreaOfRectangle2 = widht2 * height2;

            if (AreaOfRectangle1 > AreaOfRectangle2) {
                System.out.println("Результат: Перший прямокутник більший");
                System.exit(0);
            } else {
                System.out.println("Результат: Другий прямокутник більший");
                System.exit(-1);
            }
        }

    }
}