package com.example.hw_aqa_java.HW2_1;
/* 2. Розрахувати місячну і річну зарплатню з податками та без.(30 балів)
На вхід програми подається 3 числа: кількість робочих годин на тиждень, вартість години та вісоток податку.
Враховувати, що кожен місяць скаладається з 4 тижнів, в році 12 місяців.
Вивести в консоль за прикладом:
Зарплатня на місяць без податків: ххх
Зарплатня на місяць з податками: ххх
Зарплатня на рік без податків: ххх
Зарплатня на рік з податками: ххх
 */

public class Math2 {
    public static void main (String [] args) {
        int salaryPerHourDoll = 10;
        int hoursPerWeek = 40;
        float taxCoefficient = 0.805F;
        System.out.println ("Salary in dollars per month without tax:" + (salaryPerHourDoll*hoursPerWeek*4));
        System.out.println ("Salary in dollars per month including tax:" + (salaryPerHourDoll*hoursPerWeek*4*taxCoefficient));
        System.out.println("Salary in dollars per year without tax:" + (salaryPerHourDoll*hoursPerWeek*48));
        System.out.println("Salary in dollars per year including tax:" + (salaryPerHourDoll*hoursPerWeek*48*taxCoefficient));

    }
}
