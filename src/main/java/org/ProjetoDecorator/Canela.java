package org.ProjetoDecorator;

public class Canela extends BebidaDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Canela";
    }

    @Override
    public double custo() {
        return bebida.custo() + 0.25;
    }
}
