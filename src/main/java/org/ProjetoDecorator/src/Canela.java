package org.ProjetoDecorator.src;

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
        return bebida.custo() + 0.25;  // Adiciona o custo da canela
    }
}
