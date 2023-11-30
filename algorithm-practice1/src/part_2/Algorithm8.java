package part_2;

public class Algorithm8 {

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 7, 1, 15, 3, 9};

        int maxValue = findMaxValue(arr);
        int minValue = findMinValue(arr);

        System.out.println("Giá trị lớn nhất: " + maxValue);
        System.out.println("Giá trị nhỏ nhất: " + minValue);
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}

