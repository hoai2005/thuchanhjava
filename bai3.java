import java.lang.Math;
public class bai3 {
    // Lớp Common chứa phương thức kiểm tra số dương
    public static class Common {
        // kiểm tra số dương
        public static boolean isPositive(double value) {
            return value > 0;
        }
    }
    // Lớp Circle là hình tròn
    public static class Circle {
        private double radius;
        // Constructor
        public Circle(double radius) {
            setRadius(radius);
        }
        // Getter cho radius
        public double getRadius() {
            return radius;
        }
        // Setter cho radius kiểm tra số dương
        public void setRadius(double radius) {
            if (Common.isPositive(radius)) {
                this.radius = radius;
            } else {
                throw new IllegalArgumentException("Radius must be a positive number.");
            }
        }
        // chu vi hình tròn
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        // diện tích hình tròn
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
    // Phương thức main để kiểm tra lớp Circle
    public static void main(String[] args) {
        // đối tượng Circle
        Circle circle = new Circle(5);
        // Circle
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}


