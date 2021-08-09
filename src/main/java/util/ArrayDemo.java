package util;

import java.util.Arrays;

public final class ArrayDemo {

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
    public int[] createIntegerArray(int start, int end){
        int[] integerArray = new int[end-start];
        for (int i=0; i < integerArray.length; i++){
            integerArray[i] = start++;
        }
        return integerArray;
    }
}
