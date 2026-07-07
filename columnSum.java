import java.util.Scanner;

public class columnSum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please etner the number row of array:");
        int row = scn.nextInt();
        System.out.println("please etner the number col of array:");
        int col = scn.nextInt();
        int[][] array = new int[row][col];
        System.out.println("please enter the value of array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scn.nextInt();
            }
        }
        int sumofcolumns = 0;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < array.length; i++) {
                sumofcolumns += array[i][j];
            }

        }
        System.out.println("the sum of colums: " + sumofcolumns);
        int maxrow = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                if (sum > max) {
                    max = sum;
                    maxrow = i;
                }
            }

        }
        System.out.println("the largest row:" + maxrow);

    }
}