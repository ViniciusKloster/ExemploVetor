/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo;

/**
 *
 * @author kloster.2919
 */
public class ExemploVetor2 {
   public static void main(String args[]){
        
        int[] nums = new int[5];
        
        int soma = 0;
        
        nums[0] = 1;
        nums[1] = 15;
        nums[2] = 8;
        nums[3] = 847;
        nums[4] = 123;
        
        for(int i = 0; i < nums.length; i++){
            soma = soma + nums[i];
            
        }
       
        System.out.println("resultado da soma: " + soma);
    } 
}
