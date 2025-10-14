/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade07_ingridkamilly.java;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author ingri
 */
public class Atividade07_ingridKamillyJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        Questão 1

//        int[][] matriz = new int[4][4];
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("Digite o número da posição [" + i + "][" + j + "]: ");
//                matriz[i][j] = input.nextInt();
//            }
//        }
//
//        System.out.println("\nMatriz 4x4:");
//        for (int[] linha : matriz) {
//            for (int n : linha) {
//                System.out.print(n + "\t");
//            }
//            System.out.println();
//        }

//        Questão 2

//        int[] valores = new int[8];
//
//        for (int i = 0; i < valores.length; i++) {
//            System.out.print("Digite o " + (i + 1) + "º valor: ");
//            valores[i] = input.nextInt();
//        }
//
//        int maior = valores[0];
//        int posicao = 0;
//
//        for (int i = 1; i < valores.length; i++) {
//            if (valores[i] > maior) {
//                maior = valores[i];
//                posicao = i;
//            }
//        }
//
//        System.out.println("\nMaior valor: " + maior);
//        System.out.println("Posição: " + posicao);

//        Questão 3

//        int[] vet1 = new int[5];
//        int[] vet2 = new int[5];
//
//        for (int i = 0; i < vet1.length; i++) {
//            System.out.print("Digite o " + (i + 1) + "º valor: ");
//            vet1[i] = input.nextInt();
//            vet2[i] = vet1[i];
//        }
//
//        System.out.print("\nVetor 1: ");
//        for (int v : vet1) System.out.print(v + " ");
//
//        System.out.print("\nVetor 2: ");
//        for (int v : vet2) System.out.print(v + " ");

//        Questão 4

//        double[] numeros = new double[20];
//        double soma = 0;
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print("Digite o " + (i + 1) + "º número: ");
//            numeros[i] = input.nextDouble();
//            soma += numeros[i];
//        }
//
//        double media = soma / numeros.length;
//        System.out.println("\nMédia: " + media);
//        System.out.println("Valores menores que a média:");
//
//        for (double n : numeros) {
//            if (n < media) System.out.println(n);
//        }

//        Questão 5

//        String senha;
//        boolean valida;
//
//        do {
//            System.out.print("Digite uma senha: ");
//            senha = input.nextLine();
//            valida = true;
//
//            if (senha.length() < 8) {
//                System.out.println("Mínimo de 8 caracteres. ");
//                valida = false;
//            }
//
//            boolean temDigito = false;
//            for (int i = 0; i < senha.length(); i++) {
//                char c = senha.charAt(i);
//                if (c >= '0' && c <= '9') {
//                    temDigito = true;
//                    break;
//                }
//            }
//
//            if (!temDigito) {
//                System.out.println("Falta um dígito. ");
//                valida = false;
//            }
//
//            if (valida) System.out.println("Senha válida! ");
//
//        } while (!valida);

//        Questão 6

//        System.out.print("Digite uma frase: ");
//        String frase = input.nextLine();
//
//        int vogais = 0, consoantes = 0, espacos = 0, outros = 0;
//
//        for (int i = 0; i < frase.length(); i++) {
//            char c = frase.charAt(i);
//            if ("aeiou".indexOf(c) != -1) vogais++;
//            else if (c >= 'a' && c <= 'z') consoantes++;
//            else if (c == ' ') espacos++;
//            else outros++;
//        }
//
//        System.out.println("\nVogais: " + vogais);
//        System.out.println("Consoantes: " + consoantes);
//        System.out.println("Espaços: " + espacos);
//        System.out.println("Outros símbolos: " + outros);

//        Questão 7

//        System.out.print("Digite um texto: ");
//        String texto = input.nextLine().toLowerCase();
//
//        System.out.print("Digite a palavra que deseja contar: ");
//        String palavra = input.nextLine().toLowerCase();
//
//        String[] palavras = texto.split("[\\s,.;!?()]+");
//
//        int contador = 0;
//        for (String p : palavras) {
//            if (p.equals(palavra)) {
//                contador++;
//            }
//        }
//
//        if (contador > 0)
//            System.out.println("\nA palavra \"" + palavra + "\" aparece " + contador + " vez(es).");
//        else
//            System.out.println("\nA palavra \"" + palavra + "\" não foi encontrada no texto.");

//        Questão 8

//        System.out.print("Cadastre um nome de usuário: ");
//        String nomeUsuario = input.nextLine();
//
//        int tentativas = 3;
//        boolean acessoConcedido = false;
//
//        do {
//            System.out.print("\nDigite o nome de usuário: ");
//            String usuario = input.nextLine();
//
//            if (usuario.equalsIgnoreCase(nomeUsuario)) {
//                System.out.println("Acesso concedido! ");
//                acessoConcedido = true;
//            } else {
//                tentativas--;
//                if (tentativas > 0)
//                    System.out.println("Acesso negado. Tentativas restantes: " + tentativas);
//            }
//
//        } while (!acessoConcedido && tentativas > 0);
//
//        if (!acessoConcedido)
//            System.out.println("\nConta bloqueada após 3 tentativas! ");






        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
