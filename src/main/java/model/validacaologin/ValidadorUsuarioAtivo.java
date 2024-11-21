package model.validacaologin;

// Handler 1: Verifica se o usuário está ativo
public class ValidadorUsuarioAtivo extends Validador {
    @Override
    public boolean processar(String usuario, String senha) {
        if (!usuario.equals("ativoUser")) {
            System.out.println("Usuário inativo.");
            return false;
        }
        return true;
    }
}



