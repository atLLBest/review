package com.atguigu;

import com.sun.org.apache.xml.internal.security.utils.JavaUtils;

/**
 * @author ：Shine
 * @description：
 * @date ：2021/3/16 18:44
 */
public class BubbleSort {

    public static void BubbleSort(int[] data) {

        int length = data.length;

        //从小到大排序
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = 0;
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] data = {2, 5, 7, 23, 8, 3, 9, 1};
        BubbleSort(data);
    }
}
