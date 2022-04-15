package MyFirstApp;

// class Dog {
//     String name;

//     public void bark() {
//         System.out.println(name + " says Ruff");
//     }
// }

class Dog {
    String name;

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bob";

        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = dog1;

        dogs[0].name = "Stu";
        dogs[1].name = "Bro";

        int x = 0;
        while (x < dogs.length) {
            dogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff");
    }
}
