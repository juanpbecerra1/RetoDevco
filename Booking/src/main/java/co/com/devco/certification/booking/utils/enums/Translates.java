package co.com.devco.certification.booking.utils.enums;

public enum Translates {
    CRUISE("Crucero"),
    YOUR_ACCOUNT("Tu cuenta"),
    SORRY_IT_IS_NOT_POSSIBLE_TO_MAKE_RESERVATIONS_FOR_MORE_THAN_30_NIGHTS("Lo sentimos, no es posible realizar reservas"),
    ACCOMMODATIONS_FOUND("alojamientos encontrados"),
    PAYMENT("pago"),
    VIEW_DEAL("Ver oferta");

    private final String translate;

    Translates(String translate) {
        this.translate = translate;
    }

    public String toSpanish() {
        return translate;
    }
}
