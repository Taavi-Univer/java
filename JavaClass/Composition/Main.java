package JavaClass.Composition;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Sleep", 2, 1, 1, 1);
        Lamp lamp = new Lamp("Light", true, 36);

        Bedroom bedroom = new Bedroom("name", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
