package HW4;

import java.util.Scanner;

public class HW4Part2Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть місяць:");
        int month = Scan.nextInt();
        String days;

        if (month > 12) {
            throw new IllegalArgumentException("Увага! Введено не коретні дані ");
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "31";
                break;
            case 2:
                days = "28";
                break;
            default:
                days = "30";
        }

        System.out.println("Кількість днів: " + days);
    }

}