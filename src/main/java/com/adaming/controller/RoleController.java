package com.adaming.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entity.Role;
import com.adaming.service.IRoleService;

@CrossOrigin("*")
@RestController
public class RoleController {
	
	@Autowired
	IRoleService roleserve;
	
	@RequestMapping(value="roles",method=RequestMethod.GET)
	public List<Role> findAll(){
		return roleserve.findAll();
	}
	
	@RequestMapping(value="roles/{id}",method=RequestMethod.GET)
	public Role findOne(@PathVariable("id")Long id) {
		return roleserve.findOne(id);
	}
	
	@RequestMapping(value="roles",method=RequestMethod.POST)
	public Role save(@RequestBody Role role) {
		return roleserve.save(role);
	}
	
	@RequestMapping(value="roles/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id) {
		roleserve.delete(id);
	}
	
	public Role update(@PathVariable("id")Long id, @RequestBody Role role) {
		Role currentrole=roleserve.findOne(id);
		currentrole.setLibelle(role.getLibelle());
		return roleserve.save(currentrole);
	}

}
