package BilheteUnico;

public class Usuario {
    private String nome, email, cpf, telefone;

    public Usuario (String nomeDaPessoa,String emailDaPessoa, String cpfDaPessoa, String telefoneDaPessoa) {
        this.nome = nomeDaPessoa;
        this.email = emailDaPessoa;
        this.cpf = cpfDaPessoa;
        this.telefone = telefoneDaPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
