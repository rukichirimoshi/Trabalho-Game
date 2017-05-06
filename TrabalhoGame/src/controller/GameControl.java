package controller;

import model.Acao;
import model.Dificuldade;

public class GameControl {

    public static void main(String[] args) {
        MapaDoJogo m = MapaDoJogo.getInstance(3, Dificuldade.MEDIO);
        m.alteraJogador(0, Acao.ATACAR, true);
        m.alteraJogador(1, Acao.DEFENDER, false);
        m.alteraJogador(2, Acao.ATACAR, true);

        m.alteraOponente(0, Acao.ATACAR, false);
        m.alteraOponente(1, Acao.ATACAR, true);
        m.alteraOponente(2, Acao.DEFENDER, false);

        int indexRodada = 1;
        while (m.rodada(indexRodada)) {
            System.out.println("==============================================================");
            m.printVidas();
            indexRodada++;
        }
        m.printVidas();

        if (m.isGameOver()) {
            System.out.println("GAME OVER!");
        } else {
            System.out.println("VOCÊ VENCEU!");
        }
    }
}
