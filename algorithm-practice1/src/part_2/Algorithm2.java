package part_2;

import java.util.Scanner;

public class Algorithm2 {
    static void fibonacci(Integer n) {
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập một số : ");
        Integer a = scanner.nextInt();
        fibonacci(a);
    }
}
