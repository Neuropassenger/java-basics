import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by turge on 007 07.10.16.
 */
public class Spy implements MailService {
    public final Logger hole;

    Spy(Logger spylog) {
        this.hole = spylog;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage)
            return mail;

        if (mail.getFrom().contains("Austin Powers") ||
                mail.getTo().contains("Austin Powers"))
            hole.log(Level.WARNING, "Detected target mail correspondence: " +
                    "from {0} to {1} \"{2}\"", new Object[]
                    {mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
        else
            hole.log(Level.INFO, "Usual correspondence: from {0} to {1}",
            new Object[] {mail.getFrom(), mail.getTo()});

        return mail;
    }
}
