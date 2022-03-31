package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {

    public static void main(String[] args) throws IOException{
        RectAr bc = new RectAr();

        bc.GetData();
        bc.ComputeField();
        bc.ResultDisplay();


    }

}

class RectAr{
    double a, b, Ar;

    void GetData() throws IOException
    {

        BufferedReader ms = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to area calculation program.");
        System.out.println("You can count area for rectangle.");
        System.out.println("Please Enter your length of rectangle a: ");
        a = Double.parseDouble(ms.readLine());
        System.out.println("Please Enter your width of rectangle b: ");
        b = Double.parseDouble(ms.readLine());

    }

    void ComputeField()

    {

        Ar = a * b;

    }

    void ResultDisplay()

    {

        System.out.println("The area of rectangle for length a : ");
        System.out.printf(String.valueOf(a));
        System.out.println("and width b :  ");
        System.out.printf(String.valueOf(b));
        System.out.println("which is : ");
        System.out.printf(String.valueOf(Ar));

    }

}

