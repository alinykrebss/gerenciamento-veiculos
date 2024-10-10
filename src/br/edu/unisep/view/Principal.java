package br.edu.unisep.view;

import br.edu.unisep.model.Carro;
import br.edu.unisep.model.Moto;
import br.edu.unisep.model.Caminhao;

public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro("V8", "ABC-1234", "LED", "Simples", 4);
        Moto moto = new Moto("600cc", "XYZ-5678", "Halógeno", "Simples", "Esportivo");
        Caminhao caminhao = new Caminhao("Diesel", "DEF-9012", "Xênon", "Duplo", "Carga pesada");

        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();
    }
}