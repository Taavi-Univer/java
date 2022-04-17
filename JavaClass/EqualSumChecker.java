package JavaClass;

public class EqualSumChecker {
    public static boolean hasEqualSum(int paramX, int paramY, int paramZ) {

        if (paramX + paramY == paramZ) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 2));
    }
}
