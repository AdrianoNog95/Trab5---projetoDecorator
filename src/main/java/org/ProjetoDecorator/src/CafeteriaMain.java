package org.ProjetoDecorator.src;

public class CafeteriaMain {
    public static void main(String[] args) {
        // Pedido 1: Café Expresso
        Bebida meuCafe = new CafeExpresso();
        System.out.println(meuCafe.getDescricao() + " custa: R$" + meuCafe.custo());

        // Pedido 2: Café Expresso com Leite
        meuCafe = new Leite(meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa: R$" + meuCafe.custo());

        // Pedido 3: Café Cappuccino com Chocolate
        Bebida meuCappuccino = new CafeCappuccino();
        meuCappuccino = new Chocolate(meuCappuccino);
        System.out.println(meuCappuccino.getDescricao() + " custa: R$" + meuCappuccino.custo());

        // Pedido 4: Café Mocha com Leite, Chocolate e Canela
        Bebida meuMocha = new CafeMocha();
        meuMocha = new Leite(meuMocha);
        meuMocha = new Chocolate(meuMocha);
        meuMocha = new Canela(meuMocha);
        System.out.println(meuMocha.getDescricao() + " custa: R$" + meuMocha.custo());
    }
}
