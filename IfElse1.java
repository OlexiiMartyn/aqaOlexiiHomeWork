package com.example.hw_aqa_java.HW3_1;
import java.util.Scanner;

/* 1. Інформація про число
 Програма запитує у корисутвача число.
 Результатом програми має бути інформація про число:
     парне/непарне
    додатнє/від'ємне
    просте/складене
 */

public class IfElse1 {
    public static void main(String[] args) {
        //  input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me please a number for analyze");
        int number = scanner.nextInt();
        boolean isOdd;
        boolean isSimple = true;
        boolean isPositive;

        if (number == 0) {
            System.out.println("The number is  0");
        } else {
            // odd/even
            if (number % 2 == 0) {
                isOdd = true;
            } else {
                isOdd = false;
            }
            //           isOdd = number % 2 == 0;

            // positive/negative
            if (number > 0) {
                isPositive = true;
            } else {
                isPositive = false;
            }
            //        isPositive = number > 0;

            // simple/complex
            if (isPositive) {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isSimple = false;
                        break;
                    }
                }
            }

            // output
            String resultMessage;
            String positiveOrNegative = isPositive ? " positive" : " negative";
            String oddOrEven = isOdd ? "odd" : "even";
            String simpleOrComplex = isSimple ? "simple" : "complex";

            if (!isPositive) {
                resultMessage = "The number " + number + " is:"
                        + positiveOrNegative + " "
                        + oddOrEven + " ";
            } else {

            resultMessage = "The number " + number + " is:"
                    + positiveOrNegative + " "
                    + oddOrEven + " "
                    + simpleOrComplex;
            }
            System.out.println(resultMessage);
        }
    }

}








