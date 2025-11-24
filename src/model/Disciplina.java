package model;

public class Disciplina {

    private String nomeDisciplina;
    private int cargaHoraria;
    private Professor professor;
    private Aluno aluno;

    public Disciplina (String nomeDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void associarProfessor(Professor professor) {
        this.professor = professor;
    }

    public void associarAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Nome da disciplina: " + nomeDisciplina +
                "\nCarga Horária: " + cargaHoraria +
                "\nmodel.Professor: " + professor.getNome() +
                "\nmodel.Aluno: " + aluno.getNome();
    }
}
