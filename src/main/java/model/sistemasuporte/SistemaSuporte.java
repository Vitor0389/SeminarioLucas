package model.sistemasuporte;


public class SistemaSuporte {
    public static void main() {
        // Configuração da cadeia de suporte
        SuporteHandler basico = new SuporteBasico();
        SuporteHandler avancado = new SuporteAvancado();
        SuporteHandler especializado = new SuporteEspecializado();

        basico.setProximo(avancado);
        avancado.setProximo(especializado);

        // Teste das requisições
        System.out.println("Requisição: Resetar Senha");
        basico.processarRequisicao("resetar senha");

        System.out.println("\nRequisição: Configuração de Rede");
        basico.processarRequisicao("configuração de rede");

        System.out.println("\nRequisição: Falha de Hardware");
        basico.processarRequisicao("falha de hardware");

        System.out.println("\nRequisição: Problema Desconhecido");
        basico.processarRequisicao("problema desconhecido");
    }
}
