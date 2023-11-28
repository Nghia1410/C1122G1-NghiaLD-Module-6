package part_2;

import java.util.ArrayList;
import java.util.List;

public class Algorithm4 {

//    public static List<List<Integer>> getPermutations(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        permute(nums, 0, result);
//        return result;
//    }
//
//    private static void permute(int[] nums, int start, List<List<Integer>> result) {
//        if (start == nums.length - 1) {
//            // Clone the array and add it to the result
//            result.add(cloneArray(nums));
//            return;
//        }
//
//        for (int i = start; i < nums.length; i++) {
//            // Swap the current element with the element at index 'start'
//            swap(nums, i, start);
//
//            // Recursively permute the rest of the array
//            permute(nums, start + 1, result);
//
//            // Backtrack - undo the swap for the next iteration
//            swap(nums, i, start);
//        }
//    }
//
//    private static void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//
//    private static List<Integer> cloneArray(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        for (int num : nums) {
//            list.add(num);
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//        int n = 3;  // Số phần tử
//        int[] elements = new int[n];
//        for (int i = 0; i < n; i++) {
//            elements[i] = i + 1;
//        }
//
//        List<List<Integer>> allPermutations = getPermutations(elements);
//
//        for (List<Integer> permutation : allPermutations) {
//            System.out.println(permutation);
//        }
//    }
}

