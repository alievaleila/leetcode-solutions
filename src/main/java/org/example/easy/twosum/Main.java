package org.example.easy.twosum;

import static org.example.easy.twosum.TwoSum.twoSum;

public class Main {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=twoSum(nums,target);

        System.out.println("Indeks cutleri: ["+ result[0]+" ,"+result[1]+ " ]");

    }
}
