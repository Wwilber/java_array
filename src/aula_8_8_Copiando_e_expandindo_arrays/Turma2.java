package aula_8_8_Copiando_e_expandindo_arrays;

import java.util.Arrays;

public class Turma2 {
    String identificacao;
    String nomeProfessora;
    Aluno2[] alunos2 = new Aluno2[0];

    void adicionarAluno(Aluno2 aluno) {
        this.alunos2 = Arrays.copyOf(this.alunos2, this.alunos2.length + 1);
        alunos2[alunos2.length - 1] = aluno;
    }

    void imprimirListaDeAlunos2() {
        for (int i = 0; i < alunos2.length; i++) {
            Aluno2 aluno = alunos2[i];
            if (aluno != null) {
                System.out.printf("%d - %s (%d anos) %n",
                        i, aluno.nome, aluno.idade);
            }
        }
    }

    void imprimirListaDeAlunos() {
        for (Aluno2 aluno : alunos2) {
            if (aluno != null) {
                System.out.printf("%s (%d anos) %n", aluno.nome, aluno.idade);
            } else {
                System.out.println("Nenhum aluno encontrado");
            }
        }
    }
}
