package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entity.Utilisateur;
import com.adaming.service.IUtilisateurService;

@CrossOrigin("*")
@RestController
public class UtilisateurController {
	
	@Autowired
	IUtilisateurService utilserv;
	
	@RequestMapping(value="users",method=RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return utilserv.findAll();
	}
	
	@RequestMapping(value="users/{id}", method=RequestMethod.GET)
	public Utilisateur findOne(@PathVariable("id")Long id) {
		return utilserv.findOne(id);
	}
	
	@RequestMapping(value="users",method=RequestMethod.POST)
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		return utilserv.save(utilisateur);
	}
	
	@RequestMapping(value="users/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id) {
		utilserv.delete(id);
	}
	
	@RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
	public Utilisateur updateUtilisateur(@PathVariable("id") Long id,@RequestBody Utilisateur utilisateur) {
		Utilisateur currentUser = utilserv.findOne(id);
		currentUser.setNom(utilisateur.getNom());
		currentUser.setPrenom(utilisateur.getPrenom());
		return utilserv.save(currentUser);
	}

}
