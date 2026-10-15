package aula_8_3_Iterando_em_arrays;

public class Calculadora {

    static double calcularMedia(int[] numeros){
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        // SINTAXE SIMPLIFICADA - percorre toda array  "numeros.for":
        for (int numero : numeros) {
            total += numero;
        }

        return (double) total / numeros.length;
    }
}
