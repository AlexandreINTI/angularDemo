package com.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
