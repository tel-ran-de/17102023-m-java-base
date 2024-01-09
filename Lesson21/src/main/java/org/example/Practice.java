package org.example;

public class Practice {
    public static Integer findMaxValue(Integer[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static Integer[] initArray() {
        Integer[] arr = {1, 2, 3};
        return arr;
    }
}
