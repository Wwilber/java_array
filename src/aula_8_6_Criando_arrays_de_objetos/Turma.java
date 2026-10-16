package aula_8_6_Criando_arrays_de_objetos;

public class Turma {
    String identificacao;
    String nomeProfessora;
    Aluno[] alunos;

    void imprimirListaDeAlunos2(){
        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = alunos[i];
            if ( aluno != null) {
                System.out.printf("%d - %s (%d anos) %n",
                        i, aluno.nome, aluno.idade);
            }
        }
    }

      void imprimirListaDeAlunos(){
          for (Aluno aluno : alunos){
              if (aluno != null){
                  System.out.printf("Nome: %s\n",aluno.nome, aluno.idade);
              } else {
                  System.out.println("Nenhum aluno encontrado");
              }
          }
      }

}
