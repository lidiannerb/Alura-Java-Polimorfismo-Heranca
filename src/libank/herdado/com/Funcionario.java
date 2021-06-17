package libank.herdado.com;
// tornar a classe abstrata impossibita que ela seja instanciada (tornar objeto), mas as subclasses continuam herdando os atributos e métodos dela
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //um método abstrato não tem implementação, precisa ser implementado nas subclasses para poder ser usado por elas
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
