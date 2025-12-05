/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao13_EX3.entities;

/**
 *
 * @author flori
 */
public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;
    
    public OutsourcedEmployee(Double additionalCharge,String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public double payment(){
        return (additionalCharge * 1.1) + (getHours() * getValuePerHour());
    }
    
    @Override
    public String toString(){
        return getName() + " - " + String.format("$ %.2f", payment());
    }
    
}
