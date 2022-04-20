package JavaClass.Inheritance.PoolArea;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.getWidth() = " + rectangle.getWidth());
        System.out.println("rectangle.getLength() = " + rectangle.getLength());
        System.out.println("rectangle.getArea() = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.getWidth() = " + cuboid.getWidth());
        System.out.println("cuboid.getLength() = " + cuboid.getLength());
        System.out.println("cuboid.getArea() = " + cuboid.getArea());
        System.out.println("cuboid.getHeight() = " + cuboid.getHeight());
        System.out.println("cuboid.getVolume() = " + cuboid.getVolume());
    }
}
