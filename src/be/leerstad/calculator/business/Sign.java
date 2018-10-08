package be.leerstad.calculator.business;

public enum Sign {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");
    private String value;
    Sign(String value) {
        this.value = value;
    }
}
