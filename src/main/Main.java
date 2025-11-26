/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import exerciciosDeFixacao.Account;
import exerciciosDeFixacao.ContaTelefonica;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author flori
 */
public class Main {
    public static void main(String[] args){  
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
}
