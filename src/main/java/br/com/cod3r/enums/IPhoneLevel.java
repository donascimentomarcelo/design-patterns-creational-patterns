package br.com.cod3r.enums;

public enum IPhoneLevel {
    STANDARD("standard"),
    HIGHEND("highEnd");

    private final String value;

    IPhoneLevel(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
