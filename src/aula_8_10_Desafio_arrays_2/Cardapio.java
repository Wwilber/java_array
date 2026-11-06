package aula_8_10_Desafio_arrays_2;

import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(ItemCardapio item) {
        // this.itens = Arrays.re(this.itens, this.itens.length + 1);
        itens[itens.length - 1] = item;
    }
//
//    void removerItem(ItemCardapio item) {
//        // TODO
//    }
//

    void imprimirListaItensCardapio() {
        for (int i = 0; i < itens.length; i++) {
            System.out.printf(" %d - %s - %.2f %n",
                    i, itens[i].descricao, itens[i].preco);
        }
//
//
//
//
//    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
//        if (precoMinimo <= precoMaximo) {
//            for (int i = 0; i < itens.length; i++) {
//                System.out.printf("%s -  %f %n",
//                        itens[i].descricao, itens[i].preco);
//            }
//        }


//    }

    }
}
