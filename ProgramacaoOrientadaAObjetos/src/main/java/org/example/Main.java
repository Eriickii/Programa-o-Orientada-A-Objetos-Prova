package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Buscar Telefone");
            System.out.println("4. Buscar CPF");
            System.out.println("5. Buscar Data de Cadastro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Data de Nascimento (YYYY-MM-DD): ");
                    LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());
                    System.out.print("Sexo: ");
                    String sexo = scanner.nextLine();
                    System.out.print("Nome da Mãe: ");
                    String mae = scanner.nextLine();
                    System.out.print("Nome do Pai: ");
                    String pai = scanner.nextLine();
                    System.out.print("Endereço Completo: ");
                    String enderecoCompleto = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Foto: ");
                    String foto = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    LocalDate dataCadastro;
                    while (true) {
                        try {
                            System.out.print("Data de Cadastro (YYYY-MM-DD): ");
                            dataCadastro = LocalDate.parse(scanner.nextLine());
                            System.out.println("Data de Cadastro registrada: " + dataCadastro.format(formatoBrasileiro));
                            break;
                        } catch (DateTimeParseException e) {
                            System.out.println("Formato de data inválido! Por favor, use o formato YYYY-MM-DD.");
                        }
                    }

                    Pessoa pessoa = new Pessoa(pessoas.size() + 1, nome, dataNascimento, sexo, mae, pai, enderecoCompleto, email, telefone, foto, cpf, dataCadastro);
                    pessoas.add(pessoa);
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de Pessoas:");
                    for (Pessoa p : pessoas) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome da pessoa para buscar o telefone: ");
                    String nomeBusca = scanner.nextLine();
                    boolean foundTelefone = false;
                    for (Pessoa p : pessoas) {
                        if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Telefone: " + p.getTelefone());
                            foundTelefone = true;
                            break;
                        }
                    }
                    if (!foundTelefone) {
                        System.out.println("Não há cadastro para o nome informado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome da pessoa para buscar o CPF: ");
                    String nomeBuscaCpf = scanner.nextLine();
                    boolean foundCpf = false;
                    for (Pessoa p : pessoas) {
                        if (p.getNome().equalsIgnoreCase(nomeBuscaCpf)) {
                            System.out.println("CPF: " + p.getCpf());
                            foundCpf = true;
                            break;
                        }
                    }
                    if (!foundCpf) {
                        System.out.println("Não há cadastro para o nome informado.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome da pessoa para buscar a data de cadastro: ");
                    String nomeBuscaData = scanner.nextLine();
                    boolean foundData = false;
                    for (Pessoa p : pessoas) {
                        if (p.getNome().equalsIgnoreCase(nomeBuscaData)) {
                            System.out.println("Data de Cadastro: " + p.getDataCadastro().format(formatoBrasileiro));
                            foundData = true;
                            break;
                        }
                    }
                    if (!foundData) {
                        System.out.println("Não há cadastro para o nome informado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 0);

        scanner.close();
    }
}
