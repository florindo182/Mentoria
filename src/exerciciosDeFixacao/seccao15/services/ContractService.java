/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao15.services;

import exerciciosDeFixacao.seccao15.entities.Contract;
import exerciciosDeFixacao.seccao15.entities.Installment;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author flori
 */
public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    
    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for(int i=1;i<=months;i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.payment(basicQuota + interest);
            double quotaFinal = basicQuota + interest + fee;
            
            contract.getInstallment().add(new Installment(quotaFinal,dueDate));
            
        }
    }
}
