/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three;

public class BankAccount {

 private double balance;
 private int accountNumber =1;
 
 public BankAccount(double balance){
     
     this.balance = balance;
     
     }
 public void deposit(double Deposit){
     
     balance = balance+Deposit;
 }
     
    public  boolean withdraw(double withdrew){
         
         if(balance>withdrew){
             
            balance = balance-withdrew; 
            return true;
         } else {
             
             System.out.println("There is not enough resource on bank account");
             return false;
         }
    }
     
    public int getAccountnumber(){
        
        return accountNumber;
    }
    public double getBalance(){
        
        return balance;
    }
     }
