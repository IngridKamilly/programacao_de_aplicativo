/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade05_ingridkamilly.java;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Aluno
 */
public class Atividade05_ingridKamillyJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        Questão 1

//        System.out.print("Digite um número: ");
//        int n = input.nextInt();
//
//        int i = 1; 
//
//        while (i <= n) {
//            System.out.println(i);
//            i++;
//        }
//        
//        input.close(); 
//    }
//}

//        Questão 2

//        int numero;
//        int soma = 0;
//        int quantidade = 0;
//
//        System.out.print("Digite um número inteiro (-1 para sair): ");
//        numero = input.nextInt();
//
//        while (numero != -1) {
//            soma += numero;       
//            quantidade++;         
//            System.out.print("Digite outro número inteiro (-1 para sair): ");
//            numero = input.nextInt();
//        }
//        
//        System.out.println("\nSoma dos valores: " + soma);
//        System.out.println("Quantidade de valores digitados: " + quantidade);
//
//        input.close();
//    }    
//}

//        Questão 3

//        String senha = "";
//
//        while (!senha.equals("Java123")) {
//            System.out.print("Digite a senha: ");
//            senha = input.nextLine();
//
//            if (!senha.equals("Java123")) {
//                System.out.println("Senha incorreta!");
//            }
//        }
//
//        System.out.println("Acesso permitido!");
//
//        input.close();
//    }    
//}

//        Questão 4 

//        int opcao = -1;
//        int num1,num2;
//
//        while (opcao != 0) {
//            System.out.println("MENU:");
//            System.out.println("1 - Somar");
//            System.out.println("2 - Subtrair");
//            System.out.println("3 - Multiplicar");
//            System.out.println("0 - Sair");
//            opcao = input.nextInt();
//
//            if (opcao == 0) {
//                System.out.println("Saindo...");
//                break;
//            }
//
//            System.out.println("Digite o primeiro número: ");
//            num1 = input.nextInt();
//            
//            System.out.println("Digite o segundo número: ");
//            num2 = input.nextInt();
//
//            switch (opcao) {
//                case 1:
//                    System.out.println("Resultado: " + (num1 + num2));
//                    break;
//                case 2:
//                    System.out.println("Resultado: " + (num1 - num2));
//                    break;
//                case 3:
//                    System.out.println("Resultado: " + (num1 * num2));
//                    break;
//                default:
//                    System.out.println("Opção inválida!");
//            }
//        }
//    }
//}

//        Questão 5

//        int n;
//        
//        System.out.print("Digite um número inteiro n >= 0: ");
//        n = input.nextInt();
//        
//        while (n < 0) {
//            System.out.println("Número inválido! Digite novamente.");
//            n = input.nextInt();
//        }
//
//        int resultado = 1;
//        int i = 1;
//
//        while (i <= n) {
//            resultado *= i;
//            i++;
//        }
//
//        System.out.println(n + "! = " + resultado);
//    }
//
//    public static int inputInt(String mensagem) {
//        System.out.print(mensagem + " ");
//        Scanner sc = new Scanner(System.in);
//        return sc.nextInt();
//    }
//}

//        Questão 6

//        int N;
//        
//        System.out.print("Digite um número inteiro N > 0: ");
//        N = input.nextInt();
//        
//        while (N <= 0) {
//            System.out.println("Número inválido! Digite novamente.");
//            N = input.nextInt();
//        }
//
//        int a = 0;
//        int b = 1;
//
//        System.out.print("Fibonacci: " + a + " " + b);
//
//        int proximo = a + b;
//
//        while (proximo <= N) {
//            System.out.print(" " + proximo);
//            a = b;
//            b = proximo;
//            proximo = a + b;
//        }
//
//        System.out.println(); 
//    }
//
//    public static int inputInt(String mensagem) {
//        System.out.print(mensagem + " ");
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        return input.nextInt();
//    }
//}

//        Questão 7

//        int n;
//        System.out.print("Digite um número inteiro n >= 2: ");
//        n = input.nextInt();
//        
//        while (n < 2) {
//            System.out.println("Número inválido! Digite novamente.");
//            n = input.nextInt();
//        }
//
//        boolean primo = true;
//        int divisor = 2;
//        double raiz = Math.sqrt(n);
//
//        while (divisor <= raiz) {
//            if (n % divisor == 0) {
//                primo = false;
//                break; 
//            }
//            divisor++;
//        }
//
//        if (primo) {
//            System.out.println(n + " é primo");
//        } else {
//            System.out.println(n + " não é primo");
//        }
//    }
//
//    public static int inputInt(String mensagem) {
//        System.out.print(mensagem + " ");
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        return input.nextInt();
//    }
//    
//}

//        Questão 8
        
//        int numero;
//        int soma = 0;
//
//        System.out.print("Digite um número (negativo para encerrar): ");
//        numero = input.nextInt();
//
//        while (numero >= 0) {
//            soma += numero;
//            System.out.print("Digite outro número (negativo para encerrar): ");
//            numero = input.nextInt();
//        }
//
//        System.out.println("Soma total: " + soma);
//        input.close(); 
//    }
//}

//        Questão 9

//        int n;
//        System.out.print("Digite um número inteiro: ");
//        n = input.nextInt();
//        
//        int numero = Math.abs(n);
//        int soma = 0;
//
//        while (numero > 0) {
//            soma += numero % 10; 
//            numero /= 10;        
//        }
//
//        System.out.println("Soma dos dígitos: " + soma);
//    }
//}

//        Questão 10

        int n;
        System.out.print("Digite um número inteiro n > 0: ");
        n = input.nextInt();

        while (n <= 0) {
            System.out.println("Número inválido! Digite novamente.");
            n = input.nextInt();
        }

        System.out.println("Sequência de Collatz:");

        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;     
            } else {
                n = 3 * n + 1;  
            }
        }
        System.out.println(n);
    }
}