/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosDeFixacao.seccao13_EX3.application;

import exerciciosDeFixacao.seccao13_EX3.entities.Employee;
import exerciciosDeFixacao.seccao13_EX3.entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author flori
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of Employees: ");
        int num = sc.nextInt();
        
        ArrayList<Employee> employees = new ArrayList<>();
        
        sc.nextLine();
        for(int i=1;i<= num;i++){
            System.out.println("Employee #" +i + " data:");
            System.out.print("Outsourced (y/n)?");
            char letra = sc.next().charAt(0);
            
            sc.nextLine();
            switch (letra) {
                case 'y':
                    {
                        System.out.print("Name: ");
                        String nome = sc.nextLine();
                        
                        System.out.print("Hours: ");
                        int hours = sc.nextInt();
                        
                        System.out.print("Value Per Hour: ");
                        Double valuePerHour = sc.nextDouble();
                        
                        System.out.print("Additional Charge: ");
                        Double additionalCharge = sc.nextDouble();
                      
                        OutsourcedEmployee out = new OutsourcedEmployee(additionalCharge,nome,hours,valuePerHour);
                        employees.add(out);
                        break;
                    }
                case 'n':
                    {
                        System.out.print("Name: ");
                        String nome = sc.nextLine();
                        
                        System.out.print("Hours: ");
                        int hours = sc.nextInt();
                        
                        System.out.print("Value Per Hour: ");
                        Double valuePerHour = sc.nextDouble();
                       
                        Employee e = new Employee(nome,hours,valuePerHour);
                        employees.add(e);
                        
                        break;
                    }
                default:
                    System.out.println("Parametro Invalido");
                    break;
            }
            sc.nextLine();
        }
        System.out.println("PAYMENTS: ");
        for(Employee e: employees){
            System.out.println(e);
        }
        
    }
    
}
