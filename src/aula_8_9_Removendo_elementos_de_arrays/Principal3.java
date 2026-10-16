package aula_8_9_Removendo_elementos_de_arrays;

public class Principal3 {
    public static void main(String[] args) {
        Turma3 turmaB = new Turma3();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        Aluno3 alunox = new Aluno3();
        alunox.nome = "João";
        alunox.idade = 3;

        Aluno3 alunoy = new Aluno3();
        alunoy.nome = "Laura";
        alunoy.idade = 4;

        turmaB.adicionarAluno(alunox);
        turmaB.adicionarAluno(alunoy);
        turmaB.adicionarAluno(alunox);

        turmaB.imprimirListaDeAlunos();
        // turmaB.imprimirListaDeAlunos2();


    }

}
