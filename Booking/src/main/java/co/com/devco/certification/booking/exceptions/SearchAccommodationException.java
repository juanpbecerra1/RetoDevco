package co.com.devco.certification.booking.exceptions;

@SuppressWarnings("serial")
public class SearchAccommodationException extends AssertionError {
    public SearchAccommodationException(String message, Throwable cause) {
        super(message, cause);
    }
}
