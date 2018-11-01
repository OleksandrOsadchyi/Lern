package Lesson8;


import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        String text = "ARTEM";
        String text1 = "ARTEM";

        char[] t= text.toCharArray();
        System.out.println(Arrays.toString(t));

        char l= text.charAt(0);
        System.out.println(l);

        System.out.println(text.equals(text1));

//        int i = text.indexOf("RT);
//
//        System subtext = text.substring(0,3);
//        System.out.println(subtext);

    }
}

