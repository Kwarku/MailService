package pl.narodzinyprogramisty;

import java.util.LinkedList;

public class EmailBox extends LinkedList<MailObject> {

    private static LinkedList<MailObject> emailList = new LinkedList<>();

    public boolean addMail(MailObject mailObject) {
        if (mailObject != null) {
            emailList.add(mailObject);
            return true;
        }
        return false;
    }

    public MailObject getMail() {
        return emailList.pollFirst();

    }

    public LinkedList<MailObject> getEmailList() {
        return emailList;
    }
}
