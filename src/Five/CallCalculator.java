/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Five;


public class CallCalculator {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.ADD(31,13);
         
        System.out.println(c.add()); 
        System.out.println(c.div());
        System.out.println(c.sub());
        System.out.println(c.mul());
    }
    
}
