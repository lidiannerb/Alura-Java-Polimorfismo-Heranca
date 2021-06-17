package libank.herdado.com;

public class SistemaInterno {

    private int senha = 2222; //o gerente deve digitar essa senha para poder "entrar no sistema interno"

    public void autentica (Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
    }

}
