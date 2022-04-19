package JavaClass.UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of books: ");
        int booksCount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + " and You ordered " + booksCount + " books");

        scanner.close();

    }
}
