package DesafioJava01_ingridKamilly.java;
import java.util.*;
import java.util.Scanner;

public class DesafioJava01_ingridKamillyJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        double saldoReais = 100.00;
        double saldoDolares = 0.00;
        final double COTACAO_DOLAR = 5.32;
        ArrayList<String> extrato = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== Caixa Rápido ===");
            System.out.println("1- Saldo");
            System.out.println("2- Depósito");
            System.out.println("3- Extrato");
            System.out.println("4- Simular Empréstimo");
            System.out.println("5- Comprar Dólar");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("SALDO");
                    System.out.printf("Reais: R$ %.2f\n", saldoReais);
                    System.out.printf("Dólares: US$ %.2f\n", saldoDolares);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito (até R$5000): ");
                    double valorDep = input.nextDouble();
                    if (valorDep > 0 && valorDep <= 5000) {
                        saldoReais += valorDep;
                        extrato.add("Depósito R$ " + String.format("%.2f", valorDep));
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 3:
                    System.out.println("EXTRATO");
                    if (extrato.isEmpty()) {
                        System.out.println("Nenhuma movimentação.");
                    } else {
                        for (int i = extrato.size() - 1; i >= 0 && i > extrato.size() - 11; i--) {
                            System.out.println(extrato.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.print("\nValor do empréstimo (200 a 100000): R$ ");
                    double valorEmp = input.nextDouble();
                    System.out.print("Seu salário bruto: R$ ");
                    double salario = input.nextDouble();

                    int[] parcelasValidas = {6, 12, 18, 24, 30, 36, 40, 48, 56, 60, 72};
                    int parcelas;
                    boolean parcelaValida;

                    do {
                        System.out.print("Quantidade de parcelas (6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72): ");
                        parcelas = input.nextInt();
                        parcelaValida = false;
                        for (int p : parcelasValidas) {
                            if (parcelas == p) {
                                parcelaValida = true;
                                break;
                            }
                        }
                    if (!parcelaValida) {
                            System.out.println("Número de parcelas inválido! Tente novamente.\n");
                        }
                    } while (!parcelaValida);

                    double totalComJuros = valorEmp * Math.pow(1.02, parcelas);
                    double valorParcela = totalComJuros / parcelas;
                    double limite = salario * 0.30;

                    if (valorParcela <= limite) {
                        int protocolo = 10000 + rand.nextInt(90000);
                        System.out.println("\nEmpréstimo disponível, entre em contato com a central e informe o número de protocolo EM" + protocolo + ".");
                        System.out.printf("Valor solicitado: R$ %.2f\n", valorEmp);
                        System.out.printf("Valor total com juros: R$ %.2f\n", totalComJuros);
                        System.out.printf("Valor da parcela: R$ %.2f\n", valorParcela);
                    } else {
                        System.out.println("\nEmpréstimo indisponível.");
                    }
                    
                    break;
                
                case 5:
                    System.out.printf("Saldo disponível em Reais: R$ %.2f\n", saldoReais);
                    System.out.print("Quantos dólares deseja comprar? ");
                    int qtd = input.nextInt();
                    double custo = qtd * COTACAO_DOLAR;
                    System.out.printf("Custo em Reais: R$ %.2f\n", custo);

                    if (custo > saldoReais) {
                        System.out.println("Saldo insuficiente! ");
                    } 
                    else {
                        System.out.print("Confirma a compra(s/n)? ");
                        String compra = input.next();
                        if (compra.equalsIgnoreCase("s")) {
                            saldoReais -= custo;
                            saldoDolares += qtd;
                            extrato.add("Compra US$ " + qtd + " - R$ " + String.format("%.2f", custo));
                            System.out.println("Compra realizada com sucesso! ");
                        } else {
                            System.out.println("Operação cancelada! ");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa... ");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
            
            if (opcao != 0) {
                System.out.println("\nDeseja voltar ao menu ou sair?");
                System.out.println("1 - Voltar ao menu");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");
                int escolha = input.nextInt();
                if (escolha == 0) {
                    System.out.println("Encerrando o programa...");
                }
                break;
            }
            

        }while(opcao != 0);
    }
}
