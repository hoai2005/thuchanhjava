public class bai2 {

    // Lớp Rectangle định nghĩa các thuộc tính và phương thức của hình chữ nhật
    static class Rectangle {
        private int width;
        private int height;
        // Constructor để khởi tạo đối tượng Rectangle
        public Rectangle(int width, int height) {
            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Chiều rộng và chiều cao phải là số nguyên dương.");
            }
            this.width = width;
            this.height = height;
        }
        // chu vi hình chữ nhật
        public int getPerimeter() {
            return 2 * (width + height);
        }
        // diện tích hình chữ nhật
        public int getArea() {
            return width * height;
        }
        // Lấy giá trị chiều rộng
        public int getWidth() {
            return width;
        }
        // Lấy giá trị chiều dài
        public int getHeight() {
            return height;
        }
    }
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle với chiều rộng 
        Rectangle rectangle = new Rectangle(7, 10);
        // Tính chu vi và diện tích
        int perimeter = rectangle.getPerimeter();
        int area = rectangle.getArea();
        System.out.println("Chiều rộng: " + rectangle.getWidth());
        System.out.println("Chiều cao: " + rectangle.getHeight());
        System.out.println("Chu vi của hình chữ nhật: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật: " + area);
    }
}