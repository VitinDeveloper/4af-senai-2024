package com.main;

public class Estudante extends Pessoa {

    private String matricula;
    private String curso;

    // construtor
    public Estudante(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    //getter and setter
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
