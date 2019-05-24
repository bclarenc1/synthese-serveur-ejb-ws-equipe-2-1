package com.infotel.metier;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PERISSABLE")
public class Perissable extends Produit {
	
	private static final long serialVersionUID = 1L;
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
