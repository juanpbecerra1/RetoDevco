package co.com.devco.certification.booking.exceptions;

@SuppressWarnings("serial")
public class SearchToursAttractionsException extends AssertionError {
    public SearchToursAttractionsException(String message, Throwable cause) {
        super(message, cause);
    }
}
