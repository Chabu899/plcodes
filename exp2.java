import java.util.Scanner;

class Shape {
    double area;

    // Constructor to initialize the area to zero
    Shape() {
        area = 0;
    }

    // Method to calculate the area of a circle
    void calculateArea(double radius) {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Overloaded method to calculate the area of a rectangle
    void calculateArea(double length, double width) {
        area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    // Overloaded method to calculate the area of a triangle
    void calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            area = 0.5 * base * height;
            System.out.println("Area of Triangle: " + area);
        }
    }
}

public class exp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        // Area of a Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        shape.calculateArea(radius);

        // Area of a Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        shape.calculateArea(length, width);

        // Area of a Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        shape.calculateArea(base, height, true);

        scanner.close();
    }
}
