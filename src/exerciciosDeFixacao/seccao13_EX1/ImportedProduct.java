/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao13_EX1;

/**
 *
 * @author flori
 */
public class ImportedProduct extends ProductF {
    private double customsFee;

    public ImportedProduct(double customsFee, String name, double price) {
        super(name, price);
        this.customsFee = customsFee;
    }
    
    public double getCustomsFee() {
        return customsFee;
    }
    
    @Override
    public String priceTag(){
        return getName() + " $" + getPrice() + " (Customs fee: $" + getCustomsFee() + ")";
    }
    
}
