package com.infotel.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.infotel.dao.IdaoRemote;
import com.infotel.metier.Magasin;
import com.infotel.metier.Produit;

@Stateless (name="ejbProMag")
public class ProMagEjbImpl implements IEjbLocal, IEjbRemote {

	@EJB
	private IdaoRemote dao;
	
	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeProduit(long idProduit) {
		// TODO Auto-generated method stub

	}

	@Override
	public Produit getProduit(long idProduit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit editProduit(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMagasin(Magasin m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMagasin(long idMagasin) {
		// TODO Auto-generated method stub

	}

	@Override
	public Magasin getMagasin(long idMagasin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Magasin editMagasin(Magasin m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Magasin> getAllMagasins() {
		// TODO Auto-generated method stub
		return null;
	}

}
