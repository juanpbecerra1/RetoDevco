package co.com.devco.certification.booking.utils.enums;

public enum Translate {
    CRUISE("Crucero");

    private final String translate;

    Translate(String translate) {
        this.translate = translate;
    }

    public String toSpanish() {
        return translate;
    }
}
