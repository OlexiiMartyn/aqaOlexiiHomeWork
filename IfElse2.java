package com.example.hw_aqa_java.HW3_1;
import java.util.Scanner;
/* 2. Розрахувати вартість товару
На вхід програми подається вартість товару за одиницю.
Програма запитує кількість товару, яку ви хочете придбати.
Програма має розрахувати загальну суму товару виходячи з наступних правил:
- якщо кількість товару більше 10, то знижка 5%;
- якщо кількість товару більше 20, то знижка 10%;
- якщо кількість товару більше 30, то знижка 12% + 0,4% за кожні додаткові 10 одиниць товару (перші 30 не враховуються)
(31шт - 12%, 41шт - 12,4%, 51 - 12,8% і т.д.)
- якщо кількість товару більше 80, знижка 13%.   (предлагаю скидку 14%!))
   Коэфициент1 = 100 (1-10ед.товара)
   Коэфициент2 = 95 (11-20ед.товара)
   Коэфициент3 = 90 (21-30ед.товара)
   Коэфициент4 = 88 (31-40 ед.товара)
   Коэфициент5 = (0,88-0,004 = 0,876) (41-50 ед.товара)
   Коэфициент6 = (0,88-0,008 = 0,872) (51-60 ед.товара)
   Коэфициент7 = (0,88-0,012 = 0,868) (61-70 ед.товара)
   Коэфициент8 = (0,88-0,016 = 0,864) (71-80 ед.товара)
   Коэфициент9 = 0,87 (81ед.товара и более)
*/
public class IfElse2 {
    public static void main(String[] args) {
        int unitPrice = 100;
        System.out.println("Price per unit of goods 100 UAH, please enter the quantity of goods you want to purchase: ");
        Scanner input = new Scanner(System.in);
        int sumGoods = input.nextInt();
        int sumPay = unitPrice * sumGoods;
        if (sumGoods >= 1 && sumGoods <= 10) {
            System.out.println("Your purchase amount is: " + (sumPay));
        } else if (sumGoods >= 11 && sumGoods <= 20) {
            System.out.println("Your purchase amount is: " + (sumPay / 100 * 95));
        } else if (sumGoods >= 21 && sumGoods <= 30) {
            System.out.println("Your purchase amount is: " + (sumPay / 100 * 90));
        } else if (sumGoods >= 31 && sumGoods <= 40) {
            System.out.println("Your purchase amount is: " + (sumPay / 100 * 88));
        } else if (sumGoods >= 41 && sumGoods <= 50) {
            System.out.println("Your purchase amount is: " + (sumPay / 1000 * 876));
        } else if (sumGoods >= 51 && sumGoods <= 60) {
            System.out.println("Your purchase amount is: " + (sumPay / 1000 * 872));
        } else if (sumGoods >= 61 && sumGoods <= 70) {
            System.out.println("Your purchase amount is: " + (sumPay / 1000 * 868));
        } else if (sumGoods >= 71 && sumGoods <= 80) {
            System.out.println("Your purchase amount is: " + (sumPay / 1000 * 864));
        } else if (sumGoods >= 81) {
            System.out.println("Your purchase amount is: " + (sumPay / 100 * 87));
        } else  System.out.println("You entered incorrect data");

    }
}