
package VIEW;
public class TesteConexao {
    public static void main(String[] args) {
        if (ConexaoBanco.conectar() != null) {
            System.out.println("Conexão OK!");
        } else {
            System.out.println("Falha na conexão.");
        }
    }
}
