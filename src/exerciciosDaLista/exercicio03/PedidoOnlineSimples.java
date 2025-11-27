package exerciciosDaLista.exercicio03;

public class PedidoOnlineSimples {
    private String numeroPedido;
    private String descricaoPedido;
    private Integer quantidade;
    private Double precoUnitario;
    private String estado;

    public PedidoOnlineSimples(String descricaoPedido,String numeroPedido, Double precoUnitario, Integer quantidade) {
        this.descricaoPedido = descricaoPedido;
        this.estado = "NOVO";
        this.numeroPedido = numeroPedido;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }
    
    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public double calcularTotal(){
        return quantidade * precoUnitario;
    }
    public void marcarComoPago(){
        setEstado("PAGO");
    }
    public void marcarComoEnviado(){
        setEstado("ENVIADO");
    }

    @Override
    public String toString(){
        return "Numero de Pedido: " + getNumeroPedido() + "\n" + 
                "Descricao: " + getDescricaoPedido() + "\n" + 
                "Estado: " + getEstado() + "\n" +
                "Valor total: " + calcularTotal();
    }
}
