package part_3;

import java.util.Scanner;

public class Algorithm2 {
    //    Viết chương trình đếm số ước số của số nguyên dương n.
    static void demUocSo(Integer a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        System.out.println("Có " + count + " ước số của số " + a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương:");
        Integer a = scanner.nextInt();
        demUocSo(a);
    }
}
