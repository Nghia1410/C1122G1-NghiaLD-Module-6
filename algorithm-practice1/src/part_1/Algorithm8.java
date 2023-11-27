package part_1;

public class Algorithm8 {
    public static void main(String[] args) {
        int n = 5;
        hienThiMaTran(n);
    }

    static void hienThiMaTran(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i == j) ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}

