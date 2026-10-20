package aula_8_11_Um_pouco_da_ArrayList_da_Collections_API;

import java.util.ArrayList;
import java.util.Arrays;

public class Turma2 {

    String identificacao;
    String nomeProfessora;
    // Aluno[] alunos = new Aluno[0];
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        //        alunos = Arrays.copyOf(alunos, alunos.length + 1);
        //        alunos[alunos.length - 1] = aluno;
    }

    void removerAluno(int indice) {
        alunos.remove(indice);
        //        Aluno[] novosAlunos = new Aluno[alunos.length - 1];
        //
        //        System.arraycopy(alunos, 0, novosAlunos, 0, indice);
        //        System.arraycopy(alunos, indice + 1,
        //                novosAlunos, indice, novosAlunos.length - indice);
        //  alunos = novosAlunos;
    }

    void imprimirListaAlunos() {
        for (Aluno aluno : alunos) {
            System.out.printf("%s (%d anos) %n", aluno.nome, aluno.idade);
        }
    }

}
