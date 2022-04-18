package JavaClass;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int testNumber = Math.abs(number);
        int reverseNum = 0;

        while (testNumber > 0) {

            int lastDigit = testNumber % 10;
            reverseNum *= 10;
            reverseNum += lastDigit;
            testNumber /= 10;

        }

        if (Math.abs(number) == reverseNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-636));

    }
}
