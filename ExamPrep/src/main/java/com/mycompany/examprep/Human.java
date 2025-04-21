/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examprep;

/**
 *
 * @author USER
 */
public class Human {
    
    String name, gender;
    int age, phone;
    public static void main(String[] args) {
        
        AnimalClass human = new AnimalClass();
        human.Characteristic="sucker";
        human.body = "Straight";
        human.sound ="everything";
        human.avgPeriodOfLife=60;
        human.structure = "Good";
        
        System.out.println("Characteristic: "+human.Characteristic);
        System.out.println("body: "+human.body);
    }
 
}
