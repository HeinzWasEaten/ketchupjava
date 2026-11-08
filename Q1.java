/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heinzmaya.codetesting;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author heinz
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input = scan.nextLine();
        String inputWithoutHyphen = input.replace("-", "");
        int[] isbn = new int[inputWithoutHyphen.length()];
        
        for(int i=0;i<9;i++) {
            isbn[i]=Character.getNumericValue(inputWithoutHyphen.charAt(i));
        }
        if(inputWithoutHyphen.charAt(9)=='X') {
            isbn[9]=10;
        } else {
            isbn[9] = Character.getNumericValue(inputWithoutHyphen.charAt(9));  
        }
        
        int myCalculation;
        int sum = 0;
        for(int i=1;i<isbn.length;i++) { // Code will run until i == 19
            sum+=isbn[i-1]*i;
        }
        myCalculation = sum%11;
        if(myCalculation == isbn[9]) {
            System.out.println("Right");
        } 
        else if (myCalculation == 10) {
            System.out.println(input.replaceAll(".$", "X"));
        } else {
            System.out.println(input.replaceAll(".$", String.valueOf(myCalculation)));
        }
        
    }
}
