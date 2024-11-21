package org.example;


import model.sistemaAutorizacao.SistemaAutorizacao;
import model.sistemasuporte.SistemaSuporte;
import model.validacaologin.Validador;
import model.validacaologin.ValidadorSenha;
import model.validacaologin.ValidadorUsuarioAtivo;
import model.validacaologin.ValidadorLogin;
public class Main {
    public void main() {
        validadorLoginSemCor();
        validadorLoginComCor();
        sistemaAutorizacaoSemCor();
        sistemaAutorizacaoComCor();
        sistemaSuporte();
    }

    private static void validadorLoginSemCor() {
        ValidadorLogin validador = new ValidadorLogin();
        validador.validar("ativoUser", "123456");
    }

    private static void validadorLoginComCor() {
        Validador ativo = new ValidadorUsuarioAtivo();
        Validador senha = new ValidadorSenha();

        ativo.setProximo(senha);

        // Testa a validação
        ativo.validar("ativoUser", "123456");
    }

   private static void sistemaAutorizacaoSemCor(){
       SistemaAutorizacao sistema = new SistemaAutorizacao();
       sistema.autorizar("usuarioComum", "visualizar"); // Saída: Usuário autorizado para visualizar.
       sistema.autorizar("admin", "editar");           // Saída: Usuário autorizado como admin.
   }

   private static void sistemaAutorizacaoComCor(){
        SistemaAutorizacao.main();
   }

   private static void sistemaSuporte(){
       SistemaSuporte.main();
   }
}

