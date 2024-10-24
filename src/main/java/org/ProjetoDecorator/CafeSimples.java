package org.ProjetoDecorator;

public class CafeSimples implements Bebida {

    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double custo() {
        return 2.00;
    }
}
