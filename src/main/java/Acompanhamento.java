public class Acompanhamento extends PedidoDecorator {
    private String nomeAcompanhamento;
    private double precoAcompanhamento;

    public Acompanhamento(Pedido pedido, String nome, double preco) {
        super(pedido);
        this.nomeAcompanhamento = nome;
        this.precoAcompanhamento = preco;
    }

    public String getDescricao() {
        return pedido.getDescricao() + " + " + nomeAcompanhamento;
    }

    public double getPreco() {
        return pedido.getPreco() + precoAcompanhamento;
    }
}