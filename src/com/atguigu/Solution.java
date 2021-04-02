package com.atguigu;

/**
 * @author ：Shine
 * @description：
 * @date ：2021/3/30 21:34
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        int[] moveArray = moveArray(nums, k);

        for (int i = 0; i < moveArray.length; i++) {
            System.out.println("第" + i + "个" + moveArray[i]);
        }

        int count = count(1019);
        System.out.println("count = " + count);
    }


    public static int[] moveArray(int[] nums, int k) {
        //编写代码，对于一个含有n个元素的数组nums，将它的所有元素向后移动k位。
        // 示例：nums={1,2,3,4,5,6,7}    k=2
        // 输出：{6,7,1,2,3,4,5}
        int[] newArr = new int[nums.length];
        int newK = k % nums.length;

        for (int i = newK; i < nums.length; i++) {
            newArr[i] = nums[i - newK];
        }

        for (int i = 0; i < newK; i++) {
            newArr[i] = nums[nums.length - newK + i];
        }
        return newArr;
    }

    //(1024-n)/64

    public static int count(int n) {
        return (1024 - n) / 64 + (1024 - n) % 64 / 16 + (1024 - n) % 64 % 16 / 4 + (1024 - n) % 64 % 16 % 4;
    }

}
