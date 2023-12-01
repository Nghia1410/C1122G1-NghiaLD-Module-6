package part_3;

import java.util.Scanner;

//Viết chương trình nhập số nguyên dương n. Liệt kê n số nguyên tố đầu tiên.


public class Algorithm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            System.out.println("Danh sách " + n + " số nguyên tố đầu tiên:");
            printFirstNPrimes(n);
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printFirstNPrimes(int n) {
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

