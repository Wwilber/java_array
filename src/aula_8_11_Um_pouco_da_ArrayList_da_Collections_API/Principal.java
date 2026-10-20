package aula_8_11_Um_pouco_da_ArrayList_da_Collections_API;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();
        // ADICIONAR ELEMENTOS NO ARRAY:
        alunos.add("João");
        alunos.add("Maria");

        // SIZE = LENGTH:
        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);
        }
        for (String aluno : alunos) {
            System.out.println(aluno);
        }





        /*
        String[] alunos = new String[2];
        alunos[0] = "João";
        alunos[1] = "Maria";

        for (int i = 0; i < alunos.length; i++) {
            String Aluno = alunos[1];
            System.out.println(Aluno);
        }

//        for (String aluno : alunos) {
//            System.out.println(aluno);
//        }
        */

        // COLLECTION estrutura de dados - ArrayList:
        //Array\list = não possui tamanho fixo do array - não precisa especificar;



    }
}
