package aula_8_9_Removendo_elementos_de_arrays;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};

        // COPIA DO ARRAY CRIADO COM 6 POSIÇÕES:
        int[] numerosNovoJogo = new int[numerosJogoAtual.length - 1];

        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numerosNovoJogo));

//        [25, 11, 8, 46, 37, 14, 55]
//        [0, 0, 0, 0, 0, 0]

        int indiceExclusao = 2;

        // COPIA O CONTEÚDO DO ARRAY:
        System.arraycopy(numerosJogoAtual, 0, numerosNovoJogo, 0,
                indiceExclusao);
        // System.arraycopy(numerosJogoAtual, indiceExclusao + 1, numerosNovoJogo, 2, 4);

        System.arraycopy(numerosJogoAtual, indiceExclusao + 1, numerosNovoJogo, indiceExclusao,numerosNovoJogo.length - indiceExclusao);


        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numerosNovoJogo));




    }
}
