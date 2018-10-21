package sample;

import java.util.Scanner;

public class HW4Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of day:");
        int month = scan.nextInt();
        String season;

        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                season = "weekday";
                break;

            case 6:
            case 7:
                 season = "weekend";
                break;
            default:
                season = "Unknown Day";
        }
        System.out.println(month + " Day is " + season);

    }
}

