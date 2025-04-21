/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectoriented;

/**
 *
 * @author USER
 */
public class Constructor {
    
    String name, gender;
    int phone ;
    
    Constructor (String a, String b, int c)
    {
        name =a;
        gender = b;
        phone =c;
    }
     
    Constructor (String a, int b)
    {
        name =a;
        phone =b;
    }
    
      
    Constructor (String a, String b)
    {
        name =a;
        gender =b;
    }
      
    void display_constructor()
    {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
    }
    
    void display_constructor_2()
    {
        System.out.println("Name: "+name);
        System.out.println("phone: "+phone);
        System.out.println("Gender: "+gender);
    }
    
}
