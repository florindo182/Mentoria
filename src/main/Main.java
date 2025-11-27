/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import exerciciosDaLista.exercicio01.ContaTelefonica;
import exerciciosDaLista.exercicio02.SensorTemperatura;
import exerciciosDaLista.exercicio03.PedidoOnlineSimples;
import exerciciosDaLista.exercicio04.Cliente;
import exerciciosDaLista.exercicio04.Endereco;
import exerciciosDaLista.exercicio05.Categoria;
import exerciciosDaLista.exercicio05.Livro;

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
            System.out.println("3-Exercicio 3");
            System.out.println("4-Exercicio-4");
            System.out.println("5-Exercicio-5");

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
                case 3->{
                    System.out.println("Digite o numero do pedido: ");
                    String numeroPedido = sc.nextLine();

                    System.out.println("Descreva o pedido: ");
                    String descricaoPedido = sc.nextLine();

                    System.out.println("Digite a quantidade:");
                    int qtd = sc.nextInt();

                    System.out.println("Digite o preco:");
                    double preco = sc.nextDouble();

                    PedidoOnlineSimples pedido = new PedidoOnlineSimples(descricaoPedido, numeroPedido,preco, qtd);

                    pedido.marcarComoPago();
                    pedido.marcarComoEnviado();

                    System.out.println(pedido.toString());
                    
                }
                case 4->{
                    System.out.println("Digite a rua:");
                    String rua = sc.nextLine();

                    System.out.println("Digite o bairro:");
                    String bairro = sc.nextLine();

                    System.out.println("Digite a cidade:");
                    String cidade = sc.nextLine();

                    System.out.println("Digite o pais:");
                    String pais = sc.nextLine();

                    Endereco endereco = new Endereco(bairro, cidade, pais, rua);

                    System.out.println("Digite o nome:");
                    String nome = sc.nextLine();

                    System.out.println("Digite o NIF:");
                    String nif = sc.nextLine();

                    System.out.println("Digite o telefone:");
                    String telefone = sc.nextLine();

                    Cliente cliente = new Cliente(endereco, nif, nome, telefone);

                    System.out.println(cliente.toString());

                    System.out.println("---Atualizar o Enderco---");

                    System.out.println("Digite a rua:");
                    rua = sc.nextLine();

                    System.out.println("Digite o bairro:");
                    bairro = sc.nextLine();

                    System.out.println("Digite a cidade:");
                    cidade = sc.nextLine();

                    System.out.println("Digite o pais:");
                    pais = sc.nextLine();

                    Endereco novoEndereco = new Endereco(bairro, cidade, pais, rua);
                    cliente.atualizarEndereco(novoEndereco);

                    System.out.println(cliente.toString());
                }
                case 5->{
                    System.out.println("Descreve a categoria:");
                    String descricao = sc.nextLine();

                    System.out.println("Digite o nome da categoria:");
                    String nome = sc.nextLine();

                    Categoria categoria1 = new Categoria(nome,descricao);

                    System.out.println("Descreve a categoria:");
                    descricao = sc.nextLine();

                    System.out.println("Digite o nome da categoria:");
                    nome = sc.nextLine();

                    Categoria categoria2 = new Categoria(nome,descricao);

                    System.out.println("Digite o titulo do livro:");
                    String titulo = sc.nextLine();

                    System.out.println("Digite o autor:");
                    String autor = sc.nextLine();

                    System.out.println("Digite o ano:");
                    int ano = sc.nextInt();

                    Livro livro1 = new Livro(ano, autor, categoria1, titulo);

                    System.out.println(livro1.toString());

                    livro1.alterarCategoria(categoria2);
                    System.out.println(livro1.toString());

                    
                }
            }

        } while (opcao != 0); 
        sc.close(); 
    }
}
