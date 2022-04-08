package com.Dania.question;

import java.util.Scanner;

import static java.lang.Integer.*;

// given two integers A and B, write a program to add these two numbers and output it.
public class One {
    public static  void main(String args[])
    {


        int c;
        System.out.println("print First number");
        System.out.println("print Second number");

        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);


        int first =scan.nextInt();
        int second =scan1.nextInt();

        c=first+second;

        System.out.println("The result is :"+c);







    }
}
