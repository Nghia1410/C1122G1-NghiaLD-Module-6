package part_3;

import java.util.Scanner;

public class Algorithm6 {
    //    Nhập số nguyên dương n, liệt kê n số chính phương đầu tiên
    static boolean laSoChinhPhuong(int a) {
        int b = (int) Math.sqrt(a);
        return (b * b == a);
    }

    static void lietKeCacSoChinhPhuong(int number) {
        System.out.println(number + " số chính phương đầu tiên là");
        int count = 0;
        int i = 1;
        while (count < number) {
            if (laSoChinhPhuong(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n:");
        int a = scanner.nextInt();
        lietKeCacSoChinhPhuong(a);
    }
}

