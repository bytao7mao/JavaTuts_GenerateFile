package com.company;

public class SelectionSortDerekBanas {

    public static void srt(int[] array ){
        for (int x = 0; x < array.length; x++){ //this is unordored array
            int min = x;
//            System.out.println("this is array length " + (array.length -1));
//            System.out.println("OUTER LOOP is " + x + "\n");
            for (int y = x + 1; y < array.length;y++){//here is ordered array
                if(array[min]>array[y]){
//                    System.out.println("INNER LOOP if " + array[minimum] + " is > than " + array[y]);
                        min=y;
//                    System.out.println(" minimum is " + minimum + " and the value is " +array[y]+ "\n");
                }
            }
            swap(array, x, min);
//            System.out.println(x + " is swaped with " + minimum);
        }
    }
    private static void swap(int array[], int a, int minim){
        int temp = array[a];
        array[a] = array[minim];
        array[minim] = temp;
    }
}
