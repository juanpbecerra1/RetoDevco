package co.com.devco.certification.booking.exceptions;

@SuppressWarnings("serial")
public class SearchFlightsException extends AssertionError {
    public SearchFlightsException(String message, Throwable cause) {
        super(message, cause);
    }
}
