/**
 * Created by turge on 007 07.10.16.
 */
public class UntrustworthyMailWorker implements MailService {
    final MailService[] hands;
    private RealMailService post = new RealMailService();

    public UntrustworthyMailWorker(MailService[] hands) {
        this.hands = hands;
    }

    private MailService getRealMailService() {
        return post;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (int i = 0; i < hands.length; i++) {
            mail = hands[i].processMail(mail);
        }

        return getRealMailService().processMail(mail);
    }
}
