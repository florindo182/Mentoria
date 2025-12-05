/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exerciciosDeFixacao.seccao15.services;

/**
 *
 * @author flori
 */
public interface OnlinePaymentService {
    double payment(double ammount);
    double interest(double ammount, int months);
}
