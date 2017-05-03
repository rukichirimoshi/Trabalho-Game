package model;


public class Oponente extends Jogador {

    public Oponente(MapaDoJogo mapa, String nome) {
        super(mapa, nome);
    }
    
    @Override
    public String toString() {
        String s = "[Oponente] Nome: " + this.getNome() + "(" + this.getVida() + "/100)";
        return s;
    }
}
