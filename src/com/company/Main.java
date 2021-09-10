package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a1;
        double b1;
        double c1;
        double a2;
        double b2;
        double c2;
        double x;
        double y;
        double d1;
        double d2;
        double d3;

        a1 = in.nextDouble();
        b1 = in.nextDouble();
        c1 = in.nextDouble();
        a2 = in.nextDouble();
        b2 = in.nextDouble();
        c2 = in.nextDouble();

        c1 =-c1;
        c2 =-c2;
        d1 = a1*b2-a2*b1;
        d2 = c1*b2-b1*c2;
        d3 = c2*a1-a2*c1;
        if (d1 == 0) {

            if (d1 == d2) {System.out.println("Бесконечное число решений");}
            else {System.out.println("Система решений не имеет");}
        }
        else{
            x = d2/d1;
            y = d3/d1;
            System.out.println("x = " + x + "  y = " + y );
        }
    }
}
