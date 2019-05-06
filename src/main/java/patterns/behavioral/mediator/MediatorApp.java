package patterns.behavioral.mediator;

/**
 * Mediator is a middle-point between client and server or user and admin.
 * */
public class MediatorApp {
    private static final String ADMIN_MESSAGE = "Admin was added to chat...";
    private static final String USER_MESSAGE = "Hi, I'm a new user!";

    public static void main(String[] args) {
        WorkChat workChat = new WorkChat();

        User admin = new Admin(workChat);
        User user1 = new SimpleUser(workChat);
        User user2 = new SimpleUser(workChat);

        workChat.setAdmin(admin);
        workChat.addUser(user1);
        workChat.addUser(user2);

        admin.sendMessage(ADMIN_MESSAGE);
        user1.sendMessage(USER_MESSAGE);
    }
}
