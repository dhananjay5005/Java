package com.company;

import java.util.Scanner;

public class Reverce{

    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int i = in.nextInt();
       StringBuffer tb = new StringBuffer(String.valueOf(i));
       tb.reverse();
       System.out.println(tb);
   }
}
