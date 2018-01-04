package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class menuItems {
    public static void main(String[] args) {
        File menuitems = new File("C:\\Users\\Mariu\\Desktop\\Linkedin\\Sorting\\src\\com\\company\\menuNoPrices.txt");
        File menuPrices = new File("C:\\Users\\Mariu\\Desktop\\Linkedin\\Sorting\\src\\com\\company\\menuWithPrices.txt");
        String item;
        double price;
        try {
            Scanner input = new Scanner(menuitems);  //takes the items from the file and reads it
            PrintWriter output = new PrintWriter(menuPrices); //prints the new file
            Scanner sc = new Scanner(System.in);  //takes the price input from the user
            while(input.hasNextLine()){    //if file has line
                item = input.nextLine();  //each item is read from each line
                System.out.println("what is the price of this item: " + item); //prints the items
                price = sc.nextDouble();  //asks for price
                sc.nextLine();  //goes to the nextline in the file
                output.print(item); //prints the item in the new file
                output.print("\t");  //adds a space
                output.println(price);  //prints the price in the new file
            }
            output.close();  //closes the new generated file
        }catch (Exception e){
            System.out.println("There was an error: " + e.toString());
        }
    }
}
