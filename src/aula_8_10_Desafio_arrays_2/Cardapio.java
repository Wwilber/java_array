package aula_8_10_Desafio_arrays_2;

public class Cardapio {

    ItemCardapio[] itens;

    void imprimirListaItensCardapio() {
        for (int i = 0; i < itens.length; i++) {
            System.out.printf(" %d - %s - %.2f %n",
                    i, itens[i].descricao, itens[i].preco);
        }
    }


    void adicionarItem(ItemCardapio[] item) {
        this.itens = item;
    }
//
//    void removerItem(ItemCardapio item) {
//        // TODO
//    }
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
