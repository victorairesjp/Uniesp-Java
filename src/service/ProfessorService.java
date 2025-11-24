package service;

import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {

    private ArrayList<Professor> professores = new ArrayList<>();

    //@PostMapping - Cadastrar
    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor cadastrado: " + professor.getNome());
    }

    //@GetMapping - Read
    public List<Professor> listarProfessores() {
        return professores;
    }

    //@PutMapping - Update
    public void atualizarProfessor(String nome, String novoNome) {
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                professor.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Professor não foi encontrado.");
    }

    //DeleteMapping - Delete
    public void deletarProfessor(String nome) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getNome().equalsIgnoreCase(nome)) {
                professores.remove(i);
                System.out.println("Deletado com sucesso!");
                return;
            }
        }
    }
}
