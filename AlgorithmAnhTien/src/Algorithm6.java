package src;

import java.util.Scanner;

public class Algorithm6 {
    public static void tinhGiaiThua(Integer n) {
        long giaiThua = 1;

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số: ");
        int n = scanner.nextInt();
        tinhGiaiThua(n);
    }
}
