package model;

import enums.CLASSIFICACAO;
import model.interfaces.Folha;

public final class Professor extends Pessoa implements Folha {

    private String especializacao;
    private double salario;
    public CLASSIFICACAO CLASSIFICACAO;

    public Professor() {
        super();
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public CLASSIFICACAO getCargo() {
        return CLASSIFICACAO;
    }

    public void setCargo(CLASSIFICACAO CLASSIFICACAO) {
        this.CLASSIFICACAO = CLASSIFICACAO;
    }

    public Professor(String nome, int idade, CLASSIFICACAO CLASSIFICACAO) {
        super(nome, idade);
        this.CLASSIFICACAO = CLASSIFICACAO;
    }

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + salario +
                                  "\nProfissão: " + CLASSIFICACAO;
    }

    @Override
    public void quemSouEu() {
        System.out.println(CLASSIFICACAO.Professor);
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Minha atividade é ensinar.");
    }

    @Override
    public void calculaSalario() {
        System.out.println("(horas trabalhadas x valor hora)");
    }
}
