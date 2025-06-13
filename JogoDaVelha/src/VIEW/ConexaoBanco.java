package VIEW;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static final String URL = "jdbc:mysql://localhost:3306/esquemateste"; // nome do seu banco
    private static final String USUARIO = "usuario123"; // seu usuário MySQL
    private static final String SENHA = "Projeto123"; // sua senha do MySQL

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar com o banco: " + e.getMessage());
            return null;
        }
    }
}
