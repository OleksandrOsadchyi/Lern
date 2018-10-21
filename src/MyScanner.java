import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //введення даних
        System.out.println("Введіть число:");
        int firstnumber = scan.nextInt();
        System.out.print("Введіть число:");
        int secondnumber = scan.nextInt();

        //виведення в консоль введенних даних
        System.out.println("Перше введене число:" + firstnumber);
        System.out.println("Друге введене число:" + secondnumber);

        //Виконання математичних дій
        System.out.println((firstnumber + "+" + secondnumber + "=") + (firstnumber + secondnumber));
        System.out.println((firstnumber + "-" + secondnumber + "=") + (firstnumber - secondnumber));
        System.out.println((firstnumber + "*" + secondnumber + "=") + (firstnumber * secondnumber));
        try {
            System.out.println((firstnumber + "/" + secondnumber + "=") + (firstnumber / secondnumber));
            System.out.println((firstnumber + "/" + secondnumber + "=") + (firstnumber / secondnumber));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println((firstnumber + " (інкремент першого числа) =") + (++firstnumber));
        //повертаємо firstnumber початкове значення
        --firstnumber;
        System.out.println((firstnumber + " (декремент першого числа) =") + (--firstnumber));
        System.out.println((secondnumber + " (інкремент другого числа) =") + (++secondnumber));
        //повертаємо secondnumber початкове значення
        --secondnumber;
        System.out.println((secondnumber + " (декремент другого числа) =") + (--secondnumber));

    }
}



/*public class MyScanner {
    public static void main(String[] args) {
        int x=1;
        double y=2.3;

        double z=x+y-5.2;
        System.out.println(("z= "+z));
    }


}
*/

/*public class MyScanner {
    public static void main(String[] args) {
        byte x=1;
        z = z+5;
        System.out.println(("z= "+z));
    }


}
*/


/*
//package sample
public class MyScanner {
    public static void main(String[] args)
    {
        String s1 = "Artem";
        String s2 = "Artem";
        // String s3 = new String(orignal: "Artem");
        // виведення довжинистроки
        System.out.println(s1.length());
        System.out.println(20%2 == 0);


    }
}

*/