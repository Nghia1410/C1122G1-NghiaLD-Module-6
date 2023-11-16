
import java.util.Scanner;

public class Algorithm5 {
    //Viết chương trình nhập vào một chuỗi và xác định xem chuỗi có phải là đối xứng không?
    public static Boolean KiemTraDoiXung(String input) {
        input = input.toLowerCase();
        for (int i = 0, j = input.length() - 1 - i; i < input.length() / 2; i++,j--) {
                if (input.charAt(i) != input.charAt(j)) {
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String a = scanner.nextLine();
        Boolean rs = KiemTraDoiXung(a);
        if (rs) {
            System.out.println("Đối xứng");
        } else {
            System.out.println("Không đối xứng");
        }
    }
}
