/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha Bobde
 */
public class LogicalOperation {
 public static void main(String [] arg) {
     int myNum1 = 1, myNum2 = 2, myNum3 = 9;
     boolean result;
     
     result = (myNum2 > myNum1) || (myNum3 > myNum1);
     System.out.println(result);
     
     result = (myNum2 > myNum1) && (myNum3 > myNum1);
     System.out.println(result);
 }
}
