package model;


public class ComportamentoAgressivo implements ComportamentoDoOponente {

    @Override
    public Acao getComportamento(Oponente o) {
        return Acao.ATACAR;
    }

}
