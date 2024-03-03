
public class User {
    private int userId;
    private String username;
    private String password;
    private String email;

    public User(int userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public boolean verifyUser() {
        return this.username != null && this.password != null;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void register(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void updateProfile(String newUsername, String newPassword, String newEmail) {
        this.username = newUsername;
        this.password = newPassword;
        this.email = newEmail;
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
