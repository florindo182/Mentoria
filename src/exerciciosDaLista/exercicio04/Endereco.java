package exerciciosDaLista.exercicio04;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String pais;

    public Endereco(String bairro, String cidade, String pais, String rua) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
        this.rua = rua;
    }

   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rua: ").append(rua);
        sb.append("\nBairro: ").append(bairro);
        sb.append("\nCidade: ").append(cidade);
        sb.append("\nPais: ").append(pais);
        return sb.toString();
    }


    

}
