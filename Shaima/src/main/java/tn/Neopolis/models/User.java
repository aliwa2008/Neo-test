package tn.Neopolis.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	@NonNull
	private String nom;

	@Column
	@NonNull
	private String prenom;

	@Column
	private int nbEnf;

	@Enumerated(EnumType.STRING)
	private Civilite civ;

	@Column
	@NonNull
	private Date dateNais;

	@Column(unique = true)
	@NonNull
	private String email;

	@Column
	@NonNull
	private String tel;

	@Column
	@NonNull
	private String tel2;
	
	@Column
	@NonNull
	private String adresse;
	
	@Column
	@NonNull
	private String pays;
	
	@Column
	@NonNull
	private String rue;
	
	@Column
	private int num_rue;
	
	@Column
	private int code_postal;
	
	
	
	

}
