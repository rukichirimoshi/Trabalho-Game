package model;

import java.util.Observable;

public class Jogador extends Observable {

    private MapaDoJogo mapa;

    private String nome;
    private int vida;

    public Jogador(MapaDoJogo mapa, String nome) {
        this.mapa = mapa;
        this.nome = nome;
        this.vida = 100;
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
        setChanged();
        notifyObservers();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        String s = "[Jogador] Nome: " + this.getNome() + "(" + this.getVida() + "/100)";
        return s;
    }
}
