package aula_8_3_Iterando_em_arrays;

public class Principal {
    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        double media = Calculadora.calcularMedia(notas);

        System.out.println(media);

    }
}
