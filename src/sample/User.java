package sample;

public class User {
    private String name;
    private String lastName;
    private String login;
    private String password;
    private String location;
    private String gender;

    public User() {
    }

    public User(String name, String lastName, String login, String password, String location, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.location = location;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
