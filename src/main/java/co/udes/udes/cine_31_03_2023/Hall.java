/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.cine_31_03_2023;

/**
 *
 * @author LabSispc13
 */
public class Hall {
    private String Nhall;
    private int capacity;
    private String TyHall;

    public Hall() {
    }

    public Hall(String Nhall, int capacity, String TyHall) {
        this.Nhall = Nhall;
        this.capacity = capacity;
        this.TyHall = TyHall;
    }

    public String getNhall() {
        return Nhall;
    }

    public void setNhall(String Nhall) {
        this.Nhall = Nhall;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTyHall() {
        return TyHall;
    }

    public void setTyHall(String TyHall) {
        this.TyHall = TyHall;
    }

    @Override
    public String toString() {
        return "Hall{" + "[Nhall=" + Nhall + "], [capacity=" + capacity + "], [TyHall=" + TyHall +"]"+'}'+"\n";
    }
    
    
    
}
