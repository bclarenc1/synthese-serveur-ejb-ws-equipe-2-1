package com.infotel.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("NPERISSABLE")
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
