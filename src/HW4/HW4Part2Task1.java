package HW4;

import java.util.Scanner;

public class HW4Part2Task1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть першу карту:");
        int cardA = Scan.nextInt();

        System.out.println("Введіть другу карту:");
        int cardB = Scan.nextInt();
        if (cardA < 0 || cardB < 0) {
            System.out.println("Не виконана умова щодо введених даних. Введено відємне число. Спробуйте ще раз");
            System.exit(-1);
        }
        if (cardA <= 21 && cardB <= 21) {
            if (cardA > cardB)
                System.out.println("Результат: " + cardA);
            else {
                System.out.println("Результат: " + cardB);

            }
        }
        if (cardA > 21 || cardB > 21) {
            System.out.println("0");
            System.exit(-1);
        }
    }
}