package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double weight, height;
        double total;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your weight(kg): ");
        weight = input.nextDouble();
        System.out.print("Enter your height(m): ");
        height = input.nextDouble();

        total = weight/(height*height);
        System.out.println("Your audience index: " + total);
    }
}
