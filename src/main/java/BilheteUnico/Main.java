package BilheteUnico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("carla", "carla@gmail.com", "11111111111", "234539879");
        BilheteComum b1 = new BilheteComum("4433", u1);

        Usuario u2 = new Usuario("João Pedro", "joao@gmail.com", "22222222222", "11976543210");
        BilheteComum b2 = new BilheteComum("BC002", u2);

        Usuario u3 = new Usuario("Mariana Lima", "mariana@gmail.com", "33333333333", "11965432109");
        BilheteEstudante b3 = new BilheteEstudante("BE001", u3);

        Usuario u4 = new Usuario("Lucas Martins", "lucas@gmail.com", "44444444444", "11954321098");
        BilheteEstudante b4 = new BilheteEstudante("BE002", u4);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);

        List<BilheteUnico> bilhetes = new ArrayList<>();
        bilhetes.add(b1);
        bilhetes.add(b2);
        bilhetes.add(b3);
        bilhetes.add(b4);
    }
}