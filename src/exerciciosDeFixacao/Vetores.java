/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author flori
 */
public class Vetores {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> negativeNumber = new ArrayList<>();
        
        System.out.println("Quantos numeros voce vai digitar?");
        int N = sc.nextInt();
     
        for(int i=1;i<=N;i++){
            System.out.println("Digiite um numero:");
            int num = sc.nextInt();
            
            if(num < 0){
                negativeNumber.add(i);
            }
        }
        
        for(int e: negativeNumber){
            System.out.println("Numeros negativos:\n"+ e);
        }
        
    }
}
