package util;

import entities.Produto;

import java.util.function.Predicate;

public class ProdutoPredicado implements Predicate<Produto> {


    @Override
    public boolean test(Produto p) {
        return p.getPreco()>=2500.0; //retorna p > = 2500.00
    }
}
