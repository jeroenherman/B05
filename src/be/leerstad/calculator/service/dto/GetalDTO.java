package be.leerstad.calculator.service.dto;

public class GetalDTO {

private String getal;
	
	public String getGetal() {
		return getal;
	}
	
	public void setGetal(String getal) {
		this.getal = getal;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(getal);
		return sb.toString();
	}
}
