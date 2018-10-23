package HW4;

import java.util.Scanner;

public class HW4Part2Task5 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введіть вагу:");
        int weight = Scan.nextInt();

        System.out.println("Введіть зріст:");
        int height = Scan.nextInt();

        double s = 2;

        double bmi = (weight / ((Math.pow(height, s) / 100)));

        if (bmi <= 18.5) {
            System.out.println("Ваш індекс маси тіла:  " + "Underweight");
        }

        if (bmi > 18.5 && bmi <= 25.0) {
            System.out.println("Ваш індекс маси тіла:  " + "Normal");
        } else if (bmi > 25.0) {
            System.out.println("Ваш індекс маси тіла:  " + "Overweight");
        }
    }
}