package com.example.hw_aqa_java.HW2_1;

/* 1. Піднесення в степінь.
На вхід програми подається 2 числа.
Вивести в консоль результат піднесення першого числа в степінь другого числа.
 */

import java.util.Scanner;

public class Math1 {
    public static void main (String [] args) {
        System.out.print("Enter the number 1: ");
        Scanner scanOne = new Scanner(System.in);
        int x = scanOne.nextInt();
        System.out.println("You entered " + x);

        System.out.print("Enter the number 2: ");
        Scanner scanTwo = new Scanner(System.in);
        int y = scanTwo.nextInt();
        System.out.println("You entered " + y);
              System.out.println(Math.pow(x, y));
    }
}
