package JavaClass.Polymorphism;

class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Message from Car class: " + " The car's engine is starting";
    }

    public String accelerate() {
        return "Message from Car class: " + " The car's accelerating";
    }

    public String brake() {
        return "Message from Car class: " + " The car's braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Message from Mitsubishi class: " + " The car's engine is starting";
    }

    @Override
    public String accelerate() {
        return "Message from Mitsubishi class: " + " The car's accelerating";
    }

    @Override
    public String brake() {
        return "Message from Mitsubishi class: " + " The car's braking";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Message from Holden class: " + " The car's engine is starting";
    }

    @Override
    public String accelerate() {
        return "Message from Holden class: " + " The car's engine is accelerating";
    }

    @Override
    public String brake() {
        return "Message from Holden class: " + " The car's engine is braking";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Message from Ford class: " + " The car's engine is starting";
    }

    @Override
    public String accelerate() {
        return "Message from Ford class: " + " The car's engine is accelerating";
    }

    @Override
    public String brake() {
        return "Message from Ford class: " + " The car's engine is braking";
    }
}

class Main {
    public static void main(String[] args) {

        Car car = new Car(6, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(8, "base Mitsubishi");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Base Ford");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Base Holden");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

}