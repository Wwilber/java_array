package aula_8_6_Criando_arrays_de_objetos;

public class Principal {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";
        // CRIAÇÃO DE UM ARRAY COM 3 ELEMENTOS:
        turmaB.alunos = new Aluno[3];

        // FORMA 01:
        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "João";
        turmaB.alunos[0].idade = 3;

        // FORMA 02:
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        turmaB.alunos[1] = aluno1;

        turmaB.imprimirListaDeAlunos();
        turmaB.imprimirListaDeAlunos2();


        // PERCORRER O ARRAY DE ALUNOS:
//        for (int i = 0; i < turmaB.alunos.length; i++) {
//            Aluno aluno = turmaB.alunos[i];
//            if ( aluno != null) {
//                System.out.printf("%d - %s (%d anos) %n",
//                        i, aluno.nome, aluno.idade);
//            }
//        }
    }
}
