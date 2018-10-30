package Lesson7;

public class rectangleArea2 {

    public static void main(String[] args) {
        double width;
        double height;
        double area;
        width = 10;
        height = 2;
        area = (width * height);
        // if (width <= 0 || height <= 0) throw new IllegalArgumentException("Ошибка. Отрицательные значения недопустимы");
    }

    public static double rectangleArea(double width, double height) {
        if (width <= 0 || height <= 0)
        throw new IllegalArgumentException("Ошибка. Отрицательные значения недопустимы");
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <=0){
            throw new IllegalArgumentException("Ошибка. Отрицательные значения недопустимы");
        }

        return Math.PI * Math.pow(radius,2);
    }

}
