package com.company;

import java.util.Scanner;

class Calculator{
    double a;
    double b;
    double x;
    Calculator(double [] array){
        this.a = array[0];
        this.b = array[1];
        this.x = array[2];
    }
    double formula_1(){
        return 3 * x + 5;
    }
    double formula_2(){
        if ((a - b) != 0) {
            return (a - b) / (a + b);
        } else {
            return -1;
        }
    }
    double formula_3(){
        if (b != 0){
            double temp = a * x / b;
            if(temp % 1 == 0) {
                int y = 1;
                for (int i = 1; i <= a * x / b; i++) {
                    y = y * i;
                }
                return y;
            }
            else {
                return -1;
            }
        }
        else {
            return -1;
        }
    }
}



public class Main {
    public static double[] filler(){
        Scanner in = new Scanner(System.in);
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            result[i] = in.nextDouble();
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator(filler());
        Calculator calc2 = new Calculator(filler());
        Calculator calc3 = new Calculator(filler());
        Calculator[] arr = {calc1, calc2, calc3};
        for(Calculator i:arr){
            System.out.println(i.formula_1());
            System.out.println(i.formula_2());
            System.out.println(i.formula_3());
        }
    }
}