package com.company;
import java.util.Scanner;

public class IncrementingAlgo {



public static void method() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        String r = "";
        int x = i;
        int j = x;

        for (j = x + 1; j < n + 1; j++) {
            r += j - x;
        }

        System.out.println(r);
        }
    }

    public static void main(String[] args){
    method();
    }
}
