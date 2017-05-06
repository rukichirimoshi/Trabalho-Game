package model;

import controller.MapaDoJogo;

public class Oponente extends Jogador {

    private ComportamentoDoOponente comportamento;

    public Oponente(MapaDoJogo mapa, String nome, ComportamentoDoOponente c) {
        super(mapa, nome);
        this.comportamento = c;
    }

    public ComportamentoDoOponente getComportamento() {
        return comportamento;
    }

    public void setComportamento(ComportamentoDoOponente comportamento) {
        this.comportamento = comportamento;
        this.setAcaoAtual(comportamento.getComportamento(this));
    }
}
