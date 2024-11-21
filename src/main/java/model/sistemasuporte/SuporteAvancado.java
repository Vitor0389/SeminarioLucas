package model.sistemasuporte;

import model.sistemasuporte.SuporteHandler;

class SuporteAvancado extends SuporteHandler {
    @Override
    public void processarRequisicao(String problema) {
        if (problema.equalsIgnoreCase("configuração de rede")) {
            System.out.println("Suporte Avançado: Resolvido o problema de 'configuração de rede'.");
        } else if (getProximo() != null) {
            getProximo().processarRequisicao(problema); // Encaminha ao próximo nível
        } else {
            System.out.println("Problema não resolvido. Encaminhar para escalonamento.");
        }
    }
}


