package com.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entity.Utilisateur;
import com.adaming.repository.UtilisateurRepository;

@Service
public class UtilisateurService implements IUtilisateurService{

	@Autowired
	UtilisateurRepository utilRepository;
	
	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return utilRepository.findAll();
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilRepository.save(utilisateur);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		utilRepository.delete(id);
	}

	@Override
	public Utilisateur findOne(Long id) {
		// TODO Auto-generated method stub
		return utilRepository.findOne(id);
	}
	
	

}
