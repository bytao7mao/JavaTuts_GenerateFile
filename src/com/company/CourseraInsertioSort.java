package com.company;

public class CourseraInsertioSort {
    public static void InsertionSort(int[] vals) {

        int currInd;
        int temp;
        for (int pos = 1; pos < vals.length; pos++) {

            currInd = pos;

            while (currInd > 0 && vals[currInd] < vals[currInd - 1]) {
                temp = vals[currInd];
                vals[currInd] = vals[currInd - 1];
                vals[currInd - 1] = temp;
                currInd--;
            }

        }
    }

    public static void main (String[] args){
        int[] v = {200, 1, 34214, 22};
        InsertionSort(v);
        for (int x : v) {
            System.out.print(" " + x);
        }

    }

}
