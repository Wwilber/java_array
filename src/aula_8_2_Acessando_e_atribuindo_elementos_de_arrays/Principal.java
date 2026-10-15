package aula_8_2_Acessando_e_atribuindo_elementos_de_arrays;

public class Principal {
    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        // ALTERAR VALOR DE POSIÇÃO DO ARRAY:
        notas[0] = 159;

        // FAZ O PRINT DO CÓDIGO DO OBJETO:
        System.out.println(notas);

        // EMPRIME O CONTEÚDO DA POSIÇÃO DO ARRAY:
        System.out.println(notas[0]);

        int totalNotas = notas[0] + notas[1] + notas[2];

        int posicao = 2;
        System.out.println(notas[posicao]);
        System.out.println(notas[posicao] - 1);



    }
}
