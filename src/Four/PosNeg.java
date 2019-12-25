/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Four;

import java.util.Arrays;


public class PosNeg {

    
    public static void main(String[] args) {
        
        int [] array = {2,-5,4,12,54,-2,-50,150};
        int negnumbers = 0;
        int posnumbers;
        
        for(int i =0; i<array.length;i++){
            
            if(array[i]<0){
                negnumbers++;
            }
        }
        
        int[] Negnums = new int[negnumbers];
        posnumbers = array.length-negnumbers;
        int[] PosNums = new int[posnumbers]; 
        
        int j=0, p =0;
        
        for(int i =0;i<array.length;i++){
            
            if(array[i]<0){
                
                Negnums[j] = array[i];
                j++;
            } else {
                 
                PosNums[p] =array[i];
                p++;
        }
        }
          
         System.out.println("array: "+ Arrays.toString(array));
         System.out.println("Positive numbers: " + Arrays.toString(PosNums));
         System.out.println("Negative numbers: " + Arrays.toString(Negnums));
        
        }
        }
        