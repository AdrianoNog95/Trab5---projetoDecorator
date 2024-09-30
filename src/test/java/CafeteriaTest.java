
import org.ProjetoDecorator.src.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CafeteriaTest {

    @Test
    public void testCafeSimples() {
        Bebida cafeSimples = new CafeSimples();
        assertEquals("Café Simples", cafeSimples.getDescricao());
        assertEquals(2.00, cafeSimples.custo(), 0.01);
    }

    @Test
    public void testCafeExpressoComLeite() {
        Bebida cafeExpresso = new CafeExpresso();
        cafeExpresso = new Leite(cafeExpresso);

        assertEquals("Café Expresso, Leite", cafeExpresso.getDescricao());
        assertEquals(3.50, cafeExpresso.custo(), 0.01);
    }

    @Test
    public void testCafeCappuccinoComChocolate() {
        Bebida cafeCappuccino = new CafeCappuccino();
        cafeCappuccino = new Chocolate(cafeCappuccino);

        assertEquals("Café Cappuccino, Chocolate", cafeCappuccino.getDescricao());
        assertEquals(5.25, cafeCappuccino.custo(), 0.01);
    }

    @Test
    public void testCafeMochaComVariosIngredientes() {
        Bebida cafeMocha = new CafeMocha();
        cafeMocha = new Leite(cafeMocha);
        cafeMocha = new Chocolate(cafeMocha);
        cafeMocha = new Canela(cafeMocha);

        assertEquals("Café Mocha, Leite, Chocolate, Canela", cafeMocha.getDescricao());
        assertEquals(6.50, cafeMocha.custo(), 0.01);  // Corrigido de 7.00 para 6.50
    }
}