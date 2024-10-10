package br.edu.unisep.model;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    // Método para adicionar veículos à frota
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    // Método para exibir os detalhes de todos os veículos (utilizando polimorfismo)
    public void exibirDetalhesFrota() {
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
        }
    }
}