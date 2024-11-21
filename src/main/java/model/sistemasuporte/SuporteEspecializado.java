package model.sistemasuporte;

import model.sistemasuporte.SuporteHandler;

class SuporteEspecializado extends SuporteHandler {
    @Override
    public void processarRequisicao(String problema) {
        if (problema.equalsIgnoreCase("falha de hardware")) {
            System.out.println("Suporte Especializado: Resolvido o problema de 'falha de hardware'.");
        } else {
            System.out.println("Problema não resolvido. Encaminhar para escalonamento.");
        }
    }
}


