import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int width = getPositiveInteger(scanner);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int height = getPositiveInteger(scanner);
        // Tính chu vi và diện tích
        int perimeter = 2 * (width + height);
        int area = width * height;
        // In kết quả 
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều dài: " + height);
        System.out.println("Chu vi của hình chữ nhật: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật: " + area);
        scanner.close();
    }
    // kiểm tra số nguyên dương
    private static int getPositiveInteger(Scanner scanner) {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number <= 0) {
                    System.out.print("Nhập một số nguyên dương: ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Nhập một số nguyên hợp lệ: ");
            }
        }
        return number;
    }
}