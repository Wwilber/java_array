package aula_8_4_Transformando_arrays_em_representacoes_em_string;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int notas[] = {8, 5, 4, 9, 10};

        // TRANSFORMAR ARRAY EM STRING:
        String notasEmString = Arrays.toString(notas);

        System.out.println(notasEmString);
    }
}
