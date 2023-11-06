import OOP.Rectangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        int width = scanner.nextInt();
        System.out.println("Enter the height");
        int height = scanner.nextInt();
        Rectangle rect = new Rectangle(width, height);
        System.out.println(rect.display());
        System.out.println("The area is " + rect.getArea());
        System.out.println("The Perimeter is " + rect.getPerimeter());

    }
}
