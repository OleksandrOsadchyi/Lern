package Lesson8;

public class Task1 {
    public static void main(String[] args) {
        int[][] b = new int[4][5];
        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[0].length; j++) {

                b[i][j] = i + j;
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }

}
