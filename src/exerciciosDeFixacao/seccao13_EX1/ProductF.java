/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao13_EX1;

/**
 *
 * @author flori
 */
public class ProductF {
    private String name;
    private double price;

    public ProductF(String name, double price) {
        this.name = name;
        this.price = price;
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
    
    
    
    public String priceTag(){
        return getName() + " $" + getPrice();
    }
}
