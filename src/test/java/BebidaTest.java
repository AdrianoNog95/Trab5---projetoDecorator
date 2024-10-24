import org.ProjetoDecorator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BebidaTest {

    @Test
    public void testCafeCappuccino() {
        Bebida bebida = new CafeCappuccino();
        assertEquals("Café Cappuccino", bebida.getDescricao());
        assertEquals(4.50, bebida.custo(), 0.01);
    }

    @Test
    public void testCafeExpresso() {
        Bebida bebida = new CafeExpresso();
        assertEquals("Café Expresso", bebida.getDescricao());
        assertEquals(3.00, bebida.custo(), 0.01);
    }

    @Test
    public void testCafeMocha() {
        Bebida bebida = new CafeMocha();
        assertEquals("Café Mocha", bebida.getDescricao());
        assertEquals(5.00, bebida.custo(), 0.01);
    }

    @Test
    public void testCafeSimples() {
        Bebida bebida = new CafeSimples();
        assertEquals("Café Simples", bebida.getDescricao());
        assertEquals(2.00, bebida.custo(), 0.01);
    }

    @Test
    public void testCafeComCanela() {
        Bebida bebida = new Canela(new CafeSimples());
        assertEquals("Café Simples, Canela", bebida.getDescricao());
        assertEquals(2.25, bebida.custo(), 0.01);
    }

    @Test
    public void testCafeComChocolate() {
        Bebida bebida = new Chocolate(new CafeExpresso());
        assertEquals("Café Expresso, Chocolate", bebida.getDescricao());
        assertEquals(3.75, bebida.custo(), 0.01);
    }

    @Test
    public void testCafeComLeite() {
        Bebida bebida = new Leite(new CafeCappuccino());
        assertEquals("Café Cappuccino, Leite", bebida.getDescricao());
        assertEquals(5.00, bebida.custo(), 0.01);
    }

    @Test
    public void testCafeComTodosIngredientes() {
        Bebida bebida = new Canela(new Chocolate(new Leite(new CafeMocha())));
        assertEquals("Café Mocha, Leite, Chocolate, Canela", bebida.getDescricao());
        assertEquals(6.50, bebida.custo(), 0.01);
    }
}
