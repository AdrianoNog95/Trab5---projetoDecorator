package org.ProjetoDecorator.src;

public class CafeMocha implements Bebida {

    @Override
    public String getDescricao() {
        return "Café Mocha";
    }

    @Override
    public double custo() {
        return 5.00;  // Custo do mocha
    }
}
