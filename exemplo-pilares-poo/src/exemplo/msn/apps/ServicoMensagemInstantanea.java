package exemplo.msn.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //mais um metodo que todos os filhos deverão implementar
    public abstract void salvarHistoricoMensagem();

    //somente os filhos conhecem este metodo
    protected void validarConectadoInternet() {
        System.out.println("Testando conexão");
    }
}
