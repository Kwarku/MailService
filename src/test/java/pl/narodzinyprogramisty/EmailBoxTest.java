package pl.narodzinyprogramisty;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailBoxTest {
    private EmailBox emailBox;
    private MailObject mailObject;

    @Before
    public void start() {
        emailBox = new EmailBox();
        mailObject = MailUtils.createTempMail();
        emailBox.getEmailList().clear();

    }


    @Test
    public void addMailTest() {
        assertEquals(0, emailBox.getEmailList().size());

        for (int i = 0; i < 15; i++) {
            assertTrue(emailBox.addMail(mailObject));
            assertEquals(i + 1, emailBox.getEmailList().size());
        }
    }

    @Test
    public void getMail() {
        assertEquals(0, emailBox.getEmailList().size());

        for (int i = 0; i < 15; i++) {
            emailBox.addMail(mailObject);
            assertEquals(i + 1, emailBox.getEmailList().size());


        }
        for (int i = 0; i < 15; i++) {
            MailObject mailObject = emailBox.getMail();
            assertNotNull(mailObject);
            assertEquals(15 - i - 1, emailBox.getEmailList().size());

        }

    }

}
