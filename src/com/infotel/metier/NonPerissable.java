package com.infotel.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("NPERISSABLE")
public class NonPerissable extends Produit {
	
	private static final long serialVersionUID = 1L;
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
