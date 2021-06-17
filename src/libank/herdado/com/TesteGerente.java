package libank.herdado.com;

import jdk.swing.interop.SwingInterOpUtils;

public class TesteGerente {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        Gerente g1 = new Gerente();
        g1.setNome("Carlos");
        g1.setCpf("222552522-90");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        System.out.println(g1.getBonificacao());

        g1.setSenha(222);
        boolean autenticou = g1.autentica(222);

        System.out.println("Senha autenticada? " + autenticou);

        // o retorno é falso porque a senha inicializa com 0 só funcionou depois que colocamos um set senha na classe gerente e setamos a senha acima

        //System.out.println(autenticou);

    }
}
