package com.example.demo.entity;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Gardepharmacie {
	
	public GardepharmacieKey getId() {
		return id;
	}

	public void setId(GardepharmacieKey id) {
		this.id = id;
	}

	public Garde getGarde() {
		return garde;
	}

	public void setGarde(Garde garde) {
		this.garde = garde;
	}

	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}

	@EmbeddedId
	private GardepharmacieKey id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "garde", insertable=false, updatable=false)
	private Garde garde;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "pharmacie", insertable=false, updatable=false)
	private Pharmacie pharmacie;

	private Date datefin;
	
	public Date getdatefin() {
		return datefin;
	}

	public void setDatedatefin(Date datefin) {
		this.datefin = datefin;
	}

	public Gardepharmacie() {
		super();
	}
	
	

}
