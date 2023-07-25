package com.example.hw_aqa_java.HW4_1;

import java.util.Scanner;
import java.util.Arrays;
/* 1. Фігури (40 балів)  Програма запитує користувача, яку з фігур намалювати.
        В залежності від фігури програма запитує аргументи для фігури.
        Вивести фігури за прикладом:
        - прямокутник (аргументи: висота і ширина)
*********
*********
*********
*********
        - прямокутний трикутник (аргумент: висота) (прямий кут зліва внизу)
*
**
***
****
*****
        - зворотній прямокутний трикутник (аргумент: висота) (прямий кут зправа внизу)
    *
   **
  ***
 ****
*****
        - трикутник (аргументи: висота)
    *
   ***
  *****
 *******
*********
        Після виводу фігури програма має запитати чи хоче користувач вивести ще одну фігуру.
        У випадку 'yes' програма знову запитує яку саме фігуру і т.д.
        У випадку 'no' програма завершує свою роботу.
        (Програма не має завершитись поки користувач не введе 'no')
*/
public class MoComProg1 {
    public static void main(String[] args) {
        System.out.println("Choose which figure to draw?");
        System.out.println("прямокутник (аргументи: висота і ширина, введіть - 1");
        System.out.println("прямокутний трикутник (аргумент: висота) (прямий кут зліва внизу), введіть -2");
        System.out.println("зворотній прямокутний трикутник (аргумент: висота) (прямий кут зправа внизу), введіть -3");
        System.out.println("трикутник (аргументи: висота), введіть -4");
        {



//        1. rectangle (прямокутник(аргументи: висота і ширина))
       /* for(int i=0; i<5; i++){
            for(int j=0; j<6; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int count = 8;
        for (int i = 0; i < count; i++) {
            for (int k = 0; k + 1 < i + 1; k++) {
                System.out.print("*");

        */
//        2.  right triangle (прямокутний трикутник (аргумент: висота) (прямий кут зліва внизу)
        /*    int count = 8;
            for (int i = 0; i < count; i++) {
                for (int k = 0; k <= 2 * i; k++) {
                    if (k < i) System.out.print("*");
                    else System.out.print("*");
                }
                System.out.println();
            }
       */
        /*
 //        3. inverse right triangle (зворотній прямокутний трикутник (аргумент: висота) (прямий кут зправа внизу)
           Scanner input = new Scanner(System.in);
            System.out.print("Введите высоту прямоугольного треугольника для печати:");
            int rows = input.nextInt();
            for (int row = 1; row <= rows; row++) {
                for (int col = 1; col <= rows; col++) {
                    System.out.print((col <= (rows - row)) ? " " : "*");
                }
                System.out.println();
            }
        }
         */
//         4. isosceles triangle (рівнобедрений трикутник (аргументи: висота))
 /*         Scanner input = new Scanner(System.in);
            System.out.print("Введите высоту равнобедренного треугольника для печати:");
            int rows = input.nextInt();
            // Вывести равнобедренный треугольник
            for (int i = 0; i <= rows; i++) {
                // Распределение пространства
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Распределение символов
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
*/

