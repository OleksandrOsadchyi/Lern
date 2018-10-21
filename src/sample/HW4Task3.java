package sample;

import java.util.Scanner;

public class HW4Task3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int firstnumber = Scan.nextInt();

        System.out.println("Введіть друге число:");
        int secondnumber = Scan.nextInt();

        System.out.println("Введіть друге число:");
        int thirdnumber = Scan.nextInt();


        if (firstnumber<=secondnumber && firstnumber<thirdnumber) {
            System.out.println("Найменше число з введених: " + firstnumber);
        }
        else if (secondnumber<thirdnumber)
            System.out.println("Найменше число з введених: " + secondnumber);
        else {
            System.out.println("Найменше число з введених: " + thirdnumber);
        }
    }
}

