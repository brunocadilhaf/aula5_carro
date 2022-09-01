package pacote3;

public class Carro {
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    // public Carro() { }

    // public Carro(String placa, int numChassi) {
    //     setPlaca(placa);
    //     this.numChassi = numChassi;
    // }

    public Carro(Motorista motorista) {
        this.motorista = motorista;
        this.motorista.setVeiculoAtual(this);
    }

    public Carro(String placa, int numChassi, Motorista motorista) {
        this(motorista);
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    void acelerar() {
        velocidadeAtual++;
    }

    void acelerar(int limite) {
        for (int i = velocidadeAtual; i < limite; i++) {
            acelerar();
        }
    }

    public boolean frear() {
        return false;
    }

    public String getPlaca() {
        if ("ERRO!!!".equals(this.letrasPlaca)) {
            return this.letrasPlaca;
        } else {
            return this.letrasPlaca + this.numerosPlaca;
        }
    }

    public void setPlaca(String placa) {
        if (placa != null && placa.length() == 7 &&
            placa.matches("[A-Z]{3}\\d{4}")) {
            this.letrasPlaca = placa.substring(0, 3);
            this.numerosPlaca = Integer.parseInt(placa.substring(3));
        } else {
            this.letrasPlaca = "ERRO!!!";
        }
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
