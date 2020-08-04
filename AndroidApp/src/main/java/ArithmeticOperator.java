/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha Bobde
 */
public class ArithmeticOperator {
    public static void main(String []arg) {
        
        double number1 = 23, number2 = 46, result;
        
        // Using addition operator
        result = number1 + number2;
        System.out.println("nummber1 + number2 = " + result);
        
        // Using subtraction operator
        result = number1 - number2;
        System.out.println("number1 - number2 = " + result);
        
        //Using multiplication operator
        result = number1 * number2;
        System.out.println("number1 * number2 = " + result);
        
        //Using division operator
        result = number1 / number2;
        System.out.println("number1 / number2 = " + result);
    }
}
