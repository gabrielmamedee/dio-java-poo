package exemplo.msn;

import exemplo.msn.apps.FacebookMensager;
import exemplo.msn.apps.MSNMessenger;
import exemplo.msn.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMensager fcb = new FacebookMensager();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
