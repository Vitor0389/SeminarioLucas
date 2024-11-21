package model.sistemasuporte;

import model.sistemasuporte.SuporteHandler;

class SuporteBasico extends SuporteHandler {
    @Override
    public void processarRequisicao(String problema) {
        if (problema.equalsIgnoreCase("resetar senha")) {
            System.out.println("Suporte Básico: Resolvido o problema de 'resetar senha'.");
        } else if (getProximo() != null) {
            getProximo().processarRequisicao(problema); // Encaminha ao próximo nível
        } else {
            System.out.println("Problema não resolvido. Encaminhar para escalonamento.");
        }
    }
}
