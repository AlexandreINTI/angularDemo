package com.adaming.service;

import java.util.List;

import com.adaming.entity.Utilisateur;

public interface IUtilisateurService {
	
	public List<Utilisateur> findAll();
	public Utilisateur save(Utilisateur utilisateur);
	public void delete(Long id);
	public Utilisateur findOne(Long id);
	

}
