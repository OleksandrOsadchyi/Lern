package sample;

import java.util.Scanner;

public class HWTask4 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int firstnumber = Scan.nextInt();

        System.out.println("Введіть друге число:");
        int secondnumber = Scan.nextInt();


        if (firstnumber<secondnumber ) {
            System.out.println("Результат: -1");
        }
        else if (firstnumber == secondnumber)
            System.out.println("Результат: 0" );
        else {
            System.out.println("Результат: +1");
        }
    }
}


