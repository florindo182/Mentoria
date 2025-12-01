package exerciciosDaLista.exercicio08;

public class Professor extends Funcionario {
    private String area;
    private Integer horasAulaSemana;

    public Professor(String area, Integer horasAulaSemana, String documento, String nome, Double salarioBase) {
        super(documento, nome, salarioBase);
        this.area = area;
        this.horasAulaSemana = horasAulaSemana;
    }


    @Override
    public Double calcularSalarioMensal(){
        return getSalarioBase() + horasAulaSemana * 10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Professor ----");
        sb.append("\nNome: ").append(getNome());
        sb.append("\nArea: ").append(area);
        sb.append("\nSalario Mensal: ").append(calcularSalarioMensal());
        return sb.toString();
    }
    
}
