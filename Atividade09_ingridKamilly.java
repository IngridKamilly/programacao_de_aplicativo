/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade09_ingridkamilly;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Comparator;
import java.time.LocalDate;
import java.time.DayOfWeek;

/**
 *
 * @author ingri
 */
public class Atividade09_ingridKamilly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
//        Agenda de Contatos

//class Contato {
//    private String nome;
//    private String telefone;
//    private String email;
//
//    Contato(String nome, String telefone, String email) {
//        setNome(nome);
//        setTelefone(telefone);
//        setEmail(email);
//    }
//
//    public String getNome() { return nome; }
//    public void setNome(String nome) {
//        if (nome == null || nome.trim().isEmpty()) 
//            throw new IllegalArgumentException("Nome não pode ser vazio");
//        this.nome = nome.trim();
//    }
//
//    public String getTelefone() { return telefone; }
//    public void setTelefone(String telefone) {
//        if (telefone == null || !telefone.matches("\\d{10,11}")) 
//            throw new IllegalArgumentException("Telefone inválido");
//        this.telefone = telefone;
//    }
//
//    public String getEmail() { return email; }
//    public void setEmail(String email) {
//        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) 
//            throw new IllegalArgumentException("Email inválido");
//        this.email = email.trim();
//    }
//
//    @Override
//    public String toString() {
//        return nome + " | " + telefone + " | " + email;
//    }
//}
//
//class AgendaEletronica {
//    private ArrayList<Contato> contatos = new ArrayList<>();
//    private Scanner input = new Scanner(System.in);
//
//    public void iniciar() {
//        int opcao;
//        do {
//            System.out.println("1- Cadastrar ");
//            System.out.println("2- Consultar ");
//            System.out.println("3- Editar ");
//            System.out.println("4- Excluir ");
//            System.out.println("0-Sair ");
//            System.out.print("Escolha: ");
//            while (!input.hasNextInt()) {
//                System.out.println("Digite um número válido!");
//                input.next();
//            }
//            opcao = input.nextInt();
//            input.nextLine();
//            switch(opcao) {
//                case 1: cadastrar(); 
//                break;
//                case 2: consultar(); 
//                break;
//                case 3: editar(); 
//                break;
//                case 4: excluir(); 
//                break;
//                case 0: System.out.println("Saindo..."); 
//                break;
//                default: System.out.println("Opção inválida!");
//            }
//        } while (opcao != 0);
//    }
//
//    private void cadastrar() {
//        try {
//            System.out.print("Nome: "); 
//            String n = input.nextLine();
//            System.out.print("Telefone: "); 
//            String t = input.nextLine();
//            if (existeTelefone(t)) { 
//                System.out.println("Telefone já cadastrado"); 
//                return; 
//            }
//            System.out.print("Email: "); 
//            String e = input.nextLine();
//            contatos.add(new Contato(n, t, e));
//            System.out.println("Contato cadastrado!");
//        } catch (Exception ex) {
//            System.out.println("Erro: " + ex.getMessage());
//        }
//    }
//
//    private void consultar() {
//        if (contatos.isEmpty()) { 
//            System.out.println("Agenda vazia"); 
//            return; 
//        }
//        contatos.sort(Comparator.comparing(Contato::getNome, String.CASE_INSENSITIVE_ORDER));
//        for (Contato c : contatos) System.out.println(c);
//    }
//
//    private void editar() {
//        System.out.print("Nome do contato a editar: "); 
//        String n = input.nextLine();
//        Contato c = acharContato(n);
//        if (c == null) { 
//            System.out.println("Não encontrado"); 
//            return; 
//        }
//        try {
//            System.out.print("Novo nome ("+c.getNome()+"): "); 
//            String nn = input.nextLine();
//            if (nn != null && !nn.trim().isEmpty()) c.setNome(nn);
//
//            System.out.print("Novo telefone ("+c.getTelefone()+"): "); 
//            String nt = input.nextLine();
//            if (nt != null && !nt.trim().isEmpty()) {
//                if (!nt.equals(c.getTelefone()) && existeTelefone(nt)) {
//                    System.out.println("Telefone já cadastrado");
//                    return;
//                }
//                c.setTelefone(nt);
//            }
//
//            System.out.print("Novo email ("+c.getEmail()+"): "); 
//            String ne = input.nextLine();
//            if (ne != null && !ne.trim().isEmpty()) c.setEmail(ne);
//
//            System.out.println("Contato atualizado!");
//        } catch (Exception ex) {
//            System.out.println("Erro: " + ex.getMessage());
//        }
//    }
//
//    private void excluir() {
//        System.out.print("Nome do contato a excluir: "); 
//        String n = input.nextLine();
//        Contato c = acharContato(n);
//        if (c == null) { 
//            System.out.println("Não encontrado"); 
//            return; 
//        }
//        System.out.print("Confirma exclusão (s/n)? "); 
//        String r = input.nextLine();
//        if (r.equalsIgnoreCase("s")) { 
//            contatos.remove(c); 
//            System.out.println("Contato excluído!"); 
//        } else {
//            System.out.println("Exclusão cancelada");
//        }
//    }
//
//    private boolean existeTelefone(String t) {
//        for (Contato c : contatos) 
//            if (c.getTelefone() != null && c.getTelefone().equals(t)) return true;
//        return false;
//    }
//
//    private Contato acharContato(String n) {
//        for (Contato c : contatos) 
//            if (c.getNome() != null && c.getNome().equalsIgnoreCase(n)) return c;
//        return null;
//    }
//}
//    AgendaEletronica agenda = new AgendaEletronica();
//    agenda.iniciar();
    
        
//        Biblioteca de Livros

//class Livro {
//    private String titulo;
//    private String autor;
//    private int ano;
//    private String codigo;
//    private boolean emprestado;
//
//    
//    Livro(String titulo, String autor, int ano, String codigo) {
//        this.titulo = titulo;
//        this.autor = autor;
//        this.ano = ano;
//        this.codigo = codigo;
//        this.emprestado = false;
//    }
//
//    
//    String getTitulo() {
//        return titulo;
//    }
//
//    void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    String getAutor() {
//        return autor;
//    }
//
//    void setAutor(String autor) {
//        this.autor = autor;
//    }
//
//    int getAno() {
//        return ano;
//    }
//
//    void setAno(int ano) {
//        this.ano = ano;
//    }
//
//    String getCodigo() {
//        return codigo;
//    }
//
//    void setCodigo(String codigo) {
//        this.codigo = codigo;
//    }
//
//    boolean isEmprestado() {
//        return emprestado;
//    }
//
//    void setEmprestado(boolean emprestado) {
//        this.emprestado = emprestado;
//    }
//
//    String getStatus() {
//        return emprestado ? "Emprestado" : "Disponível";
//    }
//}
//
//class Biblioteca {
//    private ArrayList<Livro> acervo;
//
//    Biblioteca() {
//        acervo = new ArrayList<>();
//        
//        acervo.add(new Livro("Dom Casmurro", "Machado de Assis", 1899, "L001"));
//        acervo.add(new Livro("O Alquimista", "Paulo Coelho", 1988, "L002"));
//        acervo.add(new Livro("1984", "George Orwell", 1949, "L003"));
//        acervo.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945, "L004"));
//    }
//
//    void listarAcervo() {
//        System.out.println("\n--- Acervo da Biblioteca ---");
//        for (Livro l : acervo) {
//            System.out.println("Código: " + l.getCodigo() + " | Título: " + l.getTitulo() + " | Autor: " + l.getAutor() + " | Ano: " + l.getAno() + " | Status: " + l.getStatus());
//        }
//    }
//
//    Livro buscarLivro(String chave) {
//        for (Livro l : acervo) {
//            if (l.getCodigo().equalsIgnoreCase(chave) || l.getTitulo().equalsIgnoreCase(chave)) {
//                return l;
//            }
//        }
//        return null;
//    }
//
//    void emprestarLivro(Scanner input) {
//        System.out.print("\nDigite o Código ou Título do livro que deseja pegar emprestado: ");
//        String chave = input.nextLine().trim();
//        Livro livro = buscarLivro(chave);
//
//        if (livro == null) {
//            System.out.println("Livro não encontrado!");
//            return;
//        }
//
//        if (livro.isEmprestado()) {
//            System.out.println("Ops! Esse livro já está emprestado.");
//            return;
//        }
//
//        System.out.print("Informe o nome do leitor: ");
//        String leitor = input.nextLine().trim();
//
//        
//        livro.setEmprestado(true);
//
//       
//        LocalDate hoje = LocalDate.now();
//        LocalDate devolucao = calcularDataDevolucao(hoje, 7);
//
//        System.out.println("\n--- Ficha de Empréstimo ---");
//        System.out.println("Livro: " + livro.getTitulo());
//        System.out.println("Autor: " + livro.getAutor());
//        System.out.println("Código: " + livro.getCodigo());
//        System.out.println("Leitor: " + leitor);
//        System.out.println("Data do Empréstimo: " + hoje);
//        System.out.println("Data de Devolução (7 dias úteis): " + devolucao);
//    }
//
//    private LocalDate calcularDataDevolucao(LocalDate inicio, int diasUteis) {
//        LocalDate data = inicio;
//        int adicionados = 0;
//
//        while (adicionados < diasUteis) {
//            data = data.plusDays(1);
//            DayOfWeek diaSemana = data.getDayOfWeek();
//            if (diaSemana != DayOfWeek.SATURDAY && diaSemana != DayOfWeek.SUNDAY) {
//                adicionados++;
//            }
//        }
//
//        return data;
//    }
//}
//
//class SistemaBiblioteca {
//    private Biblioteca biblioteca;
//    private Scanner input;
//
//    SistemaBiblioteca() {
//        biblioteca = new Biblioteca();
//        input = new Scanner(System.in);
//    }
//
//    void iniciar() {
//        int opcao = 0;
//
//        do {
//            exibirMenu();
//            while (!input.hasNextInt()) {
//                System.out.println("Digite um número válido!");
//                input.next();
//            }
//            opcao = input.nextInt();
//            input.nextLine(); 
//
//            switch (opcao) {
//                case 1:
//                    biblioteca.listarAcervo();
//                    break;
//                case 2:
//                    biblioteca.emprestarLivro(input);
//                    break;
//                case 3:
//                    System.out.println("Saindo do sistema. Até mais!");
//                    break;
//                default:
//                    System.out.println("Opção inválida! Tente novamente.");
//            }
//
//        } while (opcao != 3);
//    }
//
//    private void exibirMenu() {
//        System.out.println("\n=== Sistema de Biblioteca ===");
//        System.out.println("1. Consultar acervo");
//        System.out.println("2. Pegar livro emprestado");
//        System.out.println("3. Sair");
//        System.out.print("Escolha uma opção: ");
//    }
//}
//    SistemaBiblioteca sistema = new SistemaBiblioteca();
//    sistema.iniciar();

