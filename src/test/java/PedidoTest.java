import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PedidoTest {

    @Test
    public void deveRetornarPrecoPratoPrincipal() {
        Pedido pedido = new PratoPrincipal("Filé Mignon", 45.0f);
        assertEquals(45.0f, pedido.getPreco(), 0.001f); // Adicionado delta para comparação de float
    }

    @Test
    public void deveRetornarPrecoPratoComAcompanhamento() {
        Pedido pedido = new Acompanhamento(new PratoPrincipal("Filé Mignon", 45.0f), "Batata Frita", 8.0f);
        assertEquals(53.0f, pedido.getPreco(), 0.001f);
    }

    @Test
    public void deveRetornarPrecoPratoComBebida() {
        Pedido pedido = new Bebida(new PratoPrincipal("Filé Mignon", 45.0f), "Refrigerante", 6.0f);
        assertEquals(51.0f, pedido.getPreco(), 0.001f);
    }

    @Test
    public void deveRetornarPrecoPratoComSobremesa() {
        Pedido pedido = new Sobremesa(new PratoPrincipal("Filé Mignon", 45.0f), "Sorvete", 10.0f);
        assertEquals(55.0f, pedido.getPreco(), 0.001f);
    }

    @Test
    public void deveRetornarPrecoPratoComAcompanhamentoEBebida() {
        Pedido pedido = new Bebida(
                new Acompanhamento(
                        new PratoPrincipal("Filé Mignon", 45.0f),
                        "Batata Frita", 8.0f),
                "Refrigerante", 6.0f);
        assertEquals(59.0f, pedido.getPreco(), 0.001f);
    }

    @Test
    public void deveRetornarPrecoPratoCompleto() {
        Pedido pedido = new Sobremesa(
                new Bebida(
                        new Acompanhamento(
                                new PratoPrincipal("Filé Mignon", 45.0f),
                                "Batata Frita", 8.0f),
                        "Refrigerante", 6.0f),
                "Sorvete", 10.0f);
        assertEquals(69.0f, pedido.getPreco(), 0.001f);
    }

    @Test
    public void deveRetornarDescricaoPratoPrincipal() {
        Pedido pedido = new PratoPrincipal("Filé Mignon", 45.0f);
        assertEquals("Filé Mignon", pedido.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoPratoComAcompanhamento() {
        Pedido pedido = new Acompanhamento(new PratoPrincipal("Filé Mignon", 45.0f), "Batata Frita", 8.0f);
        assertEquals("Filé Mignon + Batata Frita", pedido.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoPratoComBebida() {
        Pedido pedido = new Bebida(new PratoPrincipal("Filé Mignon", 45.0f), "Refrigerante", 6.0f);
        assertEquals("Filé Mignon + Refrigerante", pedido.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoPratoComSobremesa() {
        Pedido pedido = new Sobremesa(new PratoPrincipal("Filé Mignon", 45.0f), "Sorvete", 10.0f);
        assertEquals("Filé Mignon + Sorvete", pedido.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoPratoComAcompanhamentoEBebida() {
        Pedido pedido = new Bebida(
                new Acompanhamento(
                        new PratoPrincipal("Filé Mignon", 45.0f),
                        "Batata Frita", 8.0f),
                "Refrigerante", 6.0f);
        assertEquals("Filé Mignon + Batata Frita + Refrigerante", pedido.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoPratoCompleto() {
        Pedido pedido = new Sobremesa(
                new Bebida(
                        new Acompanhamento(
                                new PratoPrincipal("Filé Mignon", 45.0f),
                                "Batata Frita", 8.0f),
                        "Refrigerante", 6.0f),
                "Sorvete", 10.0f);
        assertEquals("Filé Mignon + Batata Frita + Refrigerante + Sorvete", pedido.getDescricao());
    }
}