package JavaClass;

public class MegaBytesConverter {

    public static void printMegaBytesAndKilobytes(int kilobytes) {

        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int megab = kilobytes / 1024;
            int kilob = kilobytes % 1024;

            System.out.println(kilobytes + " KB = " + megab + " MB and " + kilob + " KB");
        }

    }

    public static void main(String[] args) {

        // System.out.println(2500 % 1024);
        printMegaBytesAndKilobytes(24);
    }
}
