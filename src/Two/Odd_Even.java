/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

import java.util.Scanner;


public class Odd_Even {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered number is:");
        int Odd_Even = sc.nextInt();
        
        boolean check = Odd_Even%2==0;
        
        System.out.println("Variable is even "+ check);
    }
    
}
