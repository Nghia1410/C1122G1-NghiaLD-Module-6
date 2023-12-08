package part_3;

public class Algorithm3 {
    // Hãy liệt kê các số hoàn thiện nhỏ hơn 5000
    public static void main(String[] args) {
        System.out.println("Các số hoàn thiện nhỏ hơn 5000 là:");
        for (int i = 2; i < 5000; i++) {
            if (soHoanThien(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean soHoanThien(int number) {
        int tongUocSo = 1;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                tongUocSo += i;
            }
        }

        return (tongUocSo == number);
    }
}

