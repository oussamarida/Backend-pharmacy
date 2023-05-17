package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Pharmacie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String address;
	private String log;
	private String lat;

	
	
	public List<Photo> getPhoto() {
		return photo;
	}

	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	
	@ManyToOne
	@JoinColumn(name="zone_id")
	private Zone zone;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "pharmacie")
	private  List<Gardepharmacie> gardepharmacie;
	
	
	@OneToMany(mappedBy = "pharmacie")
	private  List<Photo> photo;
	
	@JsonIgnore
	@OneToMany (mappedBy = "pharmacie",fetch = FetchType.EAGER)
	List<User> user;
	
	
	
	public List<User> getuser() {
		return user;
	}

	public void setuser(List<User> user) {
		this.user = user;
	} 

	public void setGardepharmacie(List<Gardepharmacie> gardepharmacie) {
		this.gardepharmacie = gardepharmacie;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public List<Gardepharmacie> getGardepharmacie() {
		return gardepharmacie;
	}

	public void setP(List<Gardepharmacie> gardepharmacie) {
		this.gardepharmacie = gardepharmacie;
	}

	public Pharmacie() {
		super();
	}
		
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
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
