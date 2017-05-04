package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class MapaDoJogo implements Observer {

    private static MapaDoJogo instance;

    private ArrayList<Jogador> jogadores;
    private ArrayList<Oponente> oponentes;
    private Dificuldade dificuldade;

    private boolean gameOver = false;

    private MapaDoJogo(int qtdJogadores, Dificuldade d) {
        this.dificuldade = d;
        this.jogadores = new ArrayList<Jogador>();
        this.oponentes = new ArrayList<Oponente>();

        this.iniciaJogadores(qtdJogadores);
    }

    public static MapaDoJogo getInstance(int qtdJogadores, Dificuldade d) {
        if (instance == null) {
            instance = new MapaDoJogo(qtdJogadores, d);
        }
        return instance;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    private void iniciaJogadores(int qtdJogadores) {
        for (int i = 1; i <= qtdJogadores; i++) {
            Jogador j = new Jogador(this, "Jogador" + i);
            jogadores.add(j);
            j.addObserver(this);
        }
        int qtdOponentes = 0;

        switch (this.dificuldade) {
            case FACIL:
                qtdOponentes = (int) ((qtdJogadores / 3) * 2);
                if (qtdOponentes == 0) {
                    qtdOponentes = 1;
                }
                break;
            case MEDIO:
                qtdOponentes = qtdJogadores;
                break;
            case DIFICIL:
                qtdOponentes = qtdJogadores * 2;
                break;

            default:
                break;
        }

        for (int i = 1; i <= qtdOponentes; i++) {
            Oponente o = new Oponente(this, "Oponente" + i, ComportamentoNormal.getInstance());
            oponentes.add(o);
            o.addObserver(this);
        }
    }

    public boolean rodada() {
        //Verifica se algum dos lados não está com todos mortos
        boolean jogadoresVivos = false;
        boolean oponentesVivos = false;
        for (Jogador j : jogadores) {
            if (j.isVivo()) {
                jogadoresVivos = true;
                break;
            }
        }
        for (Oponente o : oponentes) {
            if (o.isVivo()) {
                oponentesVivos = true;
                break;
            }
        }

        if (jogadoresVivos && oponentesVivos) {
            //Turno dos Jogadores
            for (Jogador j : jogadores) {
                if (!j.isVivo()) {
                    break; //Sem direito a nada
                }
                if (j.getAcaoAtual() == Acao.ATACAR) {
                    int dano = 0;
                    if (j.isArmado()) {
                        dano = 10;
                    } else {
                        dano = 3;
                    }

                    int qtdOponentes = this.oponentes.size();
                    int indexOponente = (int) (Math.random() * (qtdOponentes));
                    Oponente o = oponentes.get(indexOponente);
                    while (!o.isVivo()) {
                        qtdOponentes = this.oponentes.size();
                        indexOponente = (int) (Math.random() * (qtdOponentes));
                        o = oponentes.get(indexOponente);
                    }
                    o.serAtacado(dano);
                }
            }

            //Turno dos Oponentes
            for (Oponente o : oponentes) {
                if (!o.isVivo()) {
                    break;
                }
                if (o.getAcaoAtual() == Acao.ATACAR) {
                    int dano = 0;
                    if (o.isArmado()) {
                        dano = 10;
                    } else {
                        dano = 3;
                    }

                    int qtdJogadores = this.jogadores.size();
                    int indexJogador = (int) (Math.random() * (qtdJogadores));
                    Jogador j = jogadores.get(indexJogador);
                    while (!j.isVivo()) {
                        qtdJogadores = this.jogadores.size();
                        indexJogador = (int) (Math.random() * (qtdJogadores));
                        j = jogadores.get(indexJogador);
                    }
                    j.serAtacado(dano);
                }
            }
            return true;
        }
        if (jogadoresVivos) {
            this.gameOver = false;
        } else {
            this.gameOver = true; //Jogadores perderam = game over 
        }
        return false;
    }

    public void alteraJogador(int indexJogador, Acao acao, boolean armado) {
        Jogador j = jogadores.get(indexJogador);
        j.setAcaoAtual(acao);
        j.setArmado(armado);
    }

    @Override
    public void update(Observable jogador, Object arg1) {
        Jogador jObservable = (Jogador) jogador; //Jogador pode ser Jogador ou Oponente
        System.out.println(jObservable.toString());

        for (Jogador j : jogadores) {
            j.notificaVidaMudou(jObservable);
        }
    }

}
