package model.validacaologin;

public abstract class Validador {
    private Validador proximo;

    public void setProximo(Validador proximo) {
        this.proximo = proximo;
    }

    public void validar(String usuario, String senha) {
        if (!processar(usuario, senha) && proximo != null) {
            proximo.validar(usuario, senha);
        }
    }

    public abstract boolean processar(String usuario, String senha);
}

