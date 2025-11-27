package exerciciosDaLista.exercicio02;

public class SensorTemperatura {
    private String identificador;
    private String local;
    private Double leituraMinima;
    private Double leituraMaxima;
    private Double somaLeituras;
    private Integer quantidadesLeituras;

    public SensorTemperatura(String identificador, String local) {
        this.identificador = identificador;
        this.local = local;
        this.quantidadesLeituras = 0;
        this.somaLeituras = 0.0;
        this.leituraMinima = Double.MIN_VALUE;
        this.leituraMaxima = Double.MAX_VALUE;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getLocal() {
        return local;
    }

    public Double getLeituraMinima() {
        return leituraMinima;
    }

    public Double getLeituraMaxima() {
        return leituraMaxima;
    }

    public Double getSomaLeituras() {
        return somaLeituras;
    }

    public Integer getQuantidadesLeituras() {
        return quantidadesLeituras;
    }

    public void registrarLeitura(double valor){
        if (getQuantidadesLeituras() == 0) {
            leituraMinima = valor;
            leituraMaxima = valor;
        } else {
            if (valor < leituraMinima) leituraMinima = valor;
            if (valor > leituraMaxima) leituraMaxima = valor;
        }

        somaLeituras += valor;
        quantidadesLeituras++;
    }   
    public Double obterMedia(){
        return getSomaLeituras() / getQuantidadesLeituras();
    }
    public String obterIntervalo(){
        return getLeituraMaxima() + "-" + getLeituraMinima();
    }

    @Override
    public String toString(){
        return "Identificador: " + getIdentificador() + "\n" + 
                "Local: " + getLocal() + "\n" +
                "Temperatura minima: " + getLeituraMinima() + "\n" +
                "Temperatura maxima: " + getLeituraMaxima() + "\n" +
                "Temperatura media: " + obterMedia() + "\n" + "\n" +
                "Intervalo de temperatura: " + obterIntervalo();

    }

}
