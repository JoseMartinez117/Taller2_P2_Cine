/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.cine_31_03_2023;

/**
 *
 * @author LabSispc13
 */
public class Product {
    private String name;
    private double price;
    private String ProductID;

    public Product() {
    }

    public Product(String name, double price, String ProductID) {
        this.name = name;
        this.price = price;
        this.ProductID = ProductID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    @Override
    public String toString() {
        return "Product{" + "[name=" + name + "], [price=" + price + "], [ProductID=" + ProductID +"]"+'}'+"\n";
    }
    
    
    
    
    
}
