package exerciciosDaLista.exercicio07;

public class Carro extends Veiculo {
    private int numeroPortas;
    private int capacidadePassageiros;

    public Carro(int capacidadePassageiros, int numeroPortas, String marca, String matricula, String modelo) {
        super(marca, matricula, modelo);
        this.capacidadePassageiros = capacidadePassageiros;
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    @Override
    public void descrever(){
        super.descrever();
    }

    @Override
    public String toString() {
        super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Carro{");
        sb.append("numeroPortas=").append(numeroPortas);
        sb.append(", capacidadePassageiros=").append(capacidadePassageiros);
        sb.append('}');
        return sb.toString();
    }


    
}
