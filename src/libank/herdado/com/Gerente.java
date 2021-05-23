package libank.herdado.com;

public class Gerente extends Funcionario {  //Herdando os atraibutos da classe funcionário

    private int senha;     //necessário somente o atributo pertencente ao gerente, que não se aplica ao funcionário

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica (int senha){
        if(this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do Gerente");
        return super.getBonificacao() + super.getSalario();
    }

}
