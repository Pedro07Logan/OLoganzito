package DAO;
import VIEW.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PartidaDAO {

    public void salvarPartida(int idJogador1, int idJogador2, Integer vencedorId) {
        String sql = "INSERT INTO partidas (jogador1_id, jogador2_id, vencedor_id) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idJogador1);
            stmt.setInt(2, idJogador2);

            if (vencedorId != null) {
                stmt.setInt(3, vencedorId);
            } else {
                stmt.setNull(3, java.sql.Types.INTEGER);
            }

            stmt.executeUpdate();
            System.out.println("✅ Partida registrada com sucesso!");

        } catch (SQLException e) {
            System.err.println("❌ Erro ao salvar partida: " + e.getMessage());
        }
    }
}