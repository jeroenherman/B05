package be.leerstad.calculator.service.dto;

public class SignDTO {
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        String result = "null";
        switch (sign) {
            case "ADD": result = "+"; break;
            case "DIVIDE": result = "/"; break;
            case "MULTIPLY": result = "*"; break;
            case "SUBTRACT": result = "/"; break;
        }
        return result;
    }
}
