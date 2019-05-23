package com.infotel.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.infotel.metier.Magasin;
import com.infotel.metier.Produit;

@Singleton
@LocalBean
public class DaoImpl implements IdaoRemote {

	@PersistenceContext(unitName="EJBWS_PU")
	EntityManager em;
	
	public DaoImpl() {}

	@Override
	public void addProduit(Produit p) {
		em.persist(p);
	}

	@Override
	public void removeProduit(long idProduit) {
		em.createQuery("delete from Produit p where p.id = :x").setParameter("x", idProduit).executeUpdate();
	}

	@Override
	public Produit getProduit(long idProduit) {
		return em.find(Produit.class, idProduit);
	}

	@Override
	public Produit editProduit(Produit p) {
		em.merge(p);
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> getAllProduits() {
		return em.createQuery("select p from Produit p").getResultList();
	}

	@Override
	public void addMagasin(Magasin m) {
		em.persist(m);
	}

	@Override
	public void removeMagasin(long idMagasin) {
		em.createQuery("delete from Magasin m where m.id = :x").setParameter("x", idMagasin).executeUpdate();
	}
	

	@Override
	public Magasin getMagasin(long idMagasin) {
		return em.find(Magasin.class, idMagasin);
	}

	@Override
	public Magasin editMagasin(Magasin m) {
		em.merge(m);
		return m;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Magasin> getAllMagasins() {
		// TODO Auto-generated method stub
		return em.createQuery("select m from Magasin m").getResultList();
	}



}

