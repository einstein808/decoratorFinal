public class Bebida extends PedidoDecorator {
    private String nomeBebida;
    private double precoBebida;

    public Bebida(Pedido pedido, String nome, double preco) {
        super(pedido);
        this.nomeBebida = nome;
        this.precoBebida = preco;
    }

    public String getDescricao() {
        return pedido.getDescricao() + " + " + nomeBebida;
    }

    public double getPreco() {
        return pedido.getPreco() + precoBebida;
    }
}