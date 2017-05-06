package model;

public class ComportamentoNormal implements ComportamentoDoOponente {

    private static ComportamentoDoOponente instance;

    public static ComportamentoDoOponente getInstance() {
        if (instance == null) {
            instance = new ComportamentoNormal();
        }
        return instance;
    }

    @Override
    public Acao getComportamento(Oponente o) {
        if (o.isArmado()) {
            return Acao.ATACAR;
        } else {
            return Acao.DEFENDER;
        }
    }

    public String getNomeComportamento() {
        return "Normal";
    }
}
