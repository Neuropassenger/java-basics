/**
 * Created by turge on 007 07.10.16.
 */
public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage)
            return mail;

        if (((MailPackage) mail).getContent().getContent().contains("weapon") ||
                ((MailPackage) mail).getContent().getContent().contains("banned substance")) {
            try {
                throw new IllegalPackageException("bad package!");
            } catch (IllegalPackageException e) {
                System.out.println(e.getMessage());
            }
        }

        if (((MailPackage) mail).getContent().getContent().contains("stones"))
            try {
                throw new StolenPackageException("stolen package!");
            } catch (StolenPackageException e) {
                System.out.println(e.getMessage());
            }

        return mail;
    }
}
