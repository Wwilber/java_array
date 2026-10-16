package aula_8_8_Copiando_e_expandindo_arrays;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};

        // COPIAR UM ARRAY: Arrays.copyOf(parametros: arrayOriginal, tamanho que quer copiar):
        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length);

        int[] numerosJogo3 = Arrays.copyOf(numerosJogo1, numerosJogo1.length+1);
        numerosJogo3[numerosJogo3.length-1] = 2;

        Arrays.sort(numerosJogo3);

        System.out.println(Arrays.toString(numerosJogo1));
        System.out.println(Arrays.toString(numerosJogo2));
        System.out.println(Arrays.toString(numerosJogo3));

        
    }
}
