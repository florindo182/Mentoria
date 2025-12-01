package exerciciosDaLista.exercicio08;

public class Funcionario {
    private String nome;
    private String documento;
    private Double salarioBase;

    public Funcionario(String documento, String nome, Double salarioBase) {
        this.documento = documento;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Double calcularSalarioMensal(){
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }
    

}
