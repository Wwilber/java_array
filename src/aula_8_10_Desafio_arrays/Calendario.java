package aula_8_10_Desafio_arrays;

import java.util.Scanner;

public class Calendario {

    String[] meses;


    void listaMes(int mes){
        int mesescolhido = mes;
        System.out.printf("O mês é: %s ", meses[mesescolhido]);


    }

    //    static String obterNomeMes(String numeroMes) {
    //        return switch (numeroMes) {
    //            case "1" -> "Janeiro";
    //            case "2" -> "Fevereiro";
    //            case "3" -> "Março";
    //            case "4" -> "Abril";
    //            case "5" -> "Maio";
    //            case "6" -> "Junho";
    //            case "7" -> "Julho";
    //            case "8" -> "Agosto";
    //            case "9" -> "Setembro";
    //            case "10" -> "Outubro";
    //            case "11" -> "Novembro";
    //            case "12" -> "Dezembro";
    //            default -> "";
    //        };
    //    }
}
