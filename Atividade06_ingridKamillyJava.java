/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade06_ingridkamilly.java;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Aluno
 */
public class Atividade06_ingridKamillyJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        Questão 1
    
//        double nota;
//        
//        do {
//            System.out.print("Digite uma nota de 0 a 10: ");
//            nota = input.nextDouble();
//        
//            if (nota < 0 || nota > 10){
//                System.out.print("Valor inválido! Digite uma nota entre 0 e 10: ");
//            }
//            }while (nota < 0 || nota < 10);
//                System.out.print("Nota válida: "+nota);
          
        
//        Questão 2

//        double media;
//        int num,soma=0,contador=0;
//        
//        do{
//            System.out.print("Digite um número inteiro (0 para sair): ");
//            num = input.nextInt();
//            soma+= num;
//            contador++;
//        } while (num!=0);
//            System.out.println("Soma:"+soma);
//            System.out.println("Quantidade: "+(contador -1));
//            contador = contador -1;
//            media = soma / contador;
//            System.out.print("Média: "+media);
            
            
//        Questão 3    
            
        
//        int numsecreto = (int)(Math.random() * 100) + 1;
//        int palpite;
//        int tentativas = 0;
//        
//        do {
//            System.out.print("Digite um numero de 1 a 100: ");
//            palpite = input.nextInt();
//            tentativas++;
//            
//            if (palpite > numsecreto){
//                System.out.print("Muito alto!");
//            }
//            else if (palpite < numsecreto){
//                System.out.print("Muito baixo!");
//            }
//            
//        } while (palpite != numsecreto);
//          System.out.println("Acertou em " +tentativas+ " tentativas!");
        
        
//        Questão 4
            
//        int n;
//        String repetir;
//        
//        do {
//            do {
//                System.out.print("Digite um número (positivo): ");
//                
//                while (!input.hasNextInt()) {
//                    System.out.println("Valor inválido! Digite um inteiro.");
//                    input.next(); 
//                    System.out.print("Digite N (positivo): ");
//                }
//                
//                n = input.nextInt();
//                
//                if (n <= 0) {
//                    System.out.println("Valor inválido! Tente novamente.");
//                }
//            } while (n <= 0);
//
//            for (int i = n; i >= 0; i--) {
//                System.out.println(i);
//            }
//            
//            System.out.print("Deseja repetir o processo? (S para sim): ");
//            repetir = input.next();
//
//        } while (repetir.equalsIgnoreCase("S"));
//        System.out.println("Programa finalizado!");

//        Questão 5

//        String senhaCorreta = "Senai123";
//        String senhaDigitada;
//        int tentativas = 3;
//        
//        do {
//            System.out.print("Digite uma senha: ");
//            senhaDigitada = input.nextLine();
//
//            if (senhaDigitada.equals(senhaCorreta)) {
//                System.out.println("Acesso concedido.");
//                break;
//            } else {
//                tentativas--;
//                if (tentativas > 0) {
//                    System.out.println("Incorreta. Tentativas restantes: " + tentativas + ".");
//                } else {
//                    System.out.println("Conta bloqueada.");
//                }
//            }
//        } while (tentativas > 0);

//        Questão 6

//        int n;
//        System.out.print("Digite um número inteiro: ");
//        n = input.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }

//        Questão 7

//        int N;
//        do {
//            System.out.print("Digite um número inteiro maior que 0: ");
//            N = input.nextInt();
//            if (N <= 0) {
//                System.out.println("Número inválido! Tente novamente.");
//            }
//        } while (N <= 0);
//
//        int somaPares = 0;
//        int somaImpares = 0;
//
//        for (int i = 1; i <= N; i++) {
//            if (i % 2 == 0) {
//                somaPares += i; 
//            } else {
//                somaImpares += i; 
//            }
//        }
//
//        System.out.println("Soma dos pares: " + somaPares);
//        System.out.println("Soma dos ímpares: " + somaImpares);

//        Questão 8

//        int N;
//        do {
//            System.out.print("Digite um número inteiro maior que 1: ");
//            N = input.nextInt();
//            if (N <= 1) {
//                System.out.println("Número inválido! Tente novamente.");
//            }
//        } while (N <= 1);
//
//        System.out.println("Números primos de 1 até " + N + ":");
//
//        for (int k = 2; k <= N; k++) {
//            boolean primo = true;
//
//            for (int i = 2; i <= k / 2; i++) {
//                if (k % i == 0) {
//                    primo = false;
//                    break; 
//                }
//            }
//
//            if (primo) {
//                System.out.print(k + " ");
//            }
//        }
//    }
//}

