public class Sobremesa extends PedidoDecorator {
    private String nomeSobremesa;
    private double precoSobremesa;

    public Sobremesa(Pedido pedido, String nome, double preco) {
        super(pedido);
        this.nomeSobremesa = nome;
        this.precoSobremesa = preco;
    }

    public String getDescricao() {
        return pedido.getDescricao() + " + " + nomeSobremesa;
    }

    public double getPreco() {
        return pedido.getPreco() + precoSobremesa;
    }
}