package com.NBA.JAVA;

import java.util.Arrays;

//冒泡排序算法
public class TestBubbleSort {
    public static void bubbleSort(int[] values) {
        int temp;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] values = {11, 2, 8, 12, 34, 4, 15};
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }


}
