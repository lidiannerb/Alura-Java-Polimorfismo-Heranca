package libank.herdado.com;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario lidi = new Funcionario(); //objeto inicializado
        lidi.setNome("Lidianne");
        lidi.setCpf("225225225-25");
        lidi.setSalario(2600.00);

        System.out.println(lidi.getNome());
        System.out.println(lidi.getBonificacao());

    }
}
