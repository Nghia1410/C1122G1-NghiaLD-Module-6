package part_2;

import java.util.Scanner;

public class Algorithm1 {
    static void kiemTraChuoi(String n) {
        StringBuilder s = new StringBuilder(n);
        System.out.println(s.reverse());
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi để kiểm tra: ");
        String n=scanner.nextLine();
        kiemTraChuoi(n);
    }
}
