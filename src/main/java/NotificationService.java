public class NotificationService {
    public void sendNotification(INotification notification, String message) {
        notification.send(message);
    }
}
