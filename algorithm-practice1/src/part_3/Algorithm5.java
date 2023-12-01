package part_3;

public class Algorithm5 {
    //Viết chương trình in bảng cửu chương từ 2 đến 9.
    static void multiplicationTable() {
        int sum;
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 9; j++) {
                sum = i * j;
                System.out.print(j+" x "+i+" ="+sum+"     ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        multiplicationTable();
    }
}
