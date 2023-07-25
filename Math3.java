package com.example.hw_aqa_java.HW2_1;
import java.util.Scanner; // Import the Scanner class

/* 3. Розрахувати вартість години.(30 балів)
        Програма по черзі запитує 3 числа: кількість робочих годин на тиждень, річна зарплатня з податками та вісоток податку.
        Розрахувати вартість години часу без податку.
        Враховувати, що кожен місяць скаладається з 4 тижнів, в році 12 місяців.
        Вивести результат в консоль за прикладом:
        При ххх робочих годин на тиждень з річною зарплатею в ххх та податком хх%
        година часу коштує ххх
 */

public class Math3 {
    public static void main(String[] args) {
        System.out.print("Enter the number of working hours per week: ");
        Scanner scanOne = new Scanner(System.in);
        int workHourWeek = scanOne.nextInt();
        System.out.println("You entered " + workHourWeek);

        System.out.print("Enter annual salary in dollars with taxes: ");
        Scanner scanTwo = new Scanner(System.in);
        int yearSalWith = scanTwo.nextInt();
        System.out.println("You entered " + yearSalWith);

        System.out.print("Enter tax rate: ");
        Scanner scanThree = new Scanner(System.in);
        int taxRate = scanThree.nextInt();
        System.out.println("You entered " + taxRate);

        int perHour = yearSalWith/(1+(taxRate/100))/48/workHourWeek;
        System.out.println("With " + workHourWeek + " working hours per week with an annual salary " + yearSalWith + " and a tax of " + taxRate+ " an hour of working time is worth " + perHour);

        }
    }

