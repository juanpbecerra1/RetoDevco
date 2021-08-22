package co.com.devco.certification.booking.utils.enums;

public enum Moths {
    JANUARY("Enero"),
    FEBRUARY("Febrero"),
    MARCH("Marzo"),
    APRIL("Abril"),
    MAY("Mayo"),
    JUNE("Junio"),
    JULY("Julio"),
    AUGUST("Agosto"),
    SEPTEMBER("Septiembre"),
    OCTOBER("Octubre"),
    NOVEMBER("Noviembre"),
    DECEMBER("Diciembre");

    private final String moth;

    Moths(String moth) {
        this.moth = moth;
    }

    public String moth() {
        return moth;
    }
}
