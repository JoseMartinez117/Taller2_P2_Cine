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
public class Pelicula {
    private String name;
    private String releasedate;
    private String genre;
    private String audience;

    public Pelicula() {
    }
    
    public Pelicula(String name, String releasedate, String genre, String audience) {
        this.name = name;
        this.releasedate = releasedate;
        this.genre = genre;
        this.audience = audience;
    }

    public String getName() {
        return name;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public String getGenre() {
        return genre;
    }

    public String getAudience() {
        return audience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "[name= " + name + "], [releasedate= " + releasedate + "], [genre= " + genre + "], [audience= " + audience +"]"+'}'+"\n";
    }
    
    
    public String GetAllmov(){
    
    return "[name= " + name + "], [releasedate= " + releasedate + "], [genre= " + genre + "], [audience= " + audience+"]" ;
    }
    
    
}
