package model.validacaologin;

public class ValidadorLogin {

    public boolean validar(String usuario, String senha) {
        // Verifica se o usuário está ativo
        if (!isAtivo(usuario)) {
            System.out.println("Usuário inativo.");
            return false;
        }

        // Verifica se a senha está correta
        if (!isSenhaCorreta(senha)) {
            System.out.println("Senha incorreta.");
            return false;
        }

        System.out.println("Login válido.");
        return true;
    }

    private boolean isAtivo(String usuario) {
        // Simula verificação de status do usuário
        return usuario.equals("ativoUser");
    }

    private boolean isSenhaCorreta(String senha) {
        // Simula verificação de senha
        return senha.equals("123456");
    }
}

