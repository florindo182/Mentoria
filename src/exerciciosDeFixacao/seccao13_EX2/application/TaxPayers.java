/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosDeFixacao.seccao13_EX2.application;

import exerciciosDeFixacao.seccao13_EX2.entities.Company;
import exerciciosDeFixacao.seccao13_EX2.entities.Individual;
import exerciciosDeFixacao.seccao13_EX2.entities.TaxPayer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author flori
 */
public class TaxPayers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of tax payers:");
        int num = sc.nextInt();
        
        ArrayList<TaxPayer> taxPayers = new ArrayList<>();
        
        sc.nextLine();
        for(int i=1;i<= num;i++){
            System.out.println("Tax payer #" +i + " data:");
            System.out.print("Individual or Company (i/c)?");
            char letra = sc.next().charAt(0);
            
            sc.nextLine();
            switch (letra) {
                case 'i':
                    {
                        System.out.print("Name: ");
                        String nome = sc.nextLine();
                        System.out.print("Anual Income: ");
                        Double anualIncome = sc.nextDouble();
                        System.out.print("Health Expendictures: ");
                        Double healthExpendictures = sc.nextDouble();
                        Individual id = new Individual(healthExpendictures,nome,anualIncome);
                        taxPayers.add(id);
                        break;
                    }
                case 'c':
                    {
                        System.out.print("Name: ");
                        String nome = sc.nextLine();
                        System.out.print("Anual Income: ");
                        Double anualIncome = sc.nextDouble();
                        System.out.print("Number of Employees: ");
                        Integer number = sc.nextInt();
                        Company c = new Company(number,nome,anualIncome);
                        taxPayers.add(c);
                        break;
                    }
                default:
                    System.out.println("Parametro Invalido");
                    break;
            }
            sc.nextLine();
        }
        double total = 0.0;
        System.out.println("TAXES PAID:");
        for(TaxPayer e: taxPayers){
            
            total += e.tax();
        }
        for(TaxPayer e: taxPayers){
            System.out.println(e);
        }
        System.out.println("TOTAL TAXES:$ "+ total);
    }
    
}
