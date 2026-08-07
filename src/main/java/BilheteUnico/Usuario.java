package BilheteUnico;

public class Usuario {
    private String nome, email, cpf, telefone;

    public Usuario (String nomeDaPessoa,String emailDaPessoa, String cpfDaPessoa, String telefoneDaPessoa) {
        this.nome = nomeDaPessoa;
        this.email = emailDaPessoa;
        this.cpf = cpfDaPessoa;
        this.telefone = telefoneDaPessoa;
    }
}
