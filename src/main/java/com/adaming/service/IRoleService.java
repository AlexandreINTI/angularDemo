package com.adaming.service;

import java.util.List;

import com.adaming.entity.Role;

public interface IRoleService {
	
	public List<Role> findAll();
	public Role findOne(Long id);
	public Role save(Role role);
	public void delete(Long id);

}
