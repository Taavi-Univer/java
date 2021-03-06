package JavaClass;

public class AreaCalculator {

    public static double area(double radius) {

        double PI = Math.PI;

        if (radius < 0) {
            return -1.0;
        }

        return radius * radius * PI;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(3));
    }
}
