package exerciciosDaLista.exercicio05;

public class Categoria {
    private String nome;
    private String descricao;

    public Categoria(String nome,String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }


    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Descricao: " + getDescricao();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }


    
}