//        Gerenciador de Traefas


//class Tarefa {
//    private int id;
//    private String descricao;
//    private int prioridade; 
//    private String prazo; 
//    private boolean concluida;
//
//    
//    public Tarefa(int id, String descricao, int prioridade, String prazo) {
//        this.id = id;
//        this.descricao = descricao;
//        this.prioridade = prioridade;
//        this.prazo = prazo;
//        this.concluida = false;
//    }
//
//    
//    public int getId() { return id; }
//
//    public String getDescricao() { return descricao; }
//    public void setDescricao(String descricao) { this.descricao = descricao; }
//
//    public int getPrioridade() { return prioridade; }
//    public void setPrioridade(int prioridade) { 
//        if(prioridade >= 1 && prioridade <= 3)
//            this.prioridade = prioridade; 
//    }
//
//    public String getPrazo() { return prazo; }
//    public void setPrazo(String prazo) { this.prazo = prazo; }
//
//    public boolean isConcluida() { return concluida; }
//    public void concluir() { this.concluida = true; }
//
//    
//    public String toString() {
//        String status = concluida ? "Concluída" : "Pendente";
//        String prioridadeTexto = prioridade == 1 ? "Alta" : prioridade == 2 ? "Média" : "Baixa";
//        return "[" + id + "] " + descricao + " | Prioridade: " + prioridadeTexto + " | Prazo: " + prazo + " | Status: " + status;
//    }
//}
//
//class GerenciadorTarefas {
//    private ArrayList<Tarefa> tarefas = new ArrayList<>();
//    private int contadorId = 1;
//    private Scanner input = new Scanner(System.in);
//
//    public void executar() {
//        int opcao;
//        do {
//            exibirMenu();
//            opcao = lerInteiro("Escolha uma opção: ");
//            switch(opcao) {
//                case 1: adicionarTarefa(); break;
//                case 2: concluirTarefa(); break;
//                case 3: listarTarefas(); break;
//                case 4: System.out.println("Saindo..."); break;
//                default: System.out.println("Opção inválida! Tente novamente.");
//            }
//        } while(opcao != 4);
//    }
//
//    private void exibirMenu() {
//        System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
//        System.out.println("1. Adicionar tarefa");
//        System.out.println("2. Concluir tarefa");
//        System.out.println("3. Listar tarefas");
//        System.out.println("4. Sair");
//    }
//
//    private void adicionarTarefa() {
//        System.out.print("Descrição da tarefa: ");
//        String descricao = input.nextLine();
//        int prioridade = lerInteiro("Prioridade (1 = Alta, 2 = Média, 3 = Baixa): ");
//        while(prioridade < 1 || prioridade > 3) {
//            System.out.println("Prioridade inválida! Escolha 1, 2 ou 3.");
//            prioridade = lerInteiro("Prioridade (1 = Alta, 2 = Média, 3 = Baixa): ");
//        }
//        System.out.print("Prazo (dd/mm/aaaa, opcional): ");
//        String prazo = input.nextLine();
//        if(prazo.isEmpty()) prazo = "-";
//
//        Tarefa t = new Tarefa(contadorId++, descricao, prioridade, prazo);
//        tarefas.add(t);
//        System.out.println("Tarefa adicionada com sucesso!");
//    }
//
//    private void concluirTarefa() {
//        if(tarefas.isEmpty()) {
//            System.out.println("Não há tarefas cadastradas.");
//            return;
//        }
//        listarTarefasPendente();
//        int id = lerInteiro("Digite o ID da tarefa a concluir: ");
//        Tarefa t = buscarTarefaPorId(id);
//        if(t != null && !t.isConcluida()) {
//            t.concluir();
//            System.out.println("Tarefa concluída!");
//        } else if(t == null) {
//            System.out.println("Tarefa não encontrada.");
//        } else {
//            System.out.println("Tarefa já estava concluída.");
//        }
//    }
//
//    private void listarTarefas() {
//        if(tarefas.isEmpty()) {
//            System.out.println("Não há tarefas cadastradas.");
//            return;
//        }
//        System.out.println("\n=== TAREFAS PENDENTES ===");
//        tarefas.stream()
//                .filter(t -> !t.isConcluida())
//                .sorted(Comparator.comparingInt(Tarefa::getPrioridade))
//                .forEach(System.out::println);
//
//        System.out.println("\n=== TAREFAS CONCLUÍDAS ===");
//        tarefas.stream()
//                .filter(Tarefa::isConcluida)
//                .forEach(System.out::println);
//    }
//
//    private void listarTarefasPendente() {
//        System.out.println("\nTarefas pendentes:");
//        tarefas.stream()
//                .filter(t -> !t.isConcluida())
//                .sorted(Comparator.comparingInt(Tarefa::getPrioridade))
//                .forEach(System.out::println);
//    }
//
//    private Tarefa buscarTarefaPorId(int id) {
//        for(Tarefa t : tarefas) {
//            if(t.getId() == id) return t;
//        }
//        return null;
//    }
//
//    private int lerInteiro(String mensagem) {
//        int valor = -1;
//        while(true) {
//            try {
//                System.out.print(mensagem);
//                String linha = input.nextLine();
//                valor = Integer.parseInt(linha);
//                break;
//            } catch(NumberFormatException e) {
//                System.out.println("Valor inválido! Digite um número inteiro.");
//            }
//        }
//        return valor;
//    }
//}
//        GerenciadorTarefas gt = new GerenciadorTarefas();
//        gt.executar();


