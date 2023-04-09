/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.cine_31_03_2023;

import java.util.Date;

/**
 *
 * @author LabSispc13
 */
public class Employee extends Person{
    private String rol;
    private double salary;
    private String assignedArea;
    private String departureTime;
    private String entryTime; 
    private boolean contract;

    public Employee() {
    }


    public Employee(String rol, double salary, String assignedArea, String departureTime, String entryTime, boolean contract, String Name, String ID, int age) {
        super(Name, ID, age);
        this.rol = rol;
        this.salary = salary;
        this.assignedArea = assignedArea;
        this.departureTime = departureTime;
        this.entryTime = entryTime;
        this.contract = contract;
    }

  

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAssignedArea() {
        return assignedArea;
    }

    public void setAssignedArea(String assignedArea) {
        this.assignedArea = assignedArea;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Employee{"+ super.getAll() + ", [rol=" + rol + "], [salary=" + salary + "], [assignedArea=" + assignedArea + "], [departureTime=" + departureTime + "], [entryTime=" + entryTime + "], [contract=" + contract +"]"+ '}'+"\n";
    }

    

   
    
    
    
}
