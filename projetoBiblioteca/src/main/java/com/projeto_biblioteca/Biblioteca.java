package com.projeto_biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<Membro> membros;

    public Biblioteca() {
        livros = new ArrayList<>();
        membros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " adicionado.");
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
        System.out.println("Membro " + membro.getNome() + " adicionado.");
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Membro buscarMembroPorId(int id) {
        for (Membro membro : membros) {
            if (membro.getId() == id) {
                return membro;
            }
        }
        return null;
    }

    public void removerLivro(String titulo) {
        Iterator<Livro> iterator = livros.iterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                iterator.remove();
                System.out.println("Livro " + titulo + " removido.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void editarLivro(String titulo, String novoTitulo, String novoAutor, String novoIsbn,
            boolean novaDisponibilidade) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null) {
            livro.setTitulo(novoTitulo);
            livro.setAutor(novoAutor);
            livro.setIsbn(novoIsbn);
            livro.setDisponibilidade(novaDisponibilidade);
            System.out.println("Livro " + titulo + " atualizado.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }
}