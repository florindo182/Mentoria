/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao15.services;

/**
 *
 * @author flori
 */
public class PaypalService implements OnlinePaymentService{

    @Override
    public double payment(double ammount) {
        return ammount * 0.02;
        
    }

    @Override
    public double interest(double ammount, int months) {
        return ammount * 0.01 * months;
        
    }
    
    
}
