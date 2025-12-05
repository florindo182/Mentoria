/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao15.entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author flori
 */
public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    private ArrayList<Installment> installment = new ArrayList<>();
    
    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    @Override
    public String toString() {
        return "Contract{" + "number=" + number + ", date=" + date + ", totalValue=" + totalValue + '}';
    }

    public ArrayList<Installment> getInstallment() {
        return installment;
    }

    
    
    
}
