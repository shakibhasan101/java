/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examprep;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class LargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int[] number = new int [5];
        
        for (int i = 0; i < number.length; i++) {
            number [i]=input.nextInt();
            
            
           
        }
        
        int max=number[0];
        int min = number [0];
        
        for (int i = 1; i < number.length; i++) {
            if(number[i]>max)
               max=number[i];
            if(number [i]<min)
                min=number[i];
        }
         System.out.println("largest number is "+max);
         System.out.println("Smallest number is "+min);

        
    }
    
}
