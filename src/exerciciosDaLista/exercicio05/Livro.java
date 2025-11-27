package exerciciosDaLista.exercicio05;

public class Livro {
    private String titulo;
    private String autor;
    private Integer ano;
    private Categoria categoria;

    public Livro(Integer ano, String autor, Categoria categoria, String titulo) {
        this.ano = ano;
        this.autor = autor;
        this.categoria = categoria;
        this.titulo = titulo;
    }

    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public void alterarCategoria(Categoria novaCategoria){
        setCategoria(novaCategoria);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAno() {
        return ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------ Livro ------\n");
        sb.append("\nTitulo: ").append(titulo);
        sb.append("\nAutor: ").append(autor);
        sb.append("\nAno: ").append(ano);
        sb.append("\nCategoria: ").append(categoria);
        return sb.toString();
    }


}
