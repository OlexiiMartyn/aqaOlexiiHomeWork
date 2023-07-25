package com.example.hw_aqa_java.HW3_1;
import java.util.Scanner;

/* 3. Розрахунок зарплатні.
На вхід програми подається номер місяця(1-12), вартість години та вісоток податку.
Розрахувати зарплатню за місяць з та без податку.
Враховувати, що:
    будь-який місяць розпочинається з понеділка
    2 останні дні тижня це вихідні
    один робочий день це 8 годин.
*/

public class IfElse3 {
    public static void main(String[] args) {
        System.out.println("To calculate the monthly salary, enter the number of the month (1-12): ");
        Scanner sc = new Scanner(System.in);
        int numMonth = sc.nextInt();
        int hourlyCost = 40;
        int tax = 20;
        int[] workHoursPerMonth = {184, 160, 184, 176, 184, 176, 184, 184, 176, 184, 176, 184, 40, 20};
        // String[] month = new String[12];
        // System.out.println(args[0]);
         if (numMonth == 1) {
             System.out.println(workHoursPerMonth[0] * hourlyCost + " -January monthly salary");
             System.out.println((workHoursPerMonth[0] * hourlyCost - (workHoursPerMonth[0] * hourlyCost / 100 * tax)) + " -January monthly salary after tax");
         } else if (numMonth == 2) {
            System.out.println(workHoursPerMonth[1] * hourlyCost + " -February monthly salary");
            System.out.println((workHoursPerMonth[1] * hourlyCost - (workHoursPerMonth[1] * hourlyCost / 100 * tax)) + " -February monthly salary after tax");
         } else if (numMonth == 3) {
             System.out.println(workHoursPerMonth[2] * hourlyCost + " -March monthly salary");
             System.out.println((workHoursPerMonth[2] * hourlyCost - (workHoursPerMonth[2] * hourlyCost / 100 * tax)) + " -March monthly salary after tax");
         } else if (numMonth == 4) {
             System.out.println(workHoursPerMonth[3] * hourlyCost + " -April monthly salary");
             System.out.println((workHoursPerMonth[3] * hourlyCost - (workHoursPerMonth[3] * hourlyCost / 100 * tax)) + " -April monthly salary after tax");
         } else if (numMonth == 5) {
             System.out.println(workHoursPerMonth[4] * hourlyCost + " -MAY monthly salary");
             System.out.println((workHoursPerMonth[4] * hourlyCost - (workHoursPerMonth[4] * hourlyCost / 100 * tax)) + " -MAY monthly salary after tax");
         } else if (numMonth == 6) {
             System.out.println(workHoursPerMonth[5] * hourlyCost + " -JUN monthly salary");
             System.out.println((workHoursPerMonth[5] * hourlyCost - (workHoursPerMonth[5] * hourlyCost / 100 * tax)) + " -JUN monthly salary after tax");
         } else if (numMonth == 7) {
             System.out.println(workHoursPerMonth[6] * hourlyCost + " -JULY monthly salary");
             System.out.println((workHoursPerMonth[6] * hourlyCost - (workHoursPerMonth[6] * hourlyCost / 100 * tax)) + " -JULY monthly salary after tax");
         } else if (numMonth == 8) {
             System.out.println(workHoursPerMonth[7] * hourlyCost + " -OUG monthly salary");
             System.out.println((workHoursPerMonth[7] * hourlyCost - (workHoursPerMonth[7] * hourlyCost / 100 * tax)) + " -OUG monthly salary after tax");
         } else if (numMonth == 9) {
             System.out.println(workHoursPerMonth[8] * hourlyCost + " -SEP monthly salary");
             System.out.println((workHoursPerMonth[8] * hourlyCost - (workHoursPerMonth[8] * hourlyCost / 100 * tax)) + " -SEP monthly salary after tax");
         } else if (numMonth == 10) {
             System.out.println(workHoursPerMonth[9] * hourlyCost + " -OCT monthly salary");
             System.out.println((workHoursPerMonth[9] * hourlyCost - (workHoursPerMonth[9] * hourlyCost / 100 * tax)) + " -OCT monthly salary after tax");
         } else if (numMonth == 11) {
             System.out.println(workHoursPerMonth[10] * hourlyCost + " -NOW monthly salary");
             System.out.println((workHoursPerMonth[10] * hourlyCost - (workHoursPerMonth[10] * hourlyCost / 100 * tax)) + " -NOW monthly salary after tax");
         } else if (numMonth == 12) {
             System.out.println(workHoursPerMonth[11] * hourlyCost + " -DEC monthly salary");
             System.out.println((workHoursPerMonth[11] * hourlyCost - (workHoursPerMonth[11] * hourlyCost / 100 * tax)) + " -DEC monthly salary after tax");
         } else  System.out.println("You entered incorrect data");
    }
}
