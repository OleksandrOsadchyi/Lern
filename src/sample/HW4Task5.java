package sample;

import java.util.Scanner;

public class HW4Task5 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть число:");
        int firstnumber = Scan.nextInt();


        if (firstnumber<100) {
            System.out.println("Результат: Введене число не входить у діапазон 100...200");
        }
        else if (firstnumber > 200)
            System.out.println("Результат: Введене число не входить у діапазон 100...200" );
        else {
            System.out.println("Результат: Введене число входить у діапазон 100...200");
        }
    }
}
