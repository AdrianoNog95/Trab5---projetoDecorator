package org.ProjetoDecorator;

public class CafeExpresso implements Bebida {

    @Override
    public String getDescricao() {
        return "Café Expresso";
    }

    @Override
    public double custo() {
        return 3.00;
    }
}
