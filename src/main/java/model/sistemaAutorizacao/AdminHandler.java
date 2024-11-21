package model.sistemaAutorizacao;

class AdminHandler extends AutorizacaoHandler {
    @Override
    public boolean autorizar(String usuario, String acao) {
        if (usuario.equals("admin")) {
            System.out.println("Usuário autorizado como admin.");
            return true;
        } else if (getProximo() != null) { // Usa o getter para acessar o próximo handler
            return getProximo().autorizar(usuario, acao);
        }
        return false;
    }
}
