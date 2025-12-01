/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import exerciciosDaLista.exercicio006.Client;
import exerciciosDaLista.exercicio006.Factura;
import exerciciosDaLista.exercicio01.ContaTelefonica;
import exerciciosDaLista.exercicio02.SensorTemperatura;
import exerciciosDaLista.exercicio03.PedidoOnlineSimples;
import exerciciosDaLista.exercicio04.Cliente;
import exerciciosDaLista.exercicio04.Endereco;
import exerciciosDaLista.exercicio05.Categoria;
import exerciciosDaLista.exercicio05.Livro;
import exerciciosDaLista.exercicio07.Camiao;
import exerciciosDaLista.exercicio07.Carro;
import exerciciosDaLista.exercicio07.Veiculo;
import exerciciosDaLista.exercicio08.CoordenadorCurso;
import exerciciosDaLista.exercicio08.Professor;
import exerciciosDeFixacao.seccao12.ClientF;
import exerciciosDeFixacao.seccao12.Order;
import exerciciosDeFixacao.seccao12.OrderItem;
import exerciciosDeFixacao.seccao12.OrderStatus;
import exerciciosDeFixacao.seccao12.Product;
import exerciciosDeFixacao.seccao13_EX1.ImportedProduct;
import exerciciosDeFixacao.seccao13_EX1.ProductF;
import exerciciosDeFixacao.seccao13_EX1.UsedProduct;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author flori
 */
public class Main {
    public static void main(String[] args) throws ParseException{  
        Scanner sc = new Scanner(System.in);
        
        int opcao;

        do { 
            System.out.println("1-Exercicio 1");
            System.out.println("2-Exercicio 2");
            System.out.println("3-Exercicio 3");
            System.out.println("4-Exercicio-4");
            System.out.println("5-Exercicio-5");
            System.out.println("6-Exercicio 6");
            System.out.println("7-Exercicio 7");
            System.out.println("8-Exercicio 8");
            System.out.println("9-Exercio de Fixacao- Seccao 12");
            System.out.println("10-Exercicio de Fixacao- Seccao 13.1");
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
                case 6->{
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o nif: ");
                    String nif = sc.nextLine();

                    System.out.println("Digite o numero de telefone: ");
                    String telefone = sc.nextLine();

                    Client cliente = new Client(nif,nome,telefone);

                    System.out.println("Digite o numero da factura: ");
                    String numero = sc.nextLine();

                    System.out.println("Digite a data de Emissao: ");
                    String dataEmissao = sc.nextLine();

                    System.out.println("Digite o valor da factura: ");
                    Double valor = sc.nextDouble();

                    Factura fatura = new Factura(numero,dataEmissao,valor);
                    fatura.associarCliente(cliente);

                    System.out.println(fatura.toString());

                }
                case 7->{
                    ArrayList<Veiculo> veiculo = new ArrayList<>();
                    Carro carro = new Carro(4,5,"Toyota","Corolla","LD-10-20-AA");
                    Camiao camiao = new Camiao(18.0,3,"Mercedes","Actros","LD-30-40-BB");

                    veiculo.add(carro);
                    veiculo.add(camiao);

                    for(Veiculo e: veiculo){
                        System.out.println(e);
                    }
                }
                case 8->{ 
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Documento: ");
                    String documento = sc.nextLine();

                    System.out.print("Area: ");
                    String area = sc.nextLine();

                    System.out.print("Salario Base: ");
                    Double salarioBase = sc.nextDouble();

                    System.out.print("Horas por semana: ");
                    Integer qtdHoraPorSemana = sc.nextInt();

                    Professor professor = new Professor(area, qtdHoraPorSemana, documento, nome, salarioBase);

                    System.out.println(professor.toString());
                    
                    sc.nextLine();

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Documento: ");
                    documento = sc.nextLine();

                    System.out.print("Responsavel do Curso: ");
                    String cursoResponsavel = sc.nextLine();

                    System.out.print("Salario Base: ");
                    salarioBase = sc.nextDouble();

                    System.out.print("Gratificacao da Coordenacao: ");
                    Double gratificacaoCoordenacao = sc.nextDouble();

                    CoordenadorCurso coordenador = new CoordenadorCurso(cursoResponsavel, gratificacaoCoordenacao, documento, nome, salarioBase);

                    System.out.println(coordenador.toString());


                }
                case 9->{ 
                    System.out.println("Enter client data:");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    
                    System.out.print("Birth date(dd/MM/yyyy): ");
                    String birthDate = sc.nextLine();
                    
                    LocalDate date = LocalDate.parse(birthDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                   
                    ClientF client = new ClientF(name,email,date);
                    
                    System.out.println("Enter order data:");
                    System.out.print("Status: ");
                    String os = sc.nextLine();
                    OrderStatus os1 = OrderStatus.valueOf(os);
                    
                    System.out.print("How many items to this orders?");
                    int num = sc.nextInt();
                    
                    Order order = new Order(new Date(),os1,client);
                    
                    sc.nextLine();
                    for(int i = 1; i<= num; i++){
                        System.out.println("Enter #" + i + " item data");
                        System.out.print("Product name: ");
                        name = sc.nextLine();
                        
                        System.out.print("Quantity: ");
                        int qtd = sc.nextInt();
                        
                        System.out.print("Product Price: ");
                        double price = sc.nextDouble();
                        
                        OrderItem orderItem = new OrderItem(qtd,price,new Product(name,price));
                        order.addItem(orderItem);
                        
                        sc.nextLine();
                    }
                    
                    
                    System.out.println(order.toString());
                    
                }
                case 10->{
                    
                    ArrayList<ProductF> products = new ArrayList<>();
                    System.out.print("Enter the number of products?");
                    int num = sc.nextInt();
                    
                    for(int i = 1; i<= num; i++){
                        System.out.println("Product #" + i + " data");
                        System.out.println("Common,used or imported (c/u/i)");
                        char letra = sc.next().charAt(0);
                        
                        sc.nextLine();
                        switch (letra) {
                            case 'c' ->                                 {
                                    System.out.print("Name: ");
                                    String name = sc.nextLine();
                                    System.out.print("Price: ");
                                    double price = sc.nextDouble();
                                    ProductF product = new ProductF(name,price);
                                    products.add(product);
                                    sc.nextLine();
                                }
                            case 'u' ->                                 {
                                    System.out.print("Name: ");
                                    String name = sc.nextLine();
                                    System.out.print("Price: ");
                                    double price = sc.nextDouble();
                                    System.out.print("Manufacture date: ");
                                    String data = sc.next();
                                    
                                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    LocalDate date = LocalDate.parse(data,formatter);
                                    UsedProduct usedProduct = new UsedProduct(date,name,price);
                                    
                                    products.add(usedProduct);
                                    sc.nextLine();
                                }
                            case 'i' ->                                 {
                                    System.out.print("Name: ");
                                    String name = sc.nextLine();
                                    System.out.print("Price: ");
                                    double price = sc.nextDouble();
                                    System.out.print("Customs fee: ");
                                    double customsFee = sc.nextDouble();
                                    ImportedProduct importedProduct = new ImportedProduct(customsFee,name,price);
                                    products.add(importedProduct);
                                    sc.nextLine();
                                }
                            default -> System.out.println("Parametro Invalido");

                        }
                        
                    }
                    System.out.println("Price Tags: ");
                    for(ProductF e: products){
                        System.out.println(e.priceTag());
                    }
                    sc.nextLine();
                }
            }

        } while (opcao != 0); 
        sc.close(); 
    }
}
