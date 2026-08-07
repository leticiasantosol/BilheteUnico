package BilheteUnico;

public class BilheteEstudante extends BilheteUnico{
    public BilheteEstudante (String codigoDoBilhete, Usuario usuarioInformacoes) {
        super(codigoDoBilhete, usuarioInformacoes);
    }

    private int cotas;
}
