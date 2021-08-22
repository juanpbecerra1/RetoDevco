package co.com.devco.certification.booking.models;

public class UserAccount {
    private String mail;
    private String password;

    public UserAccount(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }
}
