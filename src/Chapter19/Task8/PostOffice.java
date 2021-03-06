package Chapter19.Task8;

/*Chapter Enumerated, Exercise 8
// Modify PostOffice.java so it has the ability to forward mail.*/

public class PostOffice {
    enum MailHandler {
        GENERAL_DELIVERY {
            boolean handle(Mail m) {
                switch(m.generalDelivery) {
                    case YES:
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default: return false;
                }
            }
        },
        MACHINE_SCAN {
            boolean handle(Mail m) {
                switch(m.scannability) {
                    case UNSCANNABLE: return false;
                    default:
                        switch(m.forwardAddress) {
                            case YES:
                                System.out.println("Forwarding " + m + " automatically");
                                return true;
                            default:
                                switch(m.address) {
                                    case INCORRECT: return false;
                                    default:
                                        System.out.println("Delivering " + m + " automatically");
                                        return true;
                                }
                        }


                }
            }
        },
        FORWARDING {
            boolean handle(Mail m) {
                switch(m.forwardAddress) {
                    case YES:
                        System.out.println("Forwarding " + m);
                        return true;
                    default: return false;

                }
            }
        },
        VISUAL_INSPECTION {
            boolean handle(Mail m) {
                switch(m.readability) {
                    case ILLEGIBLE: return false;
                    default:
                        switch(m.address) {
                            case INCORRECT: return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER {
            boolean handle(Mail m) {
                switch(m.returnAddress) {
                    case MISSING: return false;
                    default:
                        System.out.println("Return " + m + " to sender");
                        return true;
                }
            }
        };
        abstract boolean handle(Mail m);
    }
    static void handle(Mail m) {
        for(MailHandler handler : MailHandler.values())
            if(handler.handle(m)) return;
        System.out.println(m + " is a dead letter");
    }
    public static void main(String[] args) {
        for(Mail mail : Mail.generator(20)) {
            System.out.println(mail.details());
            handle(mail);
            System.out.println("*****");
        }
    }
}
