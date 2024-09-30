package org.ProjetoDecorator.src;

public class CafeExpresso implements Bebida {

    @Override
    public String getDescricao() {
        return "Café Expresso";
    }

    @Override
    public double custo() {
        return 3.00;  // Custo do café expresso
    }
}
