import java.util.ArrayList;
import java.util.List;


abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Ex05 {
    public static void main(String[] args) {
        
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(3));

        
        double totalArea = 0;
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
            totalPerimeter += shape.getPerimeter();
        }

        System.out.println("Tổng diện tích: " + totalArea);
        System.out.println("Tổng chu vi: " + totalPerimeter);
    }
}