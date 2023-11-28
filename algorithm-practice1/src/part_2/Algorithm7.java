package part_2;

import java.util.Scanner;

public class Algorithm7 {
    //    Viết chương trình nhập vào một số gồm 3 chữ số; in ra chữ số hàng trăm, hàng chục, hàng đơn vị
    static void checkUnit(Integer a) {
        String b = a.toString();
        for (int i = 0; i < b.length(); i++) {
            if (i == 0) {
                System.out.println("chữ số " + b.charAt(i) + " là hàng trăm");
            }
            if (i == 1) {
                System.out.println("chữ số " + b.charAt(i) + " là hàng chục");
            }
            if (i == 2) {
                System.out.println("chữ số " + b.charAt(i) + " là hàng đơn vị");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        Integer a = null;
        do {
            flag = false;
            try {
                System.out.print("Nhập vào một số 3 chữ số: ");
                a = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                flag = true;
            }
            if (String.valueOf(a).length() != 3 || flag) {
                System.out.println("Vui lòng nhập lại!!!");
            }
        } while (String.valueOf(a).length() != 3 || flag);
        checkUnit(a);

    }
}
