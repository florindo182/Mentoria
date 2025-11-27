package exerciciosDaLista.exercicio006;

public class Factura {
    private String numero;
    private String dataEmissao;
    private Double valor;
    private Client cliente;

    
    public Factura(String numero, String dataEmissao, Double valor) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        if(valor < 0){
            this.valor = 0.0;
        }
        this.valor = valor;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public void atualizarValor(double novoValor){
        setValor(novoValor);
    }
    public void associarCliente(Client cliente){
        setCliente(cliente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------ Fatura ------");
        sb.append("\nNumero: ").append(numero);
        sb.append("\nDataEmissao: ").append(dataEmissao);
        sb.append("\nValor: ").append(valor);
        sb.append("\n").append(cliente);
        return sb.toString();
    }
}
