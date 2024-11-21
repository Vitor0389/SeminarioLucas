package model.sistemaAutorizacao;


public class SistemaAutorizacao {

    // MÉTODO SEM CoR
    public boolean autorizar(String usuario, String acao) {
        if (usuario.equals("admin")) {
            System.out.println("Usuário autorizado como admin.");
            return true;
        } else if (acao.equals("visualizar") && usuario.equals("usuarioComum")) {
            System.out.println("Usuário autorizado para visualizar.");
            return true;
        } else {
            System.out.println("Usuário não autorizado.");
            return false;
        }
    }

    // MÉTODO COM CoR
    public static void main() {
        // Configura a cadeia de autorização
        AutorizacaoHandler adminHandler = new AdminHandler();
        AutorizacaoHandler usuarioComumHandler = new UsuarioComumHandler();

        adminHandler.setProximo(usuarioComumHandler);

        // Testa a cadeia
        adminHandler.autorizar("usuarioComum", "visualizar"); // Saída: Usuário autorizado para visualizar.
        adminHandler.autorizar("admin", "editar");            // Saída: Usuário autorizado como admin.
        adminHandler.autorizar("invalido", "editar");         // Saída: (nenhuma autorização)
    }


}

