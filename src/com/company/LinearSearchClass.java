package com.company;

import java.util.Scanner;

public class LinearSearchClass {
    public static void searchFor(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to search for: ");
        int arVal = sc.nextInt();
        int pos = 0;
        boolean found = false;
        while(pos < array.length && !found){
            if(array[pos] == arVal){
                found = true;
            } else { pos++;}
        }
        if (found){
            System.out.println("Found at position: " + pos);
        } else {
            System.out.println("Can't find your value !");
        }
    }
}
