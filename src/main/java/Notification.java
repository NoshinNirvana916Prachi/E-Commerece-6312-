public class Notification {
    private String id;
    private String content;

    // Constructor
    public Notification(String id, String content) {
        this.id = id;
        this.content = content;
    }

    // Method to create a new notification (factory method pattern)
    public static Notification createNotification(String content) {
        String id = generateUniqueId();
        return new Notification(id, content);
    }

    // Method to generate a unique ID for the notification
    private static String generateUniqueId() {
        return "NOTIF-" + System.currentTimeMillis();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
