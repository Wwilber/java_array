package aula_8_8_Copiando_e_expandindo_arrays;

public class Principal2 {
    public static void main(String[] args) {
        Turma2 turmaB = new Turma2();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        Aluno2 alunox = new Aluno2();
        alunox.nome = "João";
        alunox.idade = 3;

        Aluno2 alunoy = new Aluno2();
        alunoy.nome = "Laura";
        alunoy.idade = 4;

        turmaB.adicionarAluno(alunox);
        turmaB.adicionarAluno(alunoy);
        turmaB.adicionarAluno(alunox);

        turmaB.imprimirListaDeAlunos();
        // turmaB.imprimirListaDeAlunos2();


    }

}
