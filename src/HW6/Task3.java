package HW6;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i=0; i<10; i++) {
            array[i] =(int) Math.round(Math.random()*200)-100;
        }
        System.out.print("Довжина масиву: ");
        System.out.println(array.length);

        System.out.print("Створений масив:");
        System.out.println(Arrays.toString(array));
    }
}