package part_3;

import java.util.Scanner;

public class Algorithm4 {
    // Viết chương trình in ra dãy số Fibonacci.
    static void fibonacci(Integer n) {
        int a = 0;
        int b = 1;
        int sum = a + b;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            a = b;
            b = sum;
            sum = a + b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của dãy fibonacci: ");
        Integer a = scanner.nextInt();
        fibonacci(a);
    }
}
