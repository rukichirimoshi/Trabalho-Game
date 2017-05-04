package model;

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
    }

    public void executaComportamento() {

    }

    @Override
    public String toString() {
        String s = "[Oponente] Nome: " + this.getNome() + "(" + this.getVida() + "/100)";
        return s;
    }
}
