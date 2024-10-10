package br.edu.unisep.model;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String motor, String placa, String farol, String retrovisor, int numeroDePortas) {
        super(motor, placa, farol, retrovisor);
        this.numeroDePortas = numeroDePortas; // Atribuindo o valor corretamente
    }

    @Override
    public void exibirDetalhes() {
        exibirInformacoesBasicas();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}