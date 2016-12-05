import java.util.logging.Logger;

/**
 * Created by turge on 007 07.10.16.
 */
public class Mail {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static void main(String[] args) {
        Mail launch = new Mail();
    }

    public Mail() {

        // setting prerequisites
        Logger spyLog = Logger.getLogger(Mail.class.getName());

        int minimalPrice = 500;
        int forbiddenStuffPrice = 400;

        Spy jamesBond = new Spy(spyLog);
        Thief robinHood = new Thief(minimalPrice);
        Inspector gadget = new Inspector();

        MailService[] woof = {jamesBond, robinHood, gadget};

        UntrustworthyMailWorker derpyHooves = new UntrustworthyMailWorker(woof);

        // launching process
        Sendable[] stuff = {
                new MailMessage("homo", "human", "lernu esperanton, hundino!"),
                new MailMessage(AUSTIN_POWERS, "fbi", "i need a new pink car"),
                new MailMessage("fbi", AUSTIN_POWERS, "'k, sure"),
                new MailPackage("dog", "wolf", new Package("some food", 500)),
                new MailPackage("clinton", "trump", new Package("money for imitation of freedom of choice", 100000000)),
                new MailPackage("me", "you", new Package(WEAPONS, forbiddenStuffPrice))
        };

        for (Sendable sendable : stuff) {
            System.out.println("sending from " + sendable.getFrom() + " to " + sendable.getTo() + " " + sendable.toString());

            if (sendable instanceof MailPackage) {
                System.out.println(((MailPackage) sendable).getContent().getContent());
            }

            System.out.println(robinHood.getStolenValue());
            derpyHooves.processMail(sendable);
        }
    }
}