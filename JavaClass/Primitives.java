package JavaClass;

public class Primitives {
    public static void main(String[] args) {
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        char myChar = 'R';
        char unicodeChar = '\u0052';

        System.out.println("Integer minimum value: " + minIntValue);
        System.out.println("Integer maximum value: " + maxIntValue);

        System.out.println("Byte minimum value: " + minByteValue);
        System.out.println("Byte maximum value: " + maxByteValue);

        System.out.println("Short minimum value: " + minShortValue);
        System.out.println("Short maximum value: " + maxShortValue);

        System.out.println("Long minimum value: " + minLongValue);
        System.out.println("Long maximum value: " + maxLongValue);

        System.out.println("My char: " + myChar);
        System.out.println("My char in unicode: " + unicodeChar);
    }
}
