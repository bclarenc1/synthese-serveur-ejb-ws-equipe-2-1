package com.infotel.wsrest;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
 
import javax.jws.WebParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.infotel.dao.DaoImpl;
import com.infotel.metier.Magasin;
import com.infotel.metier.NonPerissable;
import com.infotel.metier.Perissable;
import com.infotel.metier.Produit;


@Stateless
@Path(value="/produits")
public class ProduitRestService {


	@EJB
	private DaoImpl dao;
	   
	//	pas de getter/setter (pas besoin, methodes exposees)

	@GET
	@Path("addPerissable/{nomProduit}/{stock}/{prix}")
	@Produces(MediaType.APPLICATION_JSON)
	public void addPerissable(
			@PathParam(value="nomProduit") String nomProduit,
			@PathParam(value="stock") int stock,
			@PathParam(value="prix") double prix) {
		
		Perissable pe = new Perissable();
		pe.setNomProduit(nomProduit);
		pe.setStock(stock);
		pe.setPrix(prix);
		pe.setDateLimiteUtilisation(new Date());
		
		dao.addProduit(pe);
	}
	
	@GET
	@Path("addNonPerissable/{nomProduit}/{stock}/{prix}/{modeDemploi}")
	@Produces(MediaType.APPLICATION_JSON)
	public void addNperissable(
			@PathParam(value="nomProduit") String nomProduit,
			@PathParam(value="stock") int stock,
			@PathParam(value="prix") double prix,
			@PathParam(value="modeDemploi") String modeDemploi) {
		
		NonPerissable np = new NonPerissable ();
		np.setNomProduit(nomProduit);
		np.setStock(stock);
		np.setPrix(prix);
		np.setModeDemploi(modeDemploi);
		
		dao.addProduit(np);
	}
	
	@GET
	@Path("removeProduit/{idProduit}")
	@Produces(MediaType.APPLICATION_JSON)
	public void supprimerProduit(@PathParam(value="idProduit") long idProduit) {
		dao.removeProduit(idProduit);
	}

	@GET
	@Path("getProduit/{idProduit}")
	@Produces(MediaType.APPLICATION_JSON)
	public Produit getProduit(@PathParam(value="idProduit") long idProduit) {
		return dao.getProduit(idProduit);
	}
	@GET
	@Path("editPerissable/{nomProduit}/{stock}/{prix}/{dlc}")
	@Produces(MediaType.APPLICATION_JSON)
	public Perissable editPerissable(
			@PathParam(value="nomProduit") String nomProduit,
			@PathParam(value="stock") int stock,
			@PathParam(value="prix") double prix ) {
		
		Perissable pe = new Perissable();
		pe.setNomProduit(nomProduit);
		pe.setStock(stock);
		pe.setPrix(prix);
		pe.setDateLimiteUtilisation(new Date());
		
		dao.editProduit(pe);
		return pe;
	}
	
	@GET
	@Path("editNonPerissable/{nomProduit}/{stock}/{prix}/{modeDemploi}")
	@Produces(MediaType.APPLICATION_JSON)
	public NonPerissable editNperissable(
			@PathParam(value="nomProduit") String nomProduit,
			@PathParam(value="stock") int stock,
			@PathParam(value="prix") double prix,
			@PathParam(value="modeDemploi") String modeDemploi) {
		
		NonPerissable np = new NonPerissable ();
		np.setNomProduit(nomProduit);
		np.setStock(stock);
		np.setPrix(prix);
		np.setModeDemploi(modeDemploi);
		
		dao.editProduit(np);
	return np;
	} 
	 
	@GET
	@Path("listProduits")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produit> getAllProduits() {
		return dao.getAllProduits();
	}
	
	//------------------------------------------------------------------------
	@GET
	@Path("addMagasin/{nomMagasin}/{codeMagasin}/{prixLocal}")
	@Produces(MediaType.APPLICATION_JSON)
	public void addMagasin(
			@PathParam(value="nomMagasin") String nomMagasin,
			@PathParam(value="codeMagasin") int codeMagasin,
			@PathParam(value="prixLocal") double prixLocal) {
		
		Magasin m = new Magasin();
		dao.addMagasin(m);
	}
	
	@GET
	@Path("removeMagasin/{idMagasin}")
	@Produces(MediaType.APPLICATION_JSON)
	public void removeMagasin(@WebParam(name="idMagasin") long idMagasin) {
		dao.removeMagasin(idMagasin);
	}

	@GET
	@Path("getMagasin/{idMagasin}")
	@Produces(MediaType.APPLICATION_JSON)
	public Magasin getMagasin(@WebParam(name="idMagasin") long idMagasin) {
		return dao.getMagasin(idMagasin);
	}
	
	@GET
	@Path("editMagasin/{nomMagasin}/{codeMagasin}/{prixLocal}")
	@Produces(MediaType.APPLICATION_JSON)
	public Magasin editMagasin(
			@PathParam(value="idMagasin") long idMagasin,
			@PathParam(value="nomMagasin") String nomMagasin,
			@PathParam(value="codeMagasin") int codeMagasin,
			@PathParam(value="prixLocal") double prixLocal) {
	
		Magasin m = dao.getMagasin(idMagasin);
		dao.editMagasin(m);
		
		return m;
	}
	
	@GET
	@Path("listMagasins")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Magasin> getAllMagasins() {
		return dao.getAllMagasins();
	}
	
	// -----------------------------------------------------------------------
	
}
