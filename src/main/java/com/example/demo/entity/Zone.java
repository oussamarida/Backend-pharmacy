package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Zone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 @JsonProperty("nom")
	private String nom;
	
	
	@ManyToOne
    @JoinColumn(name="Ville_id", nullable=false)
	 @JsonProperty("ville")
	private Ville ville;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "zone")
	private List<Pharmacie> pharmacie;
	
	
	
	
	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<Pharmacie> getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(List<Pharmacie> pharmacie) {
		this.pharmacie = pharmacie;
	}

	public Zone() {
		super();
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
