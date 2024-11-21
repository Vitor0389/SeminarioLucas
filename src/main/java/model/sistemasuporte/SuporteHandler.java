package model.sistemasuporte;

abstract class SuporteHandler {
    private SuporteHandler proximo; // Próximo nível na cadeia

    public void setProximo(SuporteHandler proximo) {
        this.proximo = proximo;
    }

    public SuporteHandler getProximo() {
        return proximo;
    }

    // Método abstrato para processar a requisição
    public abstract void processarRequisicao(String problema);
}
