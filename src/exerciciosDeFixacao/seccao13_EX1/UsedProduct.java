/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao13_EX1;

import java.time.LocalDate;

/**
 *
 * @author flori
 */
public class UsedProduct extends ProductF{
    private LocalDate manufactureDate;

    public UsedProduct(LocalDate manufactureDate, String name, double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    
    @Override
    public String priceTag(){
        return getName() + " (used) $" + getPrice() + " (Manufacture date: " + getManufactureDate() + ")";
    }
}
