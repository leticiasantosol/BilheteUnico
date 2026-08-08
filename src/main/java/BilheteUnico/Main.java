package BilheteUnico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("carla", "carla@gmail.com", "11111111111", "234539879");
        BilheteComum b1 = new BilheteComum("4433", u1);

        Usuario u2 = new Usuario("João Pedro", "joao@gmail.com", "22222222222", "11976543210");
        BilheteComum b2 = new BilheteComum("BC002", u2);

        Usuario u3 = new Usuario("Mariana Lima", "mariana@gmail.com", "33333333333", "11965432109");
        BilheteEstudante b3 = new BilheteEstudante("BE001", u3);

        Usuario u4 = new Usuario("Lucas Martins", "lucas@gmail.com", "44444444444", "11954321098");
        BilheteEstudante b4 = new BilheteEstudante("BE002", u4);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);

        List<BilheteUnico> bilhetes = new ArrayList<>();
        bilhetes.add(b1);
        bilhetes.add(b2);
        bilhetes.add(b3);
        bilhetes.add(b4);

        int opcao = 0;

        Scanner scanner = new Scanner(System.in);
        while (opcao != 9) {
            exibirMenu();

            try {
                opcao = scanner.nextInt();

                switch (opcao) {

                    case 1: {
                        String nome;
                        String email;
                        String cpf;
                        String telefone;

                        scanner.nextLine();

                        System.out.println("Nome: ");
                        nome = scanner.nextLine();

                        System.out.println("Email: ");
                        email = scanner.next();

                        System.out.println("CPF: ");
                        cpf = scanner.next();

                        System.out.println("Telefone: ");
                        telefone = scanner.next();

                        Usuario novoUsuario = new Usuario(nome, email, cpf, telefone);

                        usuarios.add(novoUsuario);

                        System.out.println("Usuário cadastrado com sucesso!");

                        break;
                    }

                    case 2: {
                        String cpfUsuario;
                        int tipoBilhete;
                        String codigoBilhete;

                        System.out.println("Digite seu CPF:  ");
                        cpfUsuario = scanner.next();

                        Usuario usuarioEncontrado = null;
                        for (Usuario usuario : usuarios) {
                            if (cpfUsuario.equals(usuario.getCpf())) {
                                usuarioEncontrado = usuario;
                                break;
                            }
                        }

                        if (usuarioEncontrado == null) {
                            System.out.println("Usuário não encontrado");
                        } else {
                            System.out.println("Qual tipo de bilhete você deseja cadastrar?");
                            System.out.println("1 - Bilhete Comum");
                            System.out.println("2 - Bilhete Estudante");
                            tipoBilhete = scanner.nextInt();

                            if (tipoBilhete == 1 || tipoBilhete == 2) {

                                System.out.println("Qual o código do bilhete?");
                                codigoBilhete = scanner.next();

                                BilheteUnico novoBilhete;

                                if (tipoBilhete == 1) {
                                    novoBilhete = new BilheteComum(codigoBilhete, usuarioEncontrado);
                                } else {
                                    novoBilhete = new BilheteEstudante(codigoBilhete, usuarioEncontrado);
                                }

                                bilhetes.add(novoBilhete);
                                System.out.println("Bilhete cadastrado com sucesso!");

                            } else {
                                System.out.println("Tipo de bilhete inválido.");
                            }
                        }
                        break;
                    }
                    case 3: {
                        String codigoBilhete;
                        double recarga;

                        System.out.println("Qual o código do bilhete?");
                        codigoBilhete = scanner.next();

                        BilheteUnico bilheteEncontrado = null;
                        for (BilheteUnico bilhete : bilhetes) {
                            if (codigoBilhete.equals(bilhete.getCodigo())) {
                                bilheteEncontrado = bilhete;
                                break;
                            }
                        }

                        if (bilheteEncontrado == null) {
                            System.out.println("Bilhete não encontrado.");
                        } else {
                            System.out.println("Qual o valor da recarga?");
                            recarga = scanner.nextInt();

                            bilheteEncontrado.recarregarBilhete(recarga);

                            System.out.println("Bilhete recarregado com sucesso!");
                        }
                        break;
                    }
                    case 4: {
                        String codigoBilhete;

                        System.out.println("Qual o código do bilhete?");
                        codigoBilhete = scanner.next();

                        BilheteUnico bilheteEncontrado = null;
                        for (BilheteUnico bilhete : bilhetes) {
                            if (codigoBilhete.equals(bilhete.getCodigo())) {
                                bilheteEncontrado = bilhete;
                                break;
                            }
                        }

                        if (bilheteEncontrado == null) {
                            System.out.println("Bilhete não encontrado.");
                        } else {

                            bilheteEncontrado.pagarPassagem();

                            System.out.println("Passagem paga com sucesso!");
                        }
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
                scanner.nextLine();
            }
        }
    }
    public static void exibirMenu() {
        System.out.println("BILHETE ÚNICO");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|   Menu Principal                                   |");
        System.out.println("|   Informe a opção desejada ou 9 para sair          |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|   1 = Cadastrar Usuário                            |");
        System.out.println("|   2 = Cadastrar Bilhete                            |");
        System.out.println("|   3 = Recarregar Bilhete                           |");
        System.out.println("|   4 = Pagar Passagem                               |");
        System.out.println("|   5 = Listar Bilhetes                              |");
        System.out.println("|   6 = Pesquisar Bilhete por CPF                    |");
        System.out.println("+----------------------------------------------------+");
        System.out.print("Opção: ");
    }
}