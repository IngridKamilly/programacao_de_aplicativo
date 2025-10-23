/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexao_banco_dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ingri
 */
public class Conexao_banco_dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String url = "jdbc:mysql://localhost:3306/alunos";
        String user = "root";
        String password = "2805";

        
        class Aluno {

    private int id;
    private String nome;

    public Aluno() {
    }

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
        
        class ConexaoDAO {

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/alunos";
        String user = "root";
        String password = "2805";

        return DriverManager.getConnection(url, user, password);
    }

    public void cadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos (nome) VALUES (?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.executeUpdate();
            System.out.println("Aluno cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
    }

    public List<Aluno> listarAlunos() {
        String sql = "SELECT * FROM alunos";
        List<Aluno> lista = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                lista.add(aluno);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
        }

        return lista;
    }

    public void atualizarAluno(Aluno aluno) {
        String sql = "UPDATE alunos SET nome = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getId());
            stmt.executeUpdate();
            System.out.println("Aluno atualizado com sucesso! ");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar aluno: " + e.getMessage());
        }
    }

    public void deletarAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Aluno deletado com sucesso! ");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar aluno: " + e.getMessage());
        }
    }
}       
        ConexaoDAO dao = new ConexaoDAO();

        while (true) {
            System.out.println("\n===== MENU ALUNOS =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Deletar aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = input.nextInt();
            input.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = input.nextLine();
                    Aluno novoAluno = new Aluno();
                    novoAluno.setNome(nome);
                    dao.cadastrarAluno(novoAluno);
                    break;

                case 2:
                    List<Aluno> alunos = dao.listarAlunos();
                    System.out.println("\n--- LISTA DE ALUNOS ---");
                    for (Aluno a : alunos) {
                        System.out.println(a.getId() + " - " + a.getNome());
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do aluno a atualizar: ");
                    int idAtualizar = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String novoNome = input.nextLine();
                    Aluno alunoAtualizar = new Aluno();
                    alunoAtualizar.setId(idAtualizar);
                    alunoAtualizar.setNome(novoNome);
                    dao.atualizarAluno(alunoAtualizar);
                    break;

                case 4:
                    System.out.print("Digite o ID do aluno a deletar: ");
                    int idDeletar = input.nextInt();
                    dao.deletarAluno(idDeletar);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Tente novamente. ");
            }
        }
    
        
        // TODO code application logic here
    }
    
}
