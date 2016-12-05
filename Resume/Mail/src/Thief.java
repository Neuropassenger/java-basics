/**
 * Created by turge on 007 07.10.16.
 */
public class Thief implements MailService {
    private int stolenValue;
    private final int minimalPrice;

    Thief(int minimalPrice) {
        this.minimalPrice = minimalPrice;
        stolenValue = 0;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage)
            return mail;
        if (((MailPackage) mail).getContent().getPrice() < minimalPrice)
            return mail;

        MailPackage fakeMail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " +
                ((MailPackage) mail).getContent().getContent(), 0));
        stolenValue += ((MailPackage) mail).getContent().getPrice();

        return fakeMail;
    }
}
