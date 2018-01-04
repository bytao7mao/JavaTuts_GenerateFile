package com.company;

public class InsertionSort {
    public static void insertionSort(int[] num){
        int key,i,j;
        for( j = 1; j< num.length; j++){ //start with 1 (not 0)
            //if array = {30, 2, 40, 1}
            //key will be [2]
            key = num[j];

            for (i=j-1; (i>=0) && (num[i] > key); i--) //will run as long as i>=0
            { // if index 0 => 30 is > index 1(key) => 2 then
                num[i+1] = num[i];   //smaller values are moving up
            }

            num[i+1] = key; //put the key in its location -- switch the numbers
        }
    }
}


// 1st iteration array = {2, 30, 40, 1} and 30 > 40 will be compared,
//and num[i+1] = num[i] will not run
//num[i+1] which is 40 will be the key
//then j will be 1 and num[i] which is 40 will be compared to 1 and will switch
// the array will be {2, 30, 1, 40}
//the inner loop will continue running because it will compare 30 to 1 and switch them
// the new array {2, 1, 30, 40} and will run again the inner loop
//the finish arrau will be {1, 2, 30, 40}