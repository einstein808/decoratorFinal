public class PratoPrincipal implements Pedido {
    private String nome;
    private double precoBase;

    public PratoPrincipal(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getDescricao() {
        return nome;
    }

    public double getPreco() {
        return precoBase;
    }
}