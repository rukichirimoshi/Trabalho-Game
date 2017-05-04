package model;

public class ComportamentoNormal implements ComportamentoDoOponente {

    public static ComportamentoDoOponente getInstance() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Acao getComportamento(Oponente o) {
        if (o.isArmado()) {
            return Acao.ATACAR;
        } else {
            return Acao.DEFENDER;
        }
    }

}
