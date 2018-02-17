package pl.narodzinyprogramisty;

public class App {
    public static void main(String[] args) {
        EmailBox emailBox = new EmailBox();
        EmailService emailService = new EmailService();


        emailBox.addMail(MailUtils.createTempMail());
        emailBox.addMail(MailUtils.createTempMail());
        emailBox.addMail(MailUtils.createTempMail());

        emailService.startService();
        emailService.run();
        emailService.stopService();
    }
}
