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
public class Function {
    private Pelicula mymovie;
    private String Nhall;
    private String schedule; //horario
    private double TicketPrice;

    public Function() {
    }

    public Function(Pelicula mymovie, String Nhall, String schedule, double TicketPrice) {
        this.mymovie = mymovie;
        this.Nhall = Nhall;
        this.schedule = schedule;
        this.TicketPrice = TicketPrice;
    }

    public Pelicula getMymovie() {
        return mymovie;
    }

    public void setMymovie(Pelicula mymovie) {
        this.mymovie = mymovie;
    }

    public String getNhall() {
        return Nhall;
    }

    public void setNhall(String Nhall) {
        this.Nhall = Nhall;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(double TicketPrice) {
        this.TicketPrice = TicketPrice;
    }

    @Override
    public String toString() {
        return "Function{" + mymovie.GetAllmov()+", [Nhall=" + Nhall + "], [schedule=" + schedule + "], [TicketPrice=" + TicketPrice +"]"+ '}'+"\n";
    }
    
    
}
