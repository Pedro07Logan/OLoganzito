
package DAO;
import VIEW.ConexaoBanco;
import VIEW.Jogador;

import java.sql.*;

public class JogadorDAO {

    public int salvarJogador(String nome) {
        int idGerado = -1;
        String sql = "INSERT INTO jogadores (nome) VALUES (?)";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, nome);
            stmt.executeUpdate();
            System.out.println("Jogador Salvo!");

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                idGerado = rs.getInt(1);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar jogador: " + e.getMessage());
        }

        return idGerado;
    }


    public void salvarJogador(Jogador jogador1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
