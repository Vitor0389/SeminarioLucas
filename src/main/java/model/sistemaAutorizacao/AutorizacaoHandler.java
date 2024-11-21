package model.sistemaAutorizacao;
public abstract class AutorizacaoHandler {
    private AutorizacaoHandler proximo;

    // Método para configurar o próximo handler
    public void setProximo(AutorizacaoHandler proximo) {
        this.proximo = proximo;
    }

    // Método para obter o próximo handler
    public AutorizacaoHandler getProximo() {
        return proximo;
    }

    // Método abstrato que será implementado pelos handlers concretos
    public abstract boolean autorizar(String usuario, String acao);
}
