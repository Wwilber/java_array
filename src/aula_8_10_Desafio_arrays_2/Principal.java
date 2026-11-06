package aula_8_10_Desafio_arrays_2;

public class Principal {

    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();
        // cardapio.itens = new ItemCardapio[5];

//        cardapio.itens[0] = new ItemCardapio();
//        cardapio.itens[0].descricao = "Rib Eye 500g";
//        cardapio.itens[0].preco = 95;
//
//        cardapio.itens[1] = new ItemCardapio();
//        cardapio.itens[1].descricao = "Picanha 400g";
//        cardapio.itens[1].preco = 102.6;
//
//        cardapio.itens[2] = new ItemCardapio();
//        cardapio.itens[2].descricao = "Batata Frita 300g";
//        cardapio.itens[2].preco = 12;

        ItemCardapio itens = new ItemCardapio();
        itens.descricao = "Rib Eye 500g";
        itens.preco = 95;

        ItemCardapio itens1 = new ItemCardapio();
        itens1.descricao = "Picanha 400g";
        itens1.preco = 102.6;
//

        cardapio.adicionarItem(itens);
        cardapio.adicionarItem(itens1);


        // cardapio.adicionarItem(itens4.descricao, itens4.preco);
        cardapio.imprimirListaItensCardapio();

//        for (int i = 0; i < cardapio.itens.length; i++) {
//            System.out.printf(" %d - %s - %.2f %n",
//            i, cardapio.itens[i].descricao, cardapio.itens[i].preco);
//        }


//        Cardapio cardapio = new Cardapio();
//        ItemCardapio item1 = new ItemCardapio();
//        item1.descricao = "Rib Eye 500g";
//        item1.preco = 95;
//
//        ItemCardapio item2 = new ItemCardapio();
//        item2.descricao = "Picanha 400g";
//        item2.preco = 102.5;
//
//        ItemCardapio item3 = new ItemCardapio();
//        item3.descricao = "Rib Eye 500g";
//        item3.preco = 95;


    }
}
