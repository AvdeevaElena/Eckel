package Chapter19.Task8.Task9;

/*Chapter Enumerated, Exercise 8
// Modify PostOffice.java so it has the ability to forward mail.*/

public class PostOffice {
    public static void main(String[] args) {
        for (Mail mail : Mail.generator(10)) {
            System.out.println(mail.details());
            handle(mail);
            System.out.println("*****");
        }
    }

    private static void handle(Mail m) {
        MailHandler.GENERAL_DELIVERY.handle(m);
    }

    enum MailHandler {
        GENERAL_DELIVERY {
            boolean handle(Mail m) {
                switch (m.generalDelivery) {
                    case YES:
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default:
                        MACHINE_SCAN.handle(m);
                        return false;
                }
            }
        },
        MACHINE_SCAN {
            boolean handle(Mail m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        VISUAL_INSPECTION.handle(m);
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                VISUAL_INSPECTION.handle(m);
                                return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        },
        VISUAL_INSPECTION {
            boolean handle(Mail m) {
                switch (m.readability) {
                    case ILLEGIBLE:
                        RETURN_TO_SENDER.handle(m);
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                RETURN_TO_SENDER.handle(m);
                                return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER {
            boolean handle(Mail m) {
                switch (m.returnAddress) {
                    case MISSING:
                        System.out.println(m + " is a dead letter");
                        return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        };

        abstract boolean handle(Mail m);
    }
}
