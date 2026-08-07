package BilheteUnico;

public class BilheteUnico {
    private String codigo;
    private Usuario usuario;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BilheteUnico (String codigoDoBilhete, Usuario usuarioInformacoes) {
        this.codigo = codigoDoBilhete;
        this.usuario = usuarioInformacoes;
    }

    public abstract void  pagarPassagem ();

    public abstract void  recarregarBilhete (double valor);

}
