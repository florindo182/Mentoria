/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao13_EX2.entities;

/**
 *
 * @author flori
 */
public class Individual extends TaxPayer{
    private Double healthExpendictures;

    public Individual(Double healthExpendictures, String name, Double anualIncome) {
        super(name, anualIncome);
        if(healthExpendictures > 0.0){
            this.healthExpendictures = healthExpendictures;
        }
    }

    public Double getHealthExpendictures() {
        return healthExpendictures;
    }

    public void setHealthExpendictures(Double healthExpendictures) {
        this.healthExpendictures = healthExpendictures;
    }

    @Override
    public double tax(){
        if(getAnualIncome() < 20000.0 && healthExpendictures != null){
            return (getAnualIncome()*0.15) - (healthExpendictures * 0.5);
        }else if(getAnualIncome() > 20000.0 && healthExpendictures != null){
            return (getAnualIncome()*0.25) - (healthExpendictures * 0.5);
        }else if(getAnualIncome() < 20000.0){
            return (getAnualIncome()*0.15);
        }else{
            return (getAnualIncome()*0.25);
        }
    }
    @Override
    public String toString() {
        return getName() + ": " + String.format("$ %.2f", tax());
    }
    
    
    
}
