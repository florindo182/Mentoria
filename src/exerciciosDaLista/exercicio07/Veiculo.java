package exerciciosDaLista.exercicio07;

public class Veiculo {
    private String matricula;
    private String modelo;
    private String marca;

    public Veiculo(String marca, String matricula, String modelo) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public void descrever(){
        System.out.println("---- Caracteristicas De Veiculos ----");
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veiculo{");
        sb.append("matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }

}
