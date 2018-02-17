package pl.narodzinyprogramisty;

import pl.narodzinyprogramisty.settings.LogSettings;

public class EmailService {
    private EmailBox emailBox = new EmailBox();
    private EmailSender sender = new EmailSender();
    private boolean workingService = false;

    public void startService() {
        workingService = true;
    }

    public void stopService() {
        workingService = false;
    }

    public boolean run() {
        if (workingService) {
            for (MailObject mail : emailBox){
                sender.sandMail(LogSettings.userName, LogSettings.userPassword, mail);
            }
            return true;
        }
        return false;
    }
}
