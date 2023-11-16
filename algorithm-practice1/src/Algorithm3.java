import java.util.Scanner;

public class Algorithm3 {
    // Giải phương trình bậc hai ax2 + bx + c = 0
    public static Integer dieuKien(char s) {
        Scanner scanner = new Scanner(System.in);
        Integer a = null;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.print("Nhập giá trị của " + s + ": ");
                a = Integer.parseInt(scanner.nextLine());
                if (s == 'a' && a == 0) {
                    flag = true;
                }
            } catch (Exception e) {
                flag = true;
            }
        }
        while (flag);
        return a;
    }

    public static void PhuongTrinhBac2(Integer a, Integer b, Integer c) {
        int delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            int x = -b / 2 * a;
            System.out.println("phương trình có nghiệm kép x=: " + x);
        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("phương trình có 2 nghiệm x1=: " + x1);
            System.out.println("phương trình có 2 nghiệm x2=: " + x2);
        }
    }

    public static void main(String[] args) {
        Integer a = dieuKien('a');
        Integer b = dieuKien('b');
        Integer c = dieuKien('c');
        PhuongTrinhBac2(a, b, c);
    }
}
