import model.Professor;
import service.ProfessorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        model.Professor professor = new model.Professor("Fernanda", 35, 5000);
//        model.Aluno aluno = new model.Aluno("Victor", 33, "12345");
//        model.Disciplina disciplina = new model.Disciplina("Java", 40);
//
//        disciplina.associarProfessor(professor);
//        disciplina.associarAluno(aluno);
//        System.out.println(disciplina);
//
//        professor.quemSouEu();
//        professor.minhaAtividade();
//        aluno.quemSouEu();
//        aluno.minhaAtividade();
//
//        System.out.println(enums.CLASSIFICACAO.model.Professor);

        Professor p = new Professor();
        ProfessorService cp = new ProfessorService();

        // Cadastrar
        System.out.println("Nome: ");
        p.setNome(sc.nextLine());
        System.out.println("Idade: ");
        p.setIdade(sc.nextInt());
        cp.cadastrarProfessor(p);

        // Listar
        System.out.println("Lista de Professores cadastrados: ");
        System.out.println(cp.listarProfessores());

        // Att
        System.out.println("Informe o nome do professor que deseja atualizar: ");
        p.setNome(sc.nextLine());
        sc.nextLine();
        System.out.println("Informe o novo nome: ");
        p.setNome(sc.nextLine());
        cp.atualizarProfessor(p.getNome(), p.getNome());
        System.out.println(cp.listarProfessores());



//        // Deletar
//        System.out.println("Informe o nome do professor que deseja deletar: ");
//        p.setNome(sc.nextLine());
//        cp.deletarProfessor(p.getNome());

        sc.close();
    }
}
