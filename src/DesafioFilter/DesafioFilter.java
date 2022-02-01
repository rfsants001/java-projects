package DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {
        Produto p1 = new Produto ("Lapis", 1.99, 0.12, 0);
        Produto p2 = new Produto ("Notebook", 4000, 0.5, 100);
        Produto p3 = new Produto ("Smartphone", 2500, 0.30, 0);
        Produto p4 = new Produto ("Monitor", 1000, 0.12, 30);
        Produto p5 = new Produto ("Camera", 4500, 0.20, 0);

        List<Produto> produtos = Arrays.asList(p1, p2 , p3 , p4 , p5);

        Predicate<Produto> grandeDesconto = p -> p.desconto >= 0.30;
        Predicate<Produto> freteGratiz = p -> p.valorFrete == 0;
        Predicate<Produto> produtoRelevante = p -> p.preco >= 500;

        Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$ " + p.preco;

        produtos.stream().filter(grandeDesconto).filter(freteGratiz).filter(produtoRelevante).map(chamadaPromocional).forEach(System.out::println);

    }
}
