package com.projeto_biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Menu de opções
        while (true) {
            System.out.println("\nSistema de Biblioteca");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar Membro");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Listar Livros");
            System.out.println("6. Listar Membros");
            System.out.println("7. Remover Livro");
            System.out.println("8. Editar Livro");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    // Cadastro de Livro
                    System.out.println("Digite o tipo de livro (1. Livro Físico, 2. eBook, 3. Revista): ");
                    int tipoLivro = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();

                    if (tipoLivro == 1) {
                        LivroFisico livroFisico = new LivroFisico(titulo, autor, isbn, true);
                        biblioteca.adicionarLivro(livroFisico);
                    } else if (tipoLivro == 2) {
                        System.out.print("Tamanho do arquivo (MB): ");
                        double tamanhoArquivo = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer
                        System.out.print("Formato: ");
                        String formato = scanner.nextLine();
                        eBook ebook = new eBook(titulo, autor, isbn, true, tamanhoArquivo, formato);
                        biblioteca.adicionarLivro(ebook);
                    } else if (tipoLivro == 3) {
                        System.out.print("Edição: ");
                        int edicao = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer
                        System.out.print("Mês de publicação: ");
                        String mesPublicacao = scanner.nextLine();
                        Revista revista = new Revista(titulo, autor, isbn, true, edicao, mesPublicacao);
                        biblioteca.adicionarLivro(revista);
                    } else {
                        System.out.println("Tipo de livro inválido.");
                    }
                    break;

                case 2:
                    // Cadastro de Membro
                    System.out.print("Nome do Membro: ");
                    String nomeMembro = scanner.nextLine();
                    System.out.print("ID do Membro: ");
                    int idMembro = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    Membro membro = new Membro(nomeMembro, idMembro);
                    biblioteca.adicionarMembro(membro);
                    break;

                case 3:
                    // Emprestar Livro
                    System.out.print("Digite o título do livro para emprestar: ");
                    String tituloLivroEmprestimo = scanner.nextLine();
                    Livro livroEmprestimo = biblioteca.buscarLivroPorTitulo(tituloLivroEmprestimo);

                    if (livroEmprestimo != null && livroEmprestimo.getDisponibilidade()) {
                        System.out.print("Digite o ID do membro: ");
                        int idMembroEmprestimo = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer
                        Membro membroEmprestimo = biblioteca.buscarMembroPorId(idMembroEmprestimo);

                        if (membroEmprestimo != null) {
                            Emprestimo emprestimo = new Emprestimo(livroEmprestimo, membroEmprestimo, LocalDate.now(),
                                    LocalDate.now().plusDays(14));
                            emprestimo.registrarEmprestimo();
                        } else {
                            System.out.println("Membro não encontrado.");
                        }
                    } else {
                        System.out.println("Livro não disponível ou não encontrado.");
                    }
                    break;

                case 4:
                    // Devolver Livro
                    System.out.print("Digite o título do livro para devolver: ");
                    String tituloLivroDevolucao = scanner.nextLine();
                    Livro livroDevolucao = biblioteca.buscarLivroPorTitulo(tituloLivroDevolucao);

                    if (livroDevolucao != null && !livroDevolucao.getDisponibilidade()) {
                        System.out.print("Digite o ID do membro: ");
                        int idMembroDevolucao = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer
                        Membro membroDevolucao = biblioteca.buscarMembroPorId(idMembroDevolucao);

                        if (membroDevolucao != null) {
                            Emprestimo devolucao = new Emprestimo(livroDevolucao, membroDevolucao, LocalDate.now(),
                                    LocalDate.now());
                            devolucao.registrarDevolucao();
                        } else {
                            System.out.println("Membro não encontrado.");
                        }
                    } else {
                        System.out.println("Livro não está emprestado ou não encontrado.");
                    }
                    break;

                case 5:
                    // Listar Livros
                    System.out.println("Livros na Biblioteca:");
                    for (Livro livro : biblioteca.getLivros()) {
                        System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Tipo: "
                                + livro.getTipo() + ", Disponível: " + (livro.getDisponibilidade() ? "Sim" : "Não"));
                    }
                    break;

                case 6:
                    // Listar Membros
                    System.out.println("Membros da Biblioteca:");
                    for (Membro membroListar : biblioteca.getMembros()) {
                        System.out.println("Nome: " + membroListar.getNome() + ", ID: " + membroListar.getId());
                    }
                    break;

                case 7:
                    // Remover Livro
                    System.out.print("Digite o título do livro para remover: ");
                    String tituloRemover = scanner.nextLine();
                    biblioteca.removerLivro(tituloRemover);
                    break;

                case 8:
                    // Editar Livro
                    System.out.print("Digite o título do livro que deseja editar: ");
                    String tituloEditar = scanner.nextLine();
                    Livro livroEditar = biblioteca.buscarLivroPorTitulo(tituloEditar);

                    if (livroEditar != null) {
                        System.out.print("Novo Título: ");
                        String novoTitulo = scanner.nextLine();
                        System.out.print("Novo Autor: ");
                        String novoAutor = scanner.nextLine();
                        System.out.print("Novo ISBN: ");
                        String novoIsbn = scanner.nextLine();
                        System.out.print("Disponível (true/false): ");
                        boolean novaDisponibilidade = scanner.nextBoolean();
                        scanner.nextLine(); // Limpa o buffer

                        biblioteca.editarLivro(tituloEditar, novoTitulo, novoAutor, novoIsbn, novaDisponibilidade);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 9:
                    System.out.println("Encerrando o sistema.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}