package org.formation.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Produit {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String reference;
	
	private String nom;
	
	private String description;
	
	private Float prixUnitaire;
	
	private Integer availability;
	
	@Embedded
	private Dimension dimension;
	
	@ManyToOne
	private Fournisseur fournisseur;
	
}
