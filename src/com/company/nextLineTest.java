package com.company;

import java.util.Scanner;

public class nextLineTest {
    public static void main(String[] args){
        String s = "Hello World! \n 3 + 3.0 = 6 ";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // print the next line
        System.out.println("print the next line" + scanner.nextLine());

        // returns boolean
        System.out.println("check if there is a next line again" + scanner.hasNextLine());

        // print the next line
        System.out.println("print the next line\"" + scanner.nextLine());

        // check if there is a next line again
        System.out.println("check if there is a next line again" + scanner.hasNextLine());
    }


}
