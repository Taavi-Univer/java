package JavaClass;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double paramX, double paramY) {
        int castedX = (int) (paramX * 1000);
        int castedY = (int) (paramY * 1000);

        if (castedX - castedY == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175));
    }
}