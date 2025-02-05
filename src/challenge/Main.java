package challenge;

import java.util.ArrayList;
import java.util.Arrays; // Import for easier array printing

public class Main {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Return int[] directly
                }
            }
        }
        return new int[0]; // Return empty int[] if no solution is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Main solution = new Main(); // Create an instance of your class
        int[] result = solution.twoSum(nums, target); // Call the method

        System.out.print("[");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            if(i < result.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}