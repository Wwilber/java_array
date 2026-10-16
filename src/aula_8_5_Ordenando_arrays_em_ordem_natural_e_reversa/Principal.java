package aula_8_5_Ordenando_arrays_em_ordem_natural_e_reversa;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        int notas[] = {8, 5, 4, 9, 10};

        // ORDENAMENTO DE VALORES NO ARRAY - NO PRÓPRIO ARRAY - NÃO CRIA UM NOVO:
        Arrays.sort(notas);

        Integer notas2[] = {14, 17, 19, 20, 10};
        Arrays.sort(notas2);


        // ONDENAMENTO DE VALORES DE ARRAY(NA ORDEM INVERSA) - não pode ser do tipo primitivo(tem que ser de classe - WRAPEER):
        Arrays.sort(notas2, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notas));
        System.out.println(Arrays.toString(notas2));
    }
}