//        Sistema de Notas

//        class Aluno {
//    private String codigo;
//    private String nome;
//    private double notaFinal;
//    private String situacao;
//
//    Aluno(String codigo, String nome) {
//        this.codigo = codigo;
//        this.nome = nome;
//        this.notaFinal = 0;
//        this.situacao = "";
//    }
//
//    public String getCodigo() {
//        return codigo;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public double getNotaFinal() {
//        return notaFinal;
//    }
//
//    public void setNotaFinal(double notaFinal) {
//        this.notaFinal = notaFinal;
//        atualizarSituacao();
//    }
//
//    public String getSituacao() {
//        return situacao;
//    }
//
//    private void atualizarSituacao() {
//        if (notaFinal >= 60) {
//            situacao = "Aprovado";
//        } else if (notaFinal >= 45) {
//            situacao = "Recuperação";
//        } else {
//            situacao = "Reprovado";
//        }
//    }
//}
//
//class Avaliacao {
//    private String nome;
//    private double pontuacaoMaxima;
//
//    Avaliacao(String nome, double pontuacaoMaxima) {
//        this.nome = nome;
//        this.pontuacaoMaxima = pontuacaoMaxima;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public double getPontuacaoMaxima() {
//        return pontuacaoMaxima;
//    }
//
//    public void setPontuacaoMaxima(double pontuacaoMaxima) {
//        this.pontuacaoMaxima = pontuacaoMaxima;
//    }
//}
//
//class SistemaNotas {
//    private ArrayList<Aluno> alunos = new ArrayList<>();
//    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
//    private HashMap<String, HashMap<String, Double>> notas = new HashMap<>();
//    private Scanner input = new Scanner(System.in);
//
//    SistemaNotas() {
//        inicializarAlunos();
//    }
//
//    private void inicializarAlunos() {
//        alunos.add(new Aluno("0101", "Ana Beatriz Costa"));
//        alunos.add(new Aluno("0102", "João Vitor Monteiro Cardoso"));
//        alunos.add(new Aluno("0103", "Bruno Gomes Ferreira"));
//        alunos.add(new Aluno("0104", "Carla Dias Almeida"));
//        alunos.add(new Aluno("0105", "Daniel Martins Pereira"));
//        alunos.add(new Aluno("0106", "Eduarda Lima Rocha"));
//        alunos.add(new Aluno("0107", "Felipe Azevedo Barbosa"));
//        alunos.add(new Aluno("0108", "Gabriela Castro Souza"));
//        alunos.add(new Aluno("0109", "Heitor Nogueira Pinto"));
//        alunos.add(new Aluno("0110", "Isabela Ribeiro Campos"));
//    }
//
//    public void executar() {
//        int opcao;
//        do {
//            System.out.println("Sistema de Notas ");
//            System.out.println("1. Definir Avaliações");
//            System.out.println("2. Lançar Notas");
//            System.out.println("3. Gerar Boletim");
//            System.out.println("4. Sair");
//            System.out.print("Escolha uma opção: ");
//            opcao = lerInt();
//
//            switch (opcao) {
//                case 1:
//                    definirAvaliacoes();
//                    break;
//                case 2:
//                    lancarNotas();
//                    break;
//                case 3:
//                    gerarBoletim();
//                    break;
//                case 4:
//                    System.out.println("Saindo do sistema...");
//                    break;
//                default:
//                    System.out.println("Opção inválida! Tente novamente.");
//            }
//        } while (opcao != 4);
//    }
//
//    private void definirAvaliacoes() {
//        avaliacoes.clear();
//        double total = 0;
//        int qtd;
//
//        System.out.print("Quantas avaliações deseja cadastrar? ");
//        qtd = lerIntPositivo();
//
//        for (int i = 0; i < qtd; i++) {
//            System.out.print("Nome da avaliação #" + (i + 1) + ": ");
//            String nome = input.nextLine();
//
//            double pontos;
//            do {
//                System.out.print("Pontuação máxima da avaliação '" + nome + "': ");
//                pontos = lerDouble();
//                if (pontos < 0) System.out.println("Não pode ser negativo!");
//                else if (total + pontos > 100) System.out.println("Total ultrapassa 100. Ajuste o valor.");
//            } while (pontos < 0 || total + pontos > 100);
//
//            avaliacoes.add(new Avaliacao(nome, pontos));
//            total += pontos;
//        }
//
//        if (total < 100) {
//            System.out.println("Atenção: total das avaliações menor que 100 (" + total + ").");
//        }
//
//        System.out.println("Avaliações cadastradas com sucesso!");
//    }
//
//    private void lancarNotas() {
//        if (avaliacoes.isEmpty()) {
//            System.out.println("Defina as avaliações antes de lançar notas.");
//            return;
//        }
//
//        for (Aluno aluno : alunos) {
//            HashMap<String, Double> notasAluno = new HashMap<>();
//            System.out.println("\nAluno: " + aluno.getNome());
//
//            for (Avaliacao av : avaliacoes) {
//                double nota;
//                do {
//                    System.out.print("Nota para '" + av.getNome() + "' (0-" + av.getPontuacaoMaxima() + "): ");
//                    nota = lerDouble();
//                    if (nota < 0 || nota > av.getPontuacaoMaxima())
//                        System.out.println("Nota inválida. Tente novamente.");
//                } while (nota < 0 || nota > av.getPontuacaoMaxima());
//
//                notasAluno.put(av.getNome(), nota);
//            }
//
//            notas.put(aluno.getCodigo(), notasAluno);
//        }
//
//        System.out.println("Notas lançadas com sucesso!");
//    }
//
//    private void gerarBoletim() {
//        if (notas.isEmpty()) {
//            System.out.println("Nenhuma nota registrada. Lance as notas primeiro.");
//            return;
//        }
//
//        System.out.println("\n=== Boletim ===");
//        System.out.printf("%-6s %-25s %-10s %-12s%n", "Código", "Aluno", "Nota Final", "Situação");
//
//        for (Aluno aluno : alunos) {
//            HashMap<String, Double> notasAluno = notas.get(aluno.getCodigo());
//            double soma = 0;
//
//            for (Avaliacao av : avaliacoes) {
//                double nota = notasAluno.getOrDefault(av.getNome(), 0.0);
//                soma += nota;
//            }
//
//            aluno.setNotaFinal(soma);
//            System.out.printf("%-6s %-25s %-10.2f %-12s%n",
//                    aluno.getCodigo(),
//                    aluno.getNome(),
//                    aluno.getNotaFinal(),
//                    aluno.getSituacao());
//        }
//    }
//
//    private int lerInt() {
//        while (true) {
//            try {
//                return Integer.parseInt(input.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.print("Entrada inválida! Digite um número inteiro: ");
//            }
//        }
//    }
//
//    private int lerIntPositivo() {
//        int valor;
//        do {
//            valor = lerInt();
//            if (valor <= 0) System.out.print("Número deve ser positivo: ");
//        } while (valor <= 0);
//        return valor;
//    }
//
//    private double lerDouble() {
//        while (true) {
//            try {
//                return Double.parseDouble(input.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.print("Entrada inválida! Digite um número válido: ");
//            }
//        }
//    }
//}
//        SistemaNotas sistema = new SistemaNotas();
//        sistema.executar();
        
//        // TODO code application logic here
//    }
//}