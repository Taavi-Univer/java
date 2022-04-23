package JavaClass.Arrays.MinimumElement;

import java.util.Scanner;

public class MinimumEl {

    private static Scanner scanner;

    public static void main(String[] args) {

        // int[] arr = { 1, 2, 3 };
        // int[] copy = Arrays.copyOf(arr, arr.length);
        // System.out.println(Arrays.toString(copy));

        int count = readInteger();

        int[] res = readElements(count);

        System.out.println(findMin(res));
    }

    private static int readInteger() {
        scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int count = scanner.nextInt();
        // scanner.nextLine();

        return count;
    }

    private static int[] readElements(int count) {
        scanner = new Scanner(System.in);
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number: ");
            int num = scanner.nextInt();
            // scanner.nextLine();

            arr[i] = num;
        }

        return arr;
    }

    private static int findMin(int[] arr) {
        // int[] copyArr = Arrays.copyOf(arr, arr.length);
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < copyArr.length; i++) {

            if (copyArr[i] < min) {
                min = copyArr[i];
            }
        }

        return min;
    }
}
