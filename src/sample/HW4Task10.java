package sample;

import java.util.Scanner;

public class HW4Task10 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int firstnumber = Scan.nextInt();

        System.out.println("Введіть друге число (повинно бути < або = першому:");
        int secondnumber = Scan.nextInt();

        if (firstnumber > secondnumber) {
            System.out.println("Не виконана умова щодо введених даних. Спробуйте ще раз");
        } else
            for (int i = firstnumber; i < secondnumber; i = ++firstnumber) {
                System.out.println("Результат: " + i);
            }
    }
}
