package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class MapaDoJogo implements Observer {

    private static MapaDoJogo instance;

    private ArrayList<Jogador> jogadores;
    private ArrayList<Oponente> oponentes;
    private EnumDificuldade dificuldade;
    
    private MapaDoJogo(EnumDificuldade d) {
        this.dificuldade = d;
        this.jogadores = new ArrayList<Jogador>();
        this.oponentes = new ArrayList<Oponente>();
    }

    public static MapaDoJogo getInstance(EnumDificuldade d) {
        if (instance == null) {
            instance = new MapaDoJogo(d);
        }
        return instance;
    }

    @Override
    public void update(Observable jogador, Object arg1) {
        Jogador jObservable = (Jogador) jogador; //Jogador pode ser Jogador ou Oponente
        System.out.println(jObservable.toString());
    }

}
