
package com.mycompany.staticvariable;


public class Teacher {
    String name, gender;
    int phone;
    static String UniversityName = "Green University of Bangladesh"; 
    Teacher(String name, String gender, int phone)
    {
        this.name =name;
        this.gender =gender;
        this.phone =phone ;
        
    }
    
    
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone );
        System.out.println("University Name: "+ UniversityName);
        
    }
}
