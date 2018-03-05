package com.company;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static com.company.LinearSearchClass.searchFor;
import static com.company.SelectionSort.selectionSort;

public class Main {
    public static int add(int a, int b){
        return a + b;
    }



    public static void main(String[] args) {

        add(3,4);
        //generator of a random array
        int[] randomArray = new int[5]; //length of the array = 5
        Random rand = new Random(); //initializer
        for (int i=0; i < randomArray.length; i++){ //loop to generate
            randomArray[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(randomArray)); //prints the array

        LinearSearchClass.searchFor(randomArray); //the method created by me !! LOL









        //read from file randoms
//        File file = new File("C:\\Users\\Mariu\\Desktop\\Linkedin\\Sorting\\src\\com\\company\\answers.txt");
//        ArrayList<String> theString = new ArrayList<String>();
//        String answer, response = "y";
//        try {
//            Scanner input = new Scanner(file);
//            while(input.hasNextLine()) //result boolean true if input has next line
//            {
//
//                answer = input.nextLine(); //moving the String 'answer' to answer.txt data
//
//                theString.add(answer); //adding the answer from txt file to theString
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println("The input file \"answers.txt\" was not found.");
//            System.out.println(e.toString());
//        }
//        Scanner in = new Scanner(System.in);
//        while(response.equalsIgnoreCase("y"))
//        {
//            System.out.println("The fortune teller is ready for you \n"
//                    + "Please think about your question in your mind\nand hit enter for your "
//                    + "reply.");
//            in.nextLine();
//            System.out.println("The fortune teller says: \"" +
//                    theString.get(rand.nextInt(theString.size()))+"\"\n");
//            System.out.println("Do you have another question? (y/n)");
//            response = in.nextLine();
//        }









        // create any file customers.txt
//        Scanner sc = new Scanner(System.in);
//        File output = new File("C:\\Users\\Mariu\\Desktop\\Linkedin\\Sorting\\src\\com\\company\\fisierulluidani.txt");
//        String name;
//        System.out.println("Enter customer name: ");
//        name = sc.nextLine(); //prints output
//        try {
//            PrintWriter out = new PrintWriter(output);  //create file
//            while(!name.equalsIgnoreCase("done")){
//                out.println(name);
//                System.out.println("Enter the next name or \"done\" to exit");
//                name = sc.nextLine();
//            }
//            out.close();
//        }catch (Exception e){
//            System.out.println("error occured " + e.toString());
//        }
    } //end of public static void main(String[] args)
}
