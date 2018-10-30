package HW6;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) Math.round(Math.random() * 200) - 100;
        }

        System.out.print("Створений масив:");
        System.out.println(Arrays.toString(array));

        System.out.print("Індекси позитивних елеменытв масиву:");
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}