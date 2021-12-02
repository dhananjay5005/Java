package com.company;

public class ReverseNum{
    public static void main(String[] args){
        int i = 654321;
        int sum = 0;
        while (i>0){
            sum = sum * 10+i%10;
            i = i/10;
        }
        System.out.println(sum);
    }
}
