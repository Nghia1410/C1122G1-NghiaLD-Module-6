package part_2;

import java.util.Scanner;

public class Algorithm6 {
    //    Viết chương trình nhập vào một chuỗi; in chuỗi theo các từ, mỗi từ một dòng
    static void solve(String a){
        for (int i = 0; i <a.length() ; i++) {
            System.out.println(a.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi ký tự:");
        String a=scanner.nextLine();
        solve(a);
    }
}
