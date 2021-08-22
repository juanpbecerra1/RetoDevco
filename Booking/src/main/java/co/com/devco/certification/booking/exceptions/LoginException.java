package co.com.devco.certification.booking.exceptions;

@SuppressWarnings("serial")
public class LoginException extends AssertionError {
    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
