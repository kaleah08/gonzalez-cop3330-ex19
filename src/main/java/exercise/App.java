package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your weight? ");
        String firstString = input.next();
        int weight = Integer.parseInt(firstString);

        System.out.print("What is your height? ");
        String secondString = input.next();
        double height = Double.parseDouble(secondString);

        double bmi = (weight / (height * height)) * 703;


        if(  bmi >= 18.5 ){
            System.out.println("Your BMI is " + String.format("%.1f",bmi) + "\n" + "You are within the ideal weight range.");

        }
        else if( bmi >= 25  ){
            System.out.println("Your BMI is " + String.format("%.1f",bmi) + "\n" + "You are overweight. You should see your doctor.");

        }
        else{
            System.out.println("Your BMI is " + String.format("%.1f",bmi) + "\n" + "You are underweight. You should see your doctor.");

        }

        }

    }

