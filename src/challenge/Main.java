package challenge;

import java.util.ArrayList;

public class Main {

    // Given an array of integers num and integer target
    // return indices of the two numbers such that they add up to target.
    // You may assume that each input would have exactly one solution
    // And you may not use the same element twice.
    // You can return the answer in any order

    public static void main(String[] args) {

        int[] num = {3,2,4};
        int target = 6;

        System.out.println(checkNum(num, target));

    }

    public static ArrayList<Integer> checkNum(int[] num, int target){

        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < num.length; i++){

            try {

                if ((num[i] + num[i + 1]) == target) {

                    indices.add(i);
                    indices.add(i + 1);

                }

            } catch (Exception e) {

                break;

            }

        }

        return indices;

    }

}
