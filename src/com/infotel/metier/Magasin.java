package com.infotel.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Magasin implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idMagasin;
	private String nomMagasin;
	private int codeMagasin;
	private double prixLocal;
	
	@OneToMany
	@XmlTransient
	List<Produit>produits = new ArrayList<Produit>();
	
	public long getIdMagasin() {
		return idMagasin;
	}
	public void setIdMagasin(long idMagasin) {
		this.idMagasin = idMagasin;
	}
	public String getNomMagasin() {
		return nomMagasin;
	}
	public void setNomMagasin(String nomMagasin) {
		this.nomMagasin = nomMagasin;
	}
	public int getCodeMagasin() {
		return codeMagasin;
	}
	public void setCodeMagasin(int codeMagasin) {
		this.codeMagasin = codeMagasin;
	}
	public double getPrixLocal() {
		return prixLocal;
	}
	public void setPrixLocal(double prixLocal) {
		this.prixLocal = prixLocal;
	}
	
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	@Override
	public String toString() {
		return "Magasin [idMagasin=" + idMagasin + ", nomMagasin=" + nomMagasin + ", codeMagasin=" + codeMagasin
				+ ", prixLocal=" + prixLocal + "]";
	}
	
	
}
