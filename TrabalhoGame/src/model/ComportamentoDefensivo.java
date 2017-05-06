package model;

public class ComportamentoDefensivo implements ComportamentoDoOponente {

    private static ComportamentoDoOponente instance;

    public static ComportamentoDoOponente getInstance() {
        if (instance == null) {
            instance = new ComportamentoNormal();
        }
        return instance;
    }

    @Override
    public Acao getComportamento(Oponente o) {
        return Acao.DEFENDER;
    }

    public String getNomeComportamento() {
        return "Defensivo";
    }
}
