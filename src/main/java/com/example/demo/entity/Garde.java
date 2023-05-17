package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Garde {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@JsonIgnore
	@OneToMany(mappedBy = "garde")
	private  List<Gardepharmacie> gardepharmacie;
	


	public Garde() {
		super();
	}


	public List<Gardepharmacie> getP() {
		return gardepharmacie;
	}


	public void setP(List<Gardepharmacie> gardepharmacie) {
		this.gardepharmacie = gardepharmacie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
