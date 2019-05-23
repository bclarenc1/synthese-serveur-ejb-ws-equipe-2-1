package com.infotel.metier;

import java.util.Date;

public class Perissable extends Produit {

	private Date dateLimiteUtilisation;

	public Date getDateLimiteUtilisation() {
		return dateLimiteUtilisation;
	}

	public void setDateLimiteUtilisation(Date dateLimiteUtilisation) {
		this.dateLimiteUtilisation = dateLimiteUtilisation;
	}

	@Override
	public String toString() {
		return "Perissable [dateLimiteUtilisation=" + dateLimiteUtilisation + "]";
	}

	
	
	
}
