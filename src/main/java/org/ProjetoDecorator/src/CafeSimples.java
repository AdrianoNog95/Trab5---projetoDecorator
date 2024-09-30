package org.ProjetoDecorator.src;

public class CafeSimples implements Bebida {

    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double custo() {
        return 2.00;  // Custo do café simples
    }
}
