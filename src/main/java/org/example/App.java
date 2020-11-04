package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //System.out.print( "enter number:" );
        //int num1= reader.nextInt();
        // System.out.print("enter number:");
        // int num2= reader.nextInt();
        //if (num2!=0){
        // float res= (float) num1/num2;
        // System.out.println(res);}
        // else
        // System.out.println("det går inte");
        System.out.println("enter your grade:");
        float grade = reader.nextFloat();
        if (grade > 0 && grade < 10)
            System.out.println("ey tanbal");
        else if (10 < grade && grade <15) {
            System.out.println("talash kon dokhtaram");
        }
        else if (15 < grade && grade < 20)
            System.out.println("khak too saret kharkhoon");


    }
}
