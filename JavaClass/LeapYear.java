package JavaClass;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else
                        return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        // boolean res = false;
        // boolean res = false;
        // int ini = 0;
        // int remainderByDividingBy4 = 2000 % 4;
        // if (2001 % 4 == ini) {

        // res = true;
        // }
        System.out.println(isLeapYear(1700));
    }
}
