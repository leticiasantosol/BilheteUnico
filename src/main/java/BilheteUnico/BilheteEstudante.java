package BilheteUnico;

public class BilheteEstudante extends BilheteUnico{
    public BilheteEstudante (String codigoDoBilhete, Usuario usuarioInformacoes) {
        super(codigoDoBilhete, usuarioInformacoes);
    }

    private int cotas;

    @Override
    public void pagarPassagem() {
        if (cotas > 0) {
            cotas --;
        }else {
            System.out.println("Cotas indisponível.");
        }

    }
}
