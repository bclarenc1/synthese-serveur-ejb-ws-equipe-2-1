package com.infotel.metier;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("PERISSABLE")
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
