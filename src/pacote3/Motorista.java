package pacote3;

public class Motorista {
    private String nome;
    private int matricula;
    private Carro veiculoAtual;

    public Motorista(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void acelerar(int limite) {
        this.veiculoAtual.acelerar(limite);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }
}
