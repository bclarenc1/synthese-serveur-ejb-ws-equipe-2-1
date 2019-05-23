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
	
	public IdaoRemote getDao() {
		return dao;
	}

	public void setDao(IdaoRemote dao) {
		this.dao = dao;
	}

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.addProduit(p);

	}

	@Override
	public void removeProduit(long idProduit) {
		// TODO Auto-generated method stub
		dao.removeProduit(idProduit);

	}

	@Override
	public Produit getProduit(long idProduit) {
		// TODO Auto-generated method stub
		return dao.getProduit(idProduit);
	}

	@Override
	public Produit editProduit(Produit p) {
		// TODO Auto-generated method stub
		return dao.editProduit(p);
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return dao.getAllProduits();
		}

	@Override
	public void addMagasin(Magasin m) {
		// TODO Auto-generated method stub
dao.addMagasin(m);
	}

	@Override
	public void removeMagasin(long idMagasin) {
		// TODO Auto-generated method stub
		dao.removeMagasin(idMagasin);

	}

	@Override
	public Magasin getMagasin(long idMagasin) {
		// TODO Auto-generated method stub
		return dao.getMagasin(idMagasin);
	}  

	@Override
	public Magasin editMagasin(Magasin m) {
		// TODO Auto-generated method stub
		return dao.editMagasin(m);
	}

	@Override
	public List<Magasin> getAllMagasins() {
		// TODO Auto-generated method stub
		return dao.getAllMagasins();
	}

		
}
