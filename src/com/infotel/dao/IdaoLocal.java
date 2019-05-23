package com.infotel.dao;

import java.util.List;

import javax.ejb.Local;

import com.infotel.metier.Magasin;
import com.infotel.metier.Produit;

@Local
public interface IdaoLocal {

	public void addProduit(Produit p);
	public void removeProduit(long idProduit);
	public Produit getProduit(long idProduit);
	public Produit editProduit(Produit p);
	public List<Produit> getAllProduits();
	
	public void addMagasin(Magasin m);
	public void removeMagasin(long idMagasin);
	public Magasin getMagasin(long idMagasin);
	public Magasin editMagasin(Magasin m);
	public List<Magasin> getAllMagasins();
}
