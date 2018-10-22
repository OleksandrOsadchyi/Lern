package HW4;

import java.util.Scanner;

public class HW4Part2Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть номер Вашого квитка:");
        int ticket = Scan.nextInt();

        if (ticket < 0 || ticket > 999999) {
            throw new IllegalArgumentException("Увага! Введено не коретні дані ");
        }
        if (count(ticket) == count(ticket / 1000))
            System.out.print("Ви Щасливчик");
        else
            System.out.print("Пощастить наступного разу");
    }

    private static int count(int ticket) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {

            sum += ticket % 10;
            ticket /= 10;
        }
        return sum;
    }
}
