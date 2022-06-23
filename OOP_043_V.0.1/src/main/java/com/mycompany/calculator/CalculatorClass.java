/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author Rkib
 */
public class CalculatorClass {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Calculator cal = new Calculator();

        while (true) {

            System.out.println("");

            System.out.println("------------------------------- Calculator --------------------------------");

            System.out.println("");

            System.out.println("1. Sum\t\t 2. Sub\t\t 3. Div\t\t 4. Multiply\t 5. Modulus");

            System.out.println("");

            System.out.println("6. Root\t\t 7. x!\t\t 8. ln()\t 9. log()\t 10. sinx");

            System.out.println("");

            System.out.println("11. cosx\t 12. tanx\t 13. scex\t 14. cosecx\t 15. cotx");

            System.out.println("");

            System.out.println("16. Sin-1 x\t 17. cox-1 x\t 18. tan-1 x\t 19. exp(x)\t 20. log10");

            System.out.println("");

            System.out.println("21. pow(x, y)\t 22. x-1\t 23. Exit\t");

            System.out.println("");

            System.out.print("Choice your suitable option : ");

            int n = s.nextInt();

//            while (n != 23) {
//
//                System.out.print("Enter total number of input : ");
//
//                int size = s.nextInt();
//
//                if(size == 1) {
//
//                    System.out.print("Enter any one number : ");
//
//                    cal.x = s.nextDouble();
//
//                } 
//                else if (size == 2) {
//
//                    System.out.print("Enter any two number : ");
//
//                    cal.x = s.nextDouble();
//                    cal.y = s.nextDouble();
//
//                } 
//                else {
//                    System.out.println("Sorry, you can input maximum two number !!!");
//                }
//            }

            switch (n) {
                case 1 -> {
                    cal.sum();
                }
                case 2 -> {

                    cal.sub();
                }
                case 3 -> {
                    cal.div();
                }
                case 4 -> {
                    cal.multi();
                }
                case 5 -> {
                    cal.modu();
                }
                case 6 -> {
                    cal.root();
                }
                case 7 -> {
                    cal.fact();
                }
                case 8 -> {
                    cal.ln();
                }
                case 9 -> {
                    cal.log();
                }
                case 10 -> {
                    cal.sin();
                }
                case 11 -> {
                    cal.cos();
                }
                case 12 -> {
                    cal.tan();
                }
                case 13 -> {
                    cal.sec();
                }
                case 14 -> {
                    cal.cosec();
                }
                case 15 -> {
                    cal.cot();
                }
                case 16 -> {
                    cal.sinin();
                }
                case 17 -> {
                    cal.cosin();
                }
                case 18 -> {
                    cal.tanin();
                }
                case 19 -> {
                    cal.exp();
                }
                case 20 -> {
                    cal.log10();
                }
                case 21 -> {
                    cal.pow();
                }
                case 22 -> {
                    cal.xin();
                }
                case 23 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Enter valid Input!!");
                    break;
                }
            }

        }

    }

}
