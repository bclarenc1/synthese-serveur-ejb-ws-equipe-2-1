package com.infotel.metier;

public class NonPerissable extends Produit {

	private String modeDemploi;

	public String getModeDemploi() {
		return modeDemploi;
	}

	public void setModeDemploi(String modeDemploi) {
		this.modeDemploi = modeDemploi;
	}

	@Override
	public String toString() {
		return "NonPerissable [modeDemploi=" + modeDemploi + "]";
	}
	
	
}
