package libank.herdado.com;

public class Cliente implements Autenticavel{

    private AutenticacaoUtil autenticador;

    //com o costrutor abaixo estamos delegando a chamada do método para a classe AutenticacaoUtil
    public Cliente(){
        this.autenticador = new AutenticacaoUtil();
    }
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
