package exerciciosDaLista.exercicio08;

public class CoordenadorCurso extends Funcionario{
    private String cursoResponsavel;
    private Double gratificacaoCoordenacao;

    public CoordenadorCurso(String cursoResponsavel, Double gratificacaoCoordenacao, String documento, String nome, Double salarioBase) {
        super(documento, nome, salarioBase);
        this.cursoResponsavel = cursoResponsavel;
        this.gratificacaoCoordenacao = gratificacaoCoordenacao;
    }

    @Override
    public Double calcularSalarioMensal(){
        return getSalarioBase() + gratificacaoCoordenacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Coordenador do Curso ----");
        sb.append("\nNome: ").append(getNome());
        sb.append("\nSalario Mensal: ").append(calcularSalarioMensal());
        return sb.toString();
    }

    


}
