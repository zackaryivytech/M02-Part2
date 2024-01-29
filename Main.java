import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Triangle t = new Triangle();

        System.out.print("Input Side1 : ");
        t.setSide1(scanner.nextInt());
        System.out.print("\nInput Side2 : ");
        t.setSide2(scanner.nextInt());
        System.out.print("\nInput Side3: ");
        t.setSide3(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Input Color ");
        t.setColor(scanner.nextLine());

        System.out.println("Is Filled ");
        String fill = scanner.nextLine();

        fill = fill.toLowerCase();

        if(fill.equals("true"))
            t.setFilled(true);
        else if(fill.equals("false"))
            t.setFilled(false);

        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Color: " + t.getColor());
        System.out.println("Filled: " + t.isFilled());
    }
}