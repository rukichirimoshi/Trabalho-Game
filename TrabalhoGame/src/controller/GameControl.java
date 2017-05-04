package controller;

import model.Acao;
import model.Dificuldade;
import model.MapaDoJogo;

public class GameControl {

    public static void main(String[] args) {
        MapaDoJogo m = MapaDoJogo.getInstance(3, Dificuldade.FACIL);
        m.alteraJogador(0, Acao.ATACAR, true);

        while (m.rodada()) {
            //do nothing
        }

        if (m.isGameOver()) {
            System.out.println("GAME OVER!");
        } else {
            System.out.println("VOCÊ VENCEU!");
        }
    }
}
