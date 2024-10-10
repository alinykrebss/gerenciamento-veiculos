package br.edu.unisep.model;

public class Moto extends Veiculo {
    private String tipoDeGuidao;

    public Moto(String motor, String placa, String farol, String retrovisor, String tipoDeGuidao) {
        super(motor, placa, farol, retrovisor);
        this.tipoDeGuidao = tipoDeGuidao; // Atribuindo o valor corretamente
    }

    @Override
    public void exibirDetalhes() {
        exibirInformacoesBasicas();
        System.out.println("Tipo de guidão: " + tipoDeGuidao);
    }
}