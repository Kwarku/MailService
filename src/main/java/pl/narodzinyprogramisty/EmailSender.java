package pl.narodzinyprogramisty;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import pl.narodzinyprogramisty.settings.HostSetting;

public class EmailSender {
    private Email email;


    private void configure(String login,String password) {
        email =  new SimpleEmail();
        email.setHostName(HostSetting.HOST);
        email.setSmtpPort(HostSetting.PORT);
        email.setAuthenticator(new DefaultAuthenticator(login, password));
        email.setSSLOnConnect(HostSetting.SSL_FLAG);

    }

    public void sandMail(String login, String password,MailObject mailObject) {
        try {
            configure(login, password);
            email.setFrom(mailObject.getFromAddress());
            email.setSubject(mailObject.getSubject());
            email.setMsg(mailObject.getMessage());
            email.addTo(mailObject.getToAddress());
            email.send();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
