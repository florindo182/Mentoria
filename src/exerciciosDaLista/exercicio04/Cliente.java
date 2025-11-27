package exerciciosDaLista.exercicio04;

public class Cliente {
    private String nome;
    private String nif;
    private String telefone;
    private Endereco endereco;

    public Cliente(Endereco endereco, String nif, String nome, String telefone) {
        this.endereco = endereco;
        this.nif = nif;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void atualizarTelefone(String novoTelefone){
        setTelefone(novoTelefone);
    }

    public void atualizarEndereco(Endereco novoEndereco){
        setEndereco(novoEndereco);
    }

    public String getNome() {
        return nome;
    }

    public String getNif() {
        return nif;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" + 
                "Nif: " + getNif() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Endereco: " + getEndereco();
    }

}
