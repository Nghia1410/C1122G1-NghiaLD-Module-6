import java.util.Scanner;

public class Algorithm4 {
    //Viết chương trình nhập vào một chuỗi và in ra chuỗi ngược lại.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập một chuỗi : ");
        String a = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(a);
        System.out.println(stringBuilder.reverse());
    }
}
