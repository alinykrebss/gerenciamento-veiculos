package br.edu.unisep.model;

public class Caminhao extends Veiculo {
    private String tipoDeCarga;

    public Caminhao(String motor, String placa, String farol, String retrovisor, String tipoDeCarga) {
        super(motor, placa, farol, retrovisor);
        this.tipoDeCarga = tipoDeCarga; // Atribuindo o valor corretamente
    }

    @Override
    public void exibirDetalhes() {
        exibirInformacoesBasicas();
        System.out.println("Tipo de carga: " + tipoDeCarga);
    }
}