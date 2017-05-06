package model;

public class ComportamentoAgressivo implements ComportamentoDoOponente {

    private static ComportamentoDoOponente instance;

    public static ComportamentoDoOponente getInstance() {
        if (instance == null) {
            instance = new ComportamentoNormal();
        }
        return instance;
    }

    @Override
    public Acao getComportamento(Oponente o) {
        return Acao.ATACAR;
    }

    public String getNomeComportamento() {
        return "Agressivo";
    }
}
