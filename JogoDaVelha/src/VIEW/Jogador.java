package VIEW;

public class Jogador {
     String nome;
     char simbolo;
//construtor
    public Jogador(String nome, char simbolo) {
        //atributos do Jogador
        this.nome = nome;
        this.simbolo = simbolo;
    }
        //método acessor
    public String getNome() {
        return nome;
    }
        //método acessor
    public char getSimbolo() {
        return simbolo;
    }
}