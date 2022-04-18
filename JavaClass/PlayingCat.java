package JavaClass;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        // if (!summer && (temperature >= 25 && temperature <= 35)) {
        // return true;
        // } else if (summer && (temperature >= 25 && temperature <= 45)) {
        // return true;
        // } else {
        // return false;
        // }

        // int temp = summer ? 45 : 35;

        return temperature >= 25 && temperature <= (summer ? 45 : 35);
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 36));
    }
}
