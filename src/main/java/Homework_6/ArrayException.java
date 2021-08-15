package Homework_6;

import Homework_6.exception.MyArrayDataException;
        import Homework_6.exception.MyArraySizeException;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;
        import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива m (1 ≤ m ≤ 4): ");
        int m = in.nextInt();

        in = new Scanner(System.in);
        System.out.print("Введите размер массива n (1 ≤ n ≤ 4): ");
        int n = in.nextInt();
        String[][] array = new String[m][n];

        System.out.println("Введите строки:");
       /* String[][] array = {{"r", "2", "3", "4"},
                            {"5", "6", "7", "8"},
                            { "9", "10", "11", "12"},
                            {"13", "14", "!", "16"}
                            };*/
        //  System.out.println("Данный массив строк:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //  array[i][j] = in.nextLine();
                try {
                    array[i][j] = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            System.out.println("Данный массив строк:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println(stringArrayToInt(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int stringArrayToInt(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;

        if (array.length != 4 || array[0].length != 4 ||
                array[1].length != 4 || array[2].length != 4 ||
                array[3].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4!");
        }

        System.out.println(Arrays.deepToString(array));

        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке с индексом [" +
                            i + "]" + "[" + j + "] неверное число: " + array[i][j]);
                }
            }
        }
        System.out.print("Сумма элементов массива: ");
        return count;
    }
}