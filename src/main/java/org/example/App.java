/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String sex="", ounces="", weight="", hours="";
        boolean check=true;
        int s=0, oz=0, wei=0, h=0;
        double bac=0.0, ratio=0.0;

        do{
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            sex=sc.nextLine();
            try{
                s = Integer.parseInt(sex);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
        }while(check==false);
        do{
            System.out.print("How many ounces of alcohol did you have? ");
            ounces=sc.nextLine();
            try{
                oz = Integer.parseInt(ounces);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
        }while(check==false);
        do{
            System.out.print("What is your weight, in pounds? ");
            weight=sc.nextLine();
            try{
                wei = Integer.parseInt(weight);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
        }while(check==false);
        do{
            System.out.print("How many hours has it been since your last drink? ");
            hours=sc.nextLine();
            try{
                h = Integer.parseInt(hours);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
        }while(check==false);

        if(s==1){
            ratio=0.73;
        }
        else{
            ratio=0.66;
        }

        bac=(oz*5.14/wei*ratio)-(0.015*h);
        System.out.printf("Your BAC is %.6f", bac);

        if(bac<0.08){
            System.out.printf("\nIt is legal for you to drive.");
        }
        else{
            System.out.printf("\nIt is not legal for you to drive.");
        }

    }
}