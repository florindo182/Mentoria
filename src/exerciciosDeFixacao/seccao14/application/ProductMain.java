/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosDeFixacao.seccao14.application;

import exerciciosDeFixacao.seccao14.entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author flori
 */
public class ProductMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\flori\\OneDrive\\Documents\\ISPTEC\\MentoriaProg\\in.txt";
        
        ArrayList<Product> products = new ArrayList<>();
        
        String destiny = "C:\\Users\\flori\\OneDrive\\Documents\\ISPTEC\\MentoriaProg\\out.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            while(line != null){
                String[] partes = line.split(",");
                String name = partes[0];
                double price = Double.parseDouble(partes[1]);
                int qtd = Integer.parseInt(partes[2]);
                
                products.add(new Product(name,price,qtd));
                
                line = br.readLine();
                
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(destiny))){
                for(Product p: products){
                    bw.write(p.getName() + String.format(",%.2f", p.total()));
                    bw.newLine();
                }   
            }catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
