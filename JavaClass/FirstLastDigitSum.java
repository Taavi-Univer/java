package JavaClass;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int firstNum = 0;
        int lastNum = number % 10;

        while (number > 0) {

            if (number / 10 == 0) {
                firstNum = number;
                break;
            }
            number /= 10;
        }

        return firstNum + lastNum;
    }

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(236));

    }
}
