package aula_8_11_Um_pouco_da_ArrayList_da_Collections_API;


public class Principal2 {
    public static void main(String[] args) {

        Turma2 turmaX = new Turma2();
        turmaX.identificacao = "Maternal B";
        turmaX.nomeProfessora = "Tia Maria";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 3;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Laura";
        aluno2.idade = 4;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Miguel";
        aluno3.idade = 3;

        turmaX.adicionarAluno(aluno1);
        turmaX.adicionarAluno(aluno2);
        turmaX.adicionarAluno(aluno3);

        turmaX.removerAluno(1);

        turmaX.imprimirListaAlunos();


    }


}

