package org.ProjetoDecorator.src;

public class Chocolate extends BebidaDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate";
    }

    @Override
    public double custo() {
        return bebida.custo() + 0.75;  // Adiciona o custo do chocolate
    }
}
