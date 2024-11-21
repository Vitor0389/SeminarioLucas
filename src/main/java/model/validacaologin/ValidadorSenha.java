package model.validacaologin;

// Handler 2: Verifica a senha
public class ValidadorSenha extends Validador {
    @Override
    public boolean processar(String usuario, String senha) {
        if (!senha.equals("123456")) {
            System.out.println("Senha incorreta.");
            return false;
        }
        return true;
    }
}