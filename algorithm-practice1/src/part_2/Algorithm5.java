package part_2;

import java.util.Scanner;

public class Algorithm5 {
    //giải phương trình bậc nhất ax + b = 0
    static void phuongTrinhBacNhat(Integer a, Integer b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else if (b != 0) {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            int x = -b / a;
            System.out.println("Phương trình có nghiệm là: " + x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        Integer a = scanner.nextInt();
        System.out.println("Nhập b:");
        Integer b = scanner.nextInt();
        phuongTrinhBacNhat(a, b);
    }
}
