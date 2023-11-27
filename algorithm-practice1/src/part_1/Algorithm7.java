package part_1;

import java.util.Scanner;

public class Algorithm7 {
    static boolean dayGiam(String n) {
        char[] arr = n.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi để kiểm tra: ");
        String a = scanner.nextLine();
        if (dayGiam(a)) {
            System.out.println("Là một chuỗi giảm!!");
        } else {
            System.out.println("Không phải là một chuỗi giảm!!");
        }
    }
}
