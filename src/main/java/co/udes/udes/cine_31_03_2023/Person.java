/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.cine_31_03_2023;

/**
 *
 * @author LabSispc13
 */
public class Person {
    private String Name;
    private String ID;
    private int age;

    public Person() {
    }

    public Person(String Name, String ID, int age) {
        this.Name = Name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String getAll() {
        return "[Name=" + Name + "], [ID=" + ID + "], [age=" + age+"]";
    }
    
    
}

    


