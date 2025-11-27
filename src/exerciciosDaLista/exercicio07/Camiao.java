package exerciciosDaLista.exercicio07;

public class Camiao extends Veiculo {
    private double capacidadeCargaToneladas;
    private int numeroEixos;

    public Camiao(double capacidadeCargaToneladas, int numeroEixos, String marca, String matricula, String modelo) {
        super(marca, matricula, modelo);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
        this.numeroEixos = numeroEixos;
    }

    public double getCapacidadeCargaToneladas() {
        return capacidadeCargaToneladas;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }
    
    @Override
    public void descrever(){
        super.descrever();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        super.toString();
        sb.append("Camiao{");
        sb.append("capacidadeCargaToneladas=").append(capacidadeCargaToneladas);
        sb.append(", numeroEixos=").append(numeroEixos);
        sb.append('}');
        return sb.toString();
    }


    
}
