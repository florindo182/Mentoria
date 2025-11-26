/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao;

/**
 *
 * @author flori
 */
public class ContaTelefonica {
    private String numero;
    private String plano;
    private Integer limiteDadosMB;
    private Integer dadosConsumidosMB;
    private Double valorMensalBase;
    private Double valorPorMBExcedente;

    public String getNumero() {
        return numero;
    }

    public String getPlano() {
        return plano;
    }

    public Integer getLimiteDadosMB() {
        return limiteDadosMB;
    }

    public Double getValorMensalBase() {
        return valorMensalBase;
    }
    

    public Integer getDadosConsumidosMB() {
        return dadosConsumidosMB;
    }

    public void setDadosConsumidosMB(Integer dadosConsumidosMB) {
        this.dadosConsumidosMB = dadosConsumidosMB;
    }

    public Double getValorPorMBExcedente() {
        return valorPorMBExcedente;
    }


    public ContaTelefonica(String numero,String plano,Integer limiteDadosMB,Integer dadosConsumidosMB,Double valorMensalBase,Double valorPorMBExcedente){
        this.numero = numero;
        this.plano = plano;
        this.limiteDadosMB = limiteDadosMB;
        this.dadosConsumidosMB = dadosConsumidosMB;
        this.valorMensalBase = valorMensalBase;
        this.valorPorMBExcedente = valorPorMBExcedente;
    }
    public void registrarConsumoDados(int mb){
        setDadosConsumidosMB(getDadosConsumidosMB() + mb);
    }
    public int calcularExcedenteMB(){
        int result = getDadosConsumidosMB() - getLimiteDadosMB();
        if(result < 0){
            result = 0;
        }
        return result;
    }
    public double calcularValorAPagar(){
        int r = calcularExcedenteMB();
        double valorTotalAPagar = getValorMensalBase() + (r*getValorPorMBExcedente());
        return valorTotalAPagar;
    }
    
    @Override
    public String toString(){
        return "Numero: " + getNumero() + "\n" +
                "Plano: " + getPlano() + "\n" + 
                "Dados consumidos: " + getDadosConsumidosMB() + "MB\n" +
                "Excedente em MB: " + calcularExcedenteMB() + "MB\n" + 
                "Valor a pagar: " + calcularValorAPagar();
    }

    


    
}
