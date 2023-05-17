
package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;


@Embeddable
public class GardepharmacieKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int garde;
	private int pharmacie;
	private Date dateopen;
	
	
	public GardepharmacieKey() {
		super();
	}
	
	
	public int getGarde() {
		return garde;
	}

	public void setGarde(int garde) {
		this.garde = garde;
	}

	public int getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(int pharmacie) {
		this.pharmacie = pharmacie;
	}

	public Date getDateopen() {
		return dateopen;
	}

	public void setDateopen(Date dateopen) {
		this.dateopen = dateopen;
	}

	
}
