package model;

public class ComportamentoDefensivo implements ComportamentoDoOponente {

    @Override
    public Acao getComportamento(Oponente o) {
        return Acao.DEFENDER;
    }

}
