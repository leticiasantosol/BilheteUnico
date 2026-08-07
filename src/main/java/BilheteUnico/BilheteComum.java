package BilheteUnico;

public class BilheteComum extends BilheteUnico {
    public BilheteComum (String codigoDoBilhete, Usuario usuarioInformacoes) {
        super(codigoDoBilhete, usuarioInformacoes);
    }

    private double saldo;
    private static final double valorPassagem = 5.0;

    @Override
    public void pagarPassagem() {
        if (saldo >= valorPassagem ) {
            saldo -= valorPassagem;
        }else {
            System.out.println("Saldo indisponível.");
        }
    }

    @Override
    public void recarregarBilhete(double valor) {
        if (valor > 0) {
            saldo += valor;
        }else {
            System.out.println("Valor de recarga inválido.");
        }
    }
}
