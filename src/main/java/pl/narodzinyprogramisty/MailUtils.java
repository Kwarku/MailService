package pl.narodzinyprogramisty;

public class MailUtils {
    private static String from = "totest124578@gmail.com";
    private static String to = "totest124578@gmail.com";
    private static String subs = "Test mail";
    private static String mess = "Hello from Apache mail";


    public static MailObject createTempMail(){
        return new MailObject(from, to, subs, mess);
    }
}
