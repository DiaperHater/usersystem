package system.model;

/**
 * Created by Max on 16.07.2017.
 */
public class User {
    private String name;
    private String password;
    private int accessLevel;

    public User() {

    }

    public User(String name, String password, int accessLevel) {
        this.name = name;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
