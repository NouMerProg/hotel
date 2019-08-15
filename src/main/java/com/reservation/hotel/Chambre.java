
AMRANI

package com.reservation.hotel;

import java.util.Date;

public class Chambre {
	
	private char type;
	
	private char etat;
	
	private Integer numero;
	
	private Date dateDebut;
	
	private Date dateFin;
	
	private String nomClient;

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public char getEtat() {
		return etat;
	}

	public void setEtat(char etat) {
		this.etat = etat;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	
	
}
