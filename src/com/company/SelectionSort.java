package com.company;

public class SelectionSort {
    public static void selectionSort(int[] num){
        int i, j, first, temp;
        for (i=num.length-1; i >0; i--){ //if length is 5 will iterate 5 times
            first = 0;
                for(j=1; j<=i; j++){
                    if(num[j] > num[first])
                        first = j;
                }
            temp = num[first];
            num[first] = num[i];
            num[i] = temp;
        }
    }


}
