package part_2;

import java.util.Scanner;

public class Algorithm3 {
    //Viết chương trình in diện tích hình tam giác, tròn , vuông, chữ nhật
    static void dienTichTamGiac(Integer a, Integer h) {
        int s = (a * h) / 2;
        System.out.println("Diện tích tam giác là:"+s);
    }

    static void dienTichHinhTron(Double r) {
        double t = (Math.PI * (r * r));
        System.out.println("Diện tích hình tròn là:"+t);
    }

    static void dienTichHinhVuong(Integer b) {
        int v = b * b;
        System.out.println("Diện tích hình vuông là:"+v);
    }

    static void dienTichHinhChuNhat(Integer d, Integer r) {
        int n = d * r;
        System.out.println("Diện tích hình chữ nhật là:"+n);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính diện tích tam giác ");
        System.out.println("Nhập độ dài cạnh đáy: ");
        Integer a = scanner.nextInt();
        System.out.println("Nhập chiều cao: ");
        Integer b = scanner.nextInt();
        dienTichTamGiac(a, b);

        System.out.println("Tính diện tích hình tròn ");
        System.out.println("Nhập bán kính của hình tròn: ");
        Double c = scanner.nextDouble();
        dienTichHinhTron(c);

        System.out.println("Tính diện tích hình vuông ");
        System.out.println("Nhập độ dài của cạnh : ");
        Integer d = scanner.nextInt();
        dienTichHinhVuong(d);

        System.out.println("Tính diện tích hình chữ nhật ");
        System.out.println("Nhập chiều dài: ");
        Integer e = scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        Integer f = scanner.nextInt();
        dienTichHinhChuNhat(e, f);

    }
}
