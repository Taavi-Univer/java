package JavaClass.Constructor.Wall;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall(3, 6);

        System.out.println("Wall width: " + wall1.getWidth());
        System.out.println("Wall height: " + wall1.getHeight());
        System.out.println("Area: " + wall1.getArea());
    }

}
