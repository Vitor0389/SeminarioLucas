package model.sistemaAutorizacao;

import model.sistemaAutorizacao.AutorizacaoHandler;

class UsuarioComumHandler extends AutorizacaoHandler {
    @Override
    public boolean autorizar(String usuario, String acao) {
        if (acao.equals("visualizar") && usuario.equals("usuarioComum")) {
            System.out.println("Usuário autorizado para visualizar.");
            return true;
        } else if (getProximo() != null) { // Usa o getter para acessar o próximo handler
            return getProximo().autorizar(usuario, acao);
        }
        return false;
    }
}

