package Lesson8;

public class Task2 {

    public static void main(String[] args) {
        String s1 = "AFG";
        String s2 = "AFG";
        String s3 = new String ("AFG");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);

    }
}