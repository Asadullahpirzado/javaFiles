public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String userMode;

    public User(int userId, String name, String email, String password, String userMode) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userMode = userMode;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserMode() {
        return userMode;
    }
}