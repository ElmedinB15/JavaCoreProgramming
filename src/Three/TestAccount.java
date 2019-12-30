/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three;


public class TestAccount {

    public static void main(String[] args) {
      
        
        BankAccount test = new BankAccount(1000); 
        test.deposit(300);
        test.withdraw(100);
        
        System.out.println("Bank account number is: " + test.getAccountnumber());
        System.out.println("Bank account number has: " +test.getBalance()+"$");
    }
}