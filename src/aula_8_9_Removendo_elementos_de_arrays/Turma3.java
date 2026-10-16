package aula_8_9_Removendo_elementos_de_arrays;

import java.util.Arrays;

public class Turma3 {
    String identificacao;
    String nomeProfessora;
    Aluno3[] alunos2 = new Aluno3[0];

    void adicionarAluno(Aluno3 aluno) {
        this.alunos2 = Arrays.copyOf(this.alunos2, this.alunos2.length + 1);
        alunos2[alunos2.length - 1] = aluno;
    }

    void imprimirListaDeAlunos2() {
        for (int i = 0; i < alunos2.length; i++) {
            Aluno3 aluno = alunos2[i];
            if (aluno != null) {
                System.out.printf("%d - %s (%d anos) %n",
                        i, aluno.nome, aluno.idade);
            }
        }
    }

    void imprimirListaDeAlunos() {
        for (Aluno3 aluno : alunos2) {
            if (aluno != null) {
                System.out.printf("%s (%d anos) %n", aluno.nome, aluno.idade);
            } else {
                System.out.println("Nenhum aluno encontrado");
            }
        }
    }
}
