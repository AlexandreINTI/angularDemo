package com.adaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class Utilisateur implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String prenom;
	private String nom;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="Utilisateur_role",
		joinColumns= {@JoinColumn(name="id_Utilisateur",referencedColumnName="id")},
			inverseJoinColumns={@JoinColumn(name="id_role",referencedColumnName="id",table="role")})
	private List<Role> listrole=new ArrayList<Role>();
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(Long id, String prenom, String nom) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}

	public Utilisateur(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}

	public Utilisateur(Long id, String prenom, String nom, List<Role> listrole) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.listrole = listrole;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Role> getListrole() {
		return listrole;
	}

	public void setListrole(List<Role> listrole) {
		this.listrole = listrole;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	

}
