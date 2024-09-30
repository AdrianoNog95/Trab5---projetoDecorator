package org.ProjetoDecorator.src;

public class CafeCappuccino implements Bebida {

    @Override
    public String getDescricao() {
        return "Café Cappuccino";
    }

    @Override
    public double custo() {
        return 4.50;  // Custo do cappuccino
    }
}
