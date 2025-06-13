package VIEW;

public class JogoDaVelha {
    //instancia de objeto
    private Tabuleiro tabuleiro = new Tabuleiro();
    //criando o método fazerJogada
    public boolean fazerJogada(int linha, int coluna, char simbolo) {
        return tabuleiro.marcar(linha, coluna, simbolo);
    }
    //criando o método verificarVencedor
    public boolean verificarVencedor(char simbolo) {
        char[][] m = tabuleiro.getMatriz();

        for (int i = 0; i < 3; i++) {
            if ((m[i][0] == simbolo && m[i][1] == simbolo && m[i][2] == simbolo) ||
                (m[0][i] == simbolo && m[1][i] == simbolo && m[2][i] == simbolo)) {
                return true;
            }
        }

        return (m[0][0] == simbolo && m[1][1] == simbolo && m[2][2] == simbolo) ||
               (m[0][2] == simbolo && m[1][1] == simbolo && m[2][0] == simbolo);
    }
    //criando o método tabuleiroCompleto
    public boolean tabuleiroCompleto() {
        return tabuleiro.cheio();
    }
    //criando o método reiniciarJogo
    public void reiniciarJogo() {
        tabuleiro.limpar();
    }
}
