package JavaClass.Arrays.ReverseArray;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 7 };

        reverse(arr);
    }

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));

        int[] res = new int[arr.length];

        // {1,2,3}
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            res[j] = arr[i];
        }

        System.out.println("Reversed array = " + Arrays.toString(res));
    }
}
