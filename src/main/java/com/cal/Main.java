package com.cal;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        MagicCalculator test=new MagicCalculator();
        float result=test.factorial(21);
        System.out.println(result);
        Scanner sc1 =new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello From Calculator ");
        char again;

        do {
            System.out.println("Enter your first number: ");
            float num1 = scanner.nextInt();
            System.out.println("Enter your second number: ");
            float num2 = scanner.nextInt();
            System.out.println("what method would you like to use ?");
            System.out.println("[A.Add, S.Subtract, M.Multiply, D.Divide ,R. Square root ,] ,");

            MagicCalculator cal1 = new MagicCalculator();
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice == 'a') {
                System.out.println(num1 + " + " + num2 + " = " + cal1.add(num1, num2));
            } else if (choice == 's') {
                System.out.println(num1 + " - " + num2 + " = " + cal1.subtract(num1, num2));
            } else if (choice == 'm') {
                System.out.println(num1 + " x " + num2 + " = " + cal1.multiply(num1, num2));
            } else if (choice == 'd') {
                System.out.println(num1 + " / " + num2 + " = " + cal1.divide(num1, num2));
            } else if (choice == 'r') {
                System.out.println("==== SQUARE ROOT  ====" + cal1.squareRoot(num1));
                System.out.println("Do you want to use the calculator again?");
            }
            again = scanner.next().toLowerCase().charAt(0);
        }while (again == 'y');
        System.out.println("Thanks for using the Calculator ");
    }
    }


