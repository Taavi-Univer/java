package JavaClass.Arrays.SortedArray;

public class Main {

    public static void main(String[] args) {
        int[] arr = SortedArray.getIntegers(5);

        // SortedArray.printArray(arr);

        int[] sortedArr = SortedArray.sortIntegers(arr);

        for (int i = 0; i < sortedArr.length; i++) {

            System.out.println(sortedArr[i]);
        }
    }
}
