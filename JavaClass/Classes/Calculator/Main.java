package JavaClass.Classes.Calculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(2.34);
        calculator.setSecondNumber(0.0);

        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());

    }

}
