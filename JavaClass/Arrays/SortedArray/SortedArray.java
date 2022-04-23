package JavaClass.Arrays.SortedArray;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers:\r");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }

        boolean passage = true;
        int temp;

        while (passage) {
            passage = false;

            // int[] copyArr = {1,2,5};

            // {2,1,5}
            // {2,5,1}
            // {5,2,1}

            for (int i = 0; i < copyArr.length - 1; i++) {
                if (copyArr[i] < copyArr[i + 1]) {
                    temp = copyArr[i];
                    copyArr[i] = copyArr[i + 1];
                    copyArr[i + 1] = temp;

                    passage = true;
                }
            }
        }

        return copyArr;
    }
}
