package pl.narodzinyprogramisty;

public class MailObject {
    private String fromAddress;
    private String toAddress;
    private String subject;
    private String message;


    public MailObject(String fromAddress, String toAddress, String subject, String message) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.subject = subject;
        this.message = message;

    }



    public String getFromAddress() {
        return fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
