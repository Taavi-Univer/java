package JavaClass;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking && (hourOfDay >= 0 && hourOfDay < 8) || barking && (hourOfDay > 22 && hourOfDay <= 23)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        // System.out.println(2500 % 1024);
        System.out.println(shouldWakeUp(true, 0));
    }
}
