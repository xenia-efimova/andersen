package Homework_2;

public class Lesson_2 {
    public static void main(String[] args) {
        System.out.println(checkIfSumBetweenTenAndTwenty(14, 6));
        checkPositiveOrNegativeNumber(-4);
        System.out.println(sayPositiveOrNegativeNumber(44));
        IsItALeapYear(2021);
        changeArray();
        changeArray2();
        createSquareArray(7);
        printArrayInConsole(retLenArr(11, 5));
    }

    public static boolean checkIfSumBetweenTenAndTwenty(int a, int b) {
        System.out.println("Задание 1:");
        System.out.println("Сумма чисел лежит в пределах от 10 до 20?");
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }

    public static void checkPositiveOrNegativeNumber(int c) {
        System.out.println("\nЗадание 2:");
        if (c >= 0) System.out.println("Число " + c + "положительное");
        else System.out.println("Число " + c + " отрицательное");
    }

    public static boolean sayPositiveOrNegativeNumber(int d) {
        System.out.println("\nЗадание 3:");
        System.out.println("Число положительное?");
        if (d >= 0) return true;
        else return false;
    }

    static void IsItALeapYear(int year) {
        System.out.println("\nЗадание 5:");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

    public static void changeArray() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("\nЗадание 6:");
        System.out.print("Было: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nСтало: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void changeArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("\n\nЗадание 8:");
        System.out.print("Было: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nСтало: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    public static void createSquareArray(int size){
        System.out.println("\n\nЗадание 9:");
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void printArrayInConsole(int[] inputArray) {
        System.out.println("\nЗадание 10:");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}

