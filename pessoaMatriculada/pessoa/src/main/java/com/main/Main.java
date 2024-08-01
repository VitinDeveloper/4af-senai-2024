package com.main;

public class Main {
    public static void main(String[] args) {
        Estudante e = new Estudante("Vitin", 19, "1234", "Dev");

        System.out.println("Nome: " + e.getNome());
        System.out.println("Idade: " + e.getIdade());
        System.out.println("Matricula: " + e.getMatricula());
        System.out.println("Curso: " + e.getCurso());
    }
}