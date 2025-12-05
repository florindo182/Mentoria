/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosDeFixacao.seccao15.application;

import exerciciosDeFixacao.seccao15.entities.Contract;
import exerciciosDeFixacao.seccao15.entities.Installment;
import exerciciosDeFixacao.seccao15.services.ContractService;
import exerciciosDeFixacao.seccao15.services.PaypalService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author flori
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
	System.out.println("Entre os dados do contrato:");
	System.out.print("Numero: ");
	int number = sc.nextInt();
	System.out.print("Data (dd/MM/yyyy): ");
	LocalDate date = LocalDate.parse(sc.next(), fmt);
	System.out.print("Valor do contrato: ");
	double totalValue = sc.nextDouble();
	
	Contract obj = new Contract(number, date, totalValue);
		
	System.out.print("Entre com o numero de parcelas: ");
	int n = sc.nextInt();
		
	ContractService contractService = new ContractService(new PaypalService());
	
	contractService.processContract(obj, n);
		
	System.out.println("Parcelas:");
	for (Installment installment : obj.getInstallment()) {
		System.out.println(installment);
	}
		
	sc.close();
    }
    
}
