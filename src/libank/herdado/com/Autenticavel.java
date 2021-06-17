package libank.herdado.com;
//Interfaces não deve ter nada concreto.
//Ao declarar essa Interface, estamos definindo eum contrato autentícavel
//quem assina esse contrato precisa implementar os métodos setSenha e autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
