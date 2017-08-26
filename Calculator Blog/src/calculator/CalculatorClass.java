/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class CalculatorClass {
    
    public static void main(String[] args)
    {
        try
        {
            int operation;
            int num1;
            int num2;
           Scanner input = new Scanner(System.in);//Scanner object used to capture user input
           CalculatorClass calc = new CalculatorClass();//object needed for accessing non-static methods within static main method

           System.out.println("Enter your first number: ");
           num1 = input.nextInt();

           System.out.println("Choose your operation: ");
           System.out.println("1. Add: (+)");
           System.out.println("2. Subtract: (-)");
           System.out.println("3. Divide: (/)");
           System.out.println("4. Multiply (*): ");

           System.out.println("Operation (1/2/3/4): ");
           operation = input.nextInt();

           System.out.println("Enter your second number: ");
           num2 = input.nextInt();

           if(operation == 1)
           {
               calc.add(num1, num2);
           }
           else if(operation == 2)
           {
               calc.subtract(num1, num2);
           }
           else if(operation == 3)
           {
               calc.divide(num1, num2);
           }
           else if(operation == 4)
           {
               calc.multiply(num1, num2);
           }
           else
           {
               System.out.println("Invalid operation choice");
           }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input. Only numbers are allowed");
        }
        catch(Exception e)
        {
            System.out.println("Exception has occurred: "+e);
        }
        
    }
    public void add(int num1, int num2)
    {
        int result;
        result = num1+num2;
        System.out.println("Result: "+result);
    }
    public void subtract(int num1, int num2)
    {
        int result;
        result = num1-num2;
        System.out.println("Result: "+result);
    }
    public void divide(int num1, int num2)
    {
        if(num2 == 0)
        {
            System.out.println("Tis impossible!");
        }
        else
        {
            int result;
            result = num1/num2;
            System.out.println("Result: "+result);
        }
        
    }
    public void multiply(int num1, int num2)
    {
        int result;
        result = num1*num2;
        System.out.println("Result: "+result);
    }
}
