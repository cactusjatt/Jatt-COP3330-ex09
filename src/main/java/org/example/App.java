/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        float conv = 350;
        int l, w;
        System.out.print("What is the length of room in feet? ");
        l = in.nextInt();
        System.out.print("What is the width of room in feet? ");
        w = in.nextInt();
        int area = l * w;

        float gallons = (float) Math.ceil(area / conv);
        String s = String.format("You will need to purchase %.0f gallons of paint to cover %d square feet.", gallons, area);
        System.out.println(s);

        in.close();
    }
}