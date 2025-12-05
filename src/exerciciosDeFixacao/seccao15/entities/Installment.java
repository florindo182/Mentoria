/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao15.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author flori
 */
public class Installment {
    private Double ammount;
    private LocalDate dueDate;

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Installment(Double ammount, LocalDate dueDate) {
        this.ammount = ammount;
        this.dueDate = dueDate;
    }

    public Double getAmmount() {
        return ammount;
    }

    public void setAmmount(Double ammount) {
        this.ammount = ammount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Installment{" + String.format("%.2f", ammount) + ", dueDate=" + dueDate.format(fmt) + '}';
    }
    
    
    
}
