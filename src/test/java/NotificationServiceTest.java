import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class NotificationServiceTest {

    @Test
    void testSendEmailNotification() {
        NotificationService service = new NotificationService();

        // Capturar la salida de System.out
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        service.sendNotification(new EmailNotification(), "Hello via Email!");

        assertTrue(baos.toString().contains("Sending Email: Hello via Email!"));

        // Restaurar el System.out original
        System.setOut(originalOut);
    }

    @Test
    void testSendSMSNotification() {
        NotificationService service = new NotificationService();

        // Capturar la salida de System.out
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        service.sendNotification(new SMSNotification(), "Hello via SMS!");

        assertTrue(baos.toString().contains("Sending SMS: Hello via SMS!"));

        // Restaurar el System.out original
        System.setOut(originalOut);
    }

    @Test
    void testSendPushNotification() {
        NotificationService service = new NotificationService();

        // Capturar la salida de System.out
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        service.sendNotification(new PushNotification(), "Hello via Push Notification!");

        assertTrue(baos.toString().contains("Sending Push Notification: Hello via Push Notification!"));

        // Restaurar el System.out original
        System.setOut(originalOut);
    }
}
