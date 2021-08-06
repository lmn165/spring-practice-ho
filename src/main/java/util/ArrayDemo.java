package util;

import lombok.Data;

import java.util.Arrays;

public class ArrayDemo {

    public int[] fill(int number){
        int[] arr = new int[5];
        Arrays.fill(arr,  number);
        return arr;
    }
    public int[] copy(int[] arr){
        int[] copyArray = new int[5];
        System.arraycopy(arr, 0, copyArray, 1, 2);
        return copyArray;
    }
}
