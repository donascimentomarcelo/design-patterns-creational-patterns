package br.com.cod3r.factory.apple.enums;

public enum IPhoneGeneration {

    X("X"),
    ELEVEN("11");

    private final String value;

    IPhoneGeneration(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
