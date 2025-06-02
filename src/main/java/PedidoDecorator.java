public abstract class PedidoDecorator implements Pedido {
    protected Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getDescricao() {
        return pedido.getDescricao();
    }

    public double getPreco() {
        return pedido.getPreco();
    }
}