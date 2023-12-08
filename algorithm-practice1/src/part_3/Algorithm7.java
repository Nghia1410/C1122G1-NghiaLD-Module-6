package part_3;

import java.util.Scanner;

public class Algorithm7 {
    static boolean soHoanThien(int a) {
        int tongUocSo = 1;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                tongUocSo += i;
            }
        }
        return (tongUocSo == a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương n:");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (soHoanThien(i)) {
                count++;
            }
        }

        System.out.println("Có " + count + " số hoàn thiện nhỏ hơn " + n);
    }
}
