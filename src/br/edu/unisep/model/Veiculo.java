package br.edu.unisep.model;

public abstract class Veiculo {
    protected String motor;
    protected String placa;
    protected String farol;
    protected String retrovisor;

    public Veiculo(String motor, String placa, String farol, String retrovisor) {
        this.motor = motor;
        this.placa = placa;
        this.farol = farol;
        this.retrovisor = retrovisor;
    }

    public abstract void exibirDetalhes();

    public void exibirInformacoesBasicas() {
        System.out.println("Motor: " + motor + ", Placa: " + placa + ", Farol: " + farol + ", Retrovisor: " + retrovisor);
    }
}