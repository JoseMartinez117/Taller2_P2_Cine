/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.cine_31_03_2023;

/**
 *
 * @author LabSispc13
 */
public class Customer extends Person{
    private boolean member; 

    public Customer() {
    }
    
    public Customer(boolean member, String Name, String ID, int age) {
        super(Name, ID, age);
        this.member = member;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Customer{"+ super.getAll() + "[, member=" + member +"]"+'}'+"\n";
    }
    
    
    
}
