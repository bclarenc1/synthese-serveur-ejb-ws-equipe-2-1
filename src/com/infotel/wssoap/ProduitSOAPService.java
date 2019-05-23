package com.infotel.wssoap;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.infotel.dao.DaoImpl;
import com.infotel.metier.Magasin;
import com.infotel.metier.NonPerissable;
import com.infotel.metier.Perissable;
import com.infotel.metier.Produit;

@Stateless
@WebService
public class ProduitSOAPService {
	
	@EJB
	private DaoImpl dao;  // pas Idao, car les WS ne supportent pas les interfaces
 
//	no getter/setter needed
  
	@WebMethod
	public void addPerissable(
			@WebParam(name="nomProduit") String nomProduit,
			@WebParam(name="stock") int stock,
			@WebParam(name="prix") double prix) {
		
		Date dateLimiteUtilisation = new Date();
		Perissable pe = new Perissable();
		pe.setNomProduit(nomProduit);
		pe.setStock(stock);
		pe.setPrix(prix);
		pe.setDateLimiteUtilisation(dateLimiteUtilisation);
		
		dao.addProduit(pe);
	}
	
	@WebMethod
	public void addNPerissable(
			@WebParam(name="nomProduit") String nomProduit,
			@WebParam(name="stock") int stock,
			@WebParam(name="prix") double prix,
			@WebParam(name="modeDemploi") String modeDemploi) {
		
		NonPerissable np = new NonPerissable();
		np.setNomProduit(nomProduit);
		np.setStock(stock);
		np.setPrix(prix);
		np.setModeDemploi(modeDemploi);
		
		dao.addProduit(np);
	}

	@WebMethod
	public void removeProduit(@WebParam(name="idProduit") long idProduit) {
		dao.removeProduit(idProduit);
	}

	@WebMethod
	public Produit getProduit(@WebParam(name="idProduit") long idProduit) {
		return dao.getProduit(idProduit);
	}

	@WebMethod
	public void editPerissable(
			@WebParam(name="idProduit") long idProduit,
			@WebParam(name="nomProduit") String nomProduit,
			@WebParam(name="stock") int stock,
			@WebParam(name="prix") double prix) {
		
		Date dateLimiteUtilisation = new Date();
		Perissable pe = (Perissable) dao.getProduit(idProduit);
		pe.setNomProduit(nomProduit);
		pe.setStock(stock);
		pe.setPrix(prix);
		pe.setDateLimiteUtilisation(dateLimiteUtilisation);
		
		dao.editProduit(pe);
	}

	@WebMethod
	public void editNPerissable(
			@WebParam(name="idProduit") long idProduit,
			@WebParam(name="nomProduit") String nomProduit,
			@WebParam(name="stock") int stock,
			@WebParam(name="prix") double prix,
			@WebParam(name="modeDemploi") String modeDemploi) {
		
		NonPerissable np = (NonPerissable) dao.getProduit(idProduit);
		np.setNomProduit(nomProduit);
		np.setStock(stock);
		np.setPrix(prix);
		np.setModeDemploi(modeDemploi);
		
		dao.editProduit(np);
	}

	@WebMethod
	public List<Produit> getAllProduits() {
		return dao.getAllProduits();
	}
	
	//------------------------------------------------------------------------
	
	@WebMethod
	public void addMagasin(
			@WebParam(name="nomMagasin") String nomMagasin,
			@WebParam(name="codeMagasin") int codeMagasin,
			@WebParam(name="prixLocal") double prixLocal) {
		
		Magasin m = new Magasin();
		dao.addMagasin(m);
	}
	
	@WebMethod
	public void removeMagasin(@WebParam(name="idMagasin") long idMagasin) {
		dao.removeMagasin(idMagasin);
	}

	@WebMethod
	public Magasin getMagasin(@WebParam(name="idMagasin") long idMagasin) {
		return dao.getMagasin(idMagasin);
	}
	
	@WebMethod
	public Magasin editMagasin(
			@WebParam(name="idMagasin") long idMagasin,
			@WebParam(name="nomMagasin") String nomMagasin,
			@WebParam(name="codeMagasin") int codeMagasin,
			@WebParam(name="prixLocal") double prixLocal) {
	
		Magasin m = dao.getMagasin(idMagasin);
		dao.editMagasin(m);
		
		return m;
	}
	
	@WebMethod
	public List<Magasin> getAllMagasins() {
		return dao.getAllMagasins();
	}
	
}