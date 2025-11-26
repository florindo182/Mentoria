/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import exerciciosDeFixacao.ContaTelefonica;
import exerciciosDeFixacao.SensorTemperatura;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author flori
 */
public class Main {
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        
        int opcao;

        do { 
            System.out.println("1-Exercicio 1");
            System.out.println("2-Exercicio 2");

            System.out.println("Digite uma opcao");
            opcao = sc.nextInt();

            sc.nextLine();
            switch(opcao){
                case 1->{
                    String path = "floras.txt";
                    
                    String numero = "923456789";
                    String plano = "Pos-pago";
                    
                    int limiteDadoMB = 5000;
                    int dadosConsumidosMB = 0;
                    
                    double valorMensalBase = 10000.0;
                    double valorPorMBExcedente = 5.0;
                    
                    ContaTelefonica conta = new ContaTelefonica(numero,plano,limiteDadoMB,dadosConsumidosMB,valorMensalBase,valorPorMBExcedente);
                    
                    try(BufferedWriter br = new BufferedWriter(new FileWriter(path))){
                        br.write("Exercicio 1 da Mentoria");
                        br.newLine();
                        conta.registrarConsumoDados(2000);
                        conta.registrarConsumoDados(1500);
                        conta.registrarConsumoDados(2500);
                                    
                        br.write(conta.toString());
                        br.newLine();
                        br.write("-----------------------");
                    }catch(IOException e){
                        e.printStackTrace();
                    }

                }
                case 2->{
                    System.out.println("Digite o identificador");
                    String id = sc.nextLine();

                    System.out.println("Digite o local");
                    String local = sc.nextLine();

                    SensorTemperatura sensor = new SensorTemperatura(id,local);
                    sensor.registrarLeitura(22.5);
                    sensor.registrarLeitura(23.0);
                    sensor.registrarLeitura(24.2);
                    sensor.registrarLeitura(21.8);
                    sensor.registrarLeitura(23.5);
                    
                    System.out.println(sensor.toString());

                }
            }

        } while (opcao != 0); 
        sc.close(); 
    }
}
