package exerciciosDaLista.exercicio006;

public class Client {
    private String nome;
    private String nif;
    private String telefone;

    public Client(String nif, String nome, String telefone) {
        this.nif = nif;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente\n");
        sb.append("\nNome: ").append(nome);
        sb.append("\nNIF: ").append(nif);
        sb.append("\nTelefone: ").append(telefone);
        return sb.toString();
    }
}
