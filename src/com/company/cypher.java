package com.company;

public class cypher{

    public static String normalizeText(String text){
        text = text.replace(" ","");
        text = text.replaceAll("[/|!?.,()\"'=;:_^~`´]", "");
        text= text.toUpperCase();
        return text;
        }
    static String cipher(String msg, int shift){
        String s = "";
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) + shift);
            if (c > 'z')
                s += (char)(msg.charAt(x) - (26-shift));
            else
                s += (char)(msg.charAt(x) + shift);
        }
        return s;
    }

    public static void main(String[] args){
        String alt = "abc";
        String x = normalizeText(alt);
        String encrypt = cipher(x, 3);
        System.out.println(encrypt);
    }

}