/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectoriented;

/**
 *
 * @author USER
 */
public class Teacher {
    
    String name, gender;
    int phone;
    
    void setinformation(String a, String b, int c)
    {
        name=a;
        gender=b;
        phone= c;
        
    }
    void displayinformation()
    {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println("\n");
    }
}
