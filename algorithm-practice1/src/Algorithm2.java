import java.util.Scanner;

public class Algorithm2 {
    // Giải phương trình bậc nhất ax + b = 0.
    public static void PhuongTrinhBacNhat(Integer a, Integer b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phương trình vô số nghiệm");
            } else if (b != 0) {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            int x = -b / a;
            System.out.println("phương trình ax + b = 0 có nghiệm là x=  " + x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của a:");
        Integer a = scanner.nextInt();
        System.out.println("Nhập giá trị của b:");
        Integer b = scanner.nextInt();
        PhuongTrinhBacNhat(a, b);
    }

}
