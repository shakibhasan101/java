/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examprep;

import java.util.Arrays;

/**
 *
 * @author USER
 */
import java.util.Arrays;
public class ArrayCopy {
    
    public static void main(String[] args) {
        
        int[] number1={3,2,3,4,5,9};
        int [] number2=number1;
        
        Arrays.sort(number2);
        for (int x: number2)
        {
            System.out.println(x);
        }
    }
    
}
