/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objectoriented;

/**
 *
 * @author USER
 */
public class ObjectOriented {

    public static void main(String[] args) {
        
        
        Constructor con1 = new Constructor ("Rifat", "male", 876);
        con1.display_constructor();
        
        Constructor con2 = new Constructor ("Sujon", "male");
        con2.display_constructor_2();
        
        
        
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3 =new Teacher();
        
        
        teacher1.setinformation("Shakib Hasan", "Male", 1956497869);
        teacher2.setinformation("Sujon ", "Male", 1923462367);
        teacher3.setinformation("Rabeya", "Female", 1787654234);

        
        teacher1.displayinformation();
        teacher2.displayinformation();
        teacher3.displayinformation();
    }
}
