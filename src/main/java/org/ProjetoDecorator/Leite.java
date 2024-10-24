package org.ProjetoDecorator;

public class Leite extends BebidaDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    @Override
    public double custo() {
        return bebida.custo() + 0.50;
    }
}
