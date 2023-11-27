package src;

import java.util.Scanner;

public class Algorithm5 {
    //Viết chương trình nhập vào một chuỗi và xác định xem chuỗi có phải là đối xứng không?
    public static Boolean kiemTraDoiXung(String input) {

        input = input.toLowerCase();
        for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i))
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String a = scanner.nextLine();
        Boolean rs = kiemTraDoiXung(a);
        if (rs) {
            System.out.println("Đối xứng");
        } else {
            System.out.println("Không đối xứng");
        }
    }
}
