package day2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = scanner.nextFloat();
        System.out.println("Enter the first number");
        float num2 = scanner.nextFloat();

    Calculator cal = new Calculator();
    cal.addNumber(num1,num2);
    }
    public void addNumber(float x,float y){
        float sum=x+y;
        System.out.println("Sum of ="+x+" and "+y +" = " + sum);
    }
}
