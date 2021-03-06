package model;

import java.util.Observable;

import controller.MapaDoJogo;

public class Jogador extends Observable {

    private MapaDoJogo mapa;

    private String nome;
    private int vida;
    private boolean armado;
    private Acao acaoAtual;

    public Jogador(MapaDoJogo mapa, String nome) {
        this.mapa = mapa;
        this.nome = nome;
        this.vida = 100;
        this.setArmado(false);
        this.setAcaoAtual(Acao.DEFENDER);
    }

    public MapaDoJogo getMapa() {
        return mapa;
    }

    public void setMapa(MapaDoJogo mapa) {
        this.mapa = mapa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
        setChanged();
        notifyObservers();
    }

    public boolean isArmado() {
        return armado;
    }

    public void setArmado(boolean armado) {
        this.armado = armado;
    }

    public Acao getAcaoAtual() {
        return acaoAtual;
    }

    public void setAcaoAtual(Acao acaoAtual) {
        this.acaoAtual = acaoAtual;
    }

    public void notificaVidaMudou(Jogador jObservable) {
        String s = "";
        if (jObservable.isVivo()) {
            s += "Eu, " + this.getNome() + " fui notificado que a vida do " + jObservable.getNome() + " mudou para " + jObservable.getVida() + ".";
        } else {
            s += "Eu, " + this.getNome() + " fui notificado que " + jObservable.getNome() + " foi morto.";
        }
        System.out.println(s);
    }

    public void serAtacado(int dano) {
        if (this.getAcaoAtual() == Acao.DEFENDER) {
            dano = dano - 3;
            if (dano != 0) {
                this.setVida(this.getVida() - (dano - 3));
            }
        } else {
            this.setVida(this.getVida() - dano);
        }
    }

    public boolean isVivo() {
        return (this.getVida() > 0);
    }

    @Override
    public String toString() {
        String s = "[" + this.getNome() + "] ";
        s += this.isVivo() ? (+this.getVida() + "/100") : "MORTO!";
        return s;
    }
}
