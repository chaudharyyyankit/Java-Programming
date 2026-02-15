package challenges;

import java.util.Scanner;

public class Cuboids {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double l, b, h;

        while (true) {

            System.out.println("\n===== ENTER CUBOID DIMENSIONS =====");
            System.out.print("Length Width Height: ");
            l = s.nextDouble();
            b = s.nextDouble();
            h = s.nextDouble();

            boolean calculating = true;

            while (calculating) {

                System.out.println("\nChoose an option:");
                System.out.println("1. Perimeter");
                System.out.println("2. Lateral Surface Area");
                System.out.println("3. Total Surface Area");
                System.out.println("4. Volume");
                System.out.println("5. Change Dimensions");
                System.out.println("6. Exit");

                System.out.print("Enter choice: ");
                int choice = s.nextInt();

                switch (choice) {

                    case 1 -> System.out.println("Perimeter: " + 4 * (l + b + h));
                    case 2 -> System.out.println("Lateral Surface Area: " + 2 * h * (l + b));
                    case 3 -> System.out.println("Total Surface Area: " + 2 * (l*b + b*h + h*l));
                    case 4 -> System.out.println("Volume: " + l * b * h);

                    case 5 -> calculating = false;   // break inner loop → reassign dims

                    case 6 -> {
                        System.out.println("Goodbye!");
                        s.close();
                        return;
                    }

                    default -> System.out.println("Invalid option!");
                }
            }
        }
    }
}