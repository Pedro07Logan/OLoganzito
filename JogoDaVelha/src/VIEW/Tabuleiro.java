package VIEW;

public class Tabuleiro {
    //criação da matriz
    char[][] matriz = new char[3][3];
    //construtor
    public Tabuleiro() {
        limpar();
    }
    //criando método limpar
    public void limpar() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matriz[i][j] = ' ';
    }
    //criando método estaVazio
    public boolean estaVazio(int linha, int coluna) {
        return matriz[linha][coluna] == ' ';
    }
    //criando método marcar
    public boolean marcar(int linha, int coluna, char simbolo) {
        if (estaVazio(linha, coluna)) {
            matriz[linha][coluna] = simbolo;
            return true;
        }
        return false;
    }
    //criando método cheio
    public boolean cheio() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matriz[i][j] == ' ')
                    return false;
        return true;
    }
    //criando método getMatriz
    public char[][] getMatriz() {
        return matriz;
    }
}
