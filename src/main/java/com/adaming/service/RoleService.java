package com.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entity.Role;
import com.adaming.repository.RoleRepository;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	RoleRepository rolerep;

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return rolerep.findAll();
	}

	@Override
	public Role findOne(Long id) {
		// TODO Auto-generated method stub
		return rolerep.findOne(id);
	}

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		return rolerep.save(role);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolerep.delete(id);
	}

}
