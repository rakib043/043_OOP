/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

/**
 *
 * @author Rkib
 */
public class Calculator {

    double x, y;

    public void sum() {
        System.out.println("Summation : " + (x + y));
    }

    public void sub() {
        System.out.println("Substract : " + (x - y));
    }

    public void div() {
        System.out.println("Division : " + (x / y));
    }

    public void multi() {
        System.out.println("Multiple : " + (x * y));
    }

    public void modu() {
        System.out.println("Modulus : " + (x % y));
    }

    public void root() {
        System.out.println("Root : " + (Math.sqrt(x)));
    }

    public void fact() {

        double fact = 1;

        int facIn = (int) x;

        while (x != 1) {
            fact = fact * ((x + 1) - 1);

            x--;
        }

        System.out.println(facIn + "! : " + (fact));
    }

    public void ln() {

        double result = (Math.log(1 - x)) / x;

        System.out.println("ln(" + x + ") : " + (result));
    }

    public void log() {
        System.out.println("log(" + x + ") : " + (Math.log(x)));
    }

    public void sin() {

        double result = Math.sin(x);

        System.out.println("sin(" + x + ") : " + (Math.round(result)));
    }

    public void cos() {

        double result = Math.cos(x);

        System.out.println("cos(" + x + ") : " + (Math.round(result)));
    }

    public void tan() {

        if (x == 90) {
            System.out.println("undefined");
        } else {
            double result = Math.tan(x);

            System.out.println("tan(" + x + ") : " + (Math.round(result)));
        }
    }

    public void sec() {

        double result = Math.round((Math.cos(x)));

        if (result == 0) {
            System.out.println("sec(" + x + ") : undefined");
        } else {
            System.out.println("sec(" + x + ") : " + (1 / Math.round(result)));
        }

    }

    public void cosec() {

        double result = Math.round((Math.sin(x)));

        if (result == 0) {
            System.out.println("cosec(" + x + ") : undefined");
        } else {
            System.out.println("cosec(" + x + ") : " + (1 / Math.round(result)));
        }
    }

    public void cot() {

        double result = Math.round((Math.tan(x)));

        if (result == 0) {
            System.out.println("cot(" + x + ") : undefined");
        } else {
            System.out.println("tan(" + x + ") : " + (1 / Math.round(result)));
        }
    }

    public void sinin() {

        System.out.println("sin-1(" + x + ") : " + (Math.round(Math.asin(x))));

    }
    
    public void cosin() {

        System.out.println("cos-1(" + x + ") : " + (Math.round(Math.acos(x))));

    }
    
    public void tanin() {

        System.out.println("tan-1(" + x + ") : " + (Math.round(Math.atan(x))));
        


    }
    
    public void exp(){
        
        System.out.println("exp("+x+") : "+ (Math.exp(x)));
        
    }
    
    public void log10(){
        
        System.out.println("log10("+x+") : "+ (Math.log10(x)));
        
    }
    
    public void pow(){
        
        System.out.println("pow("+x+","+y+") : "+ (Math.pow(x, y)));
        
    }
    
    public void xin(){
        
        System.out.println(x+"-1: "+ (1/x));
        
    }

}