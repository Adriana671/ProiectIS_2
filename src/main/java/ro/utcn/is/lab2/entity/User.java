package ro.utcn.is.lab2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Fiecare entitate (care reprezinta un tabel in baza de date) trebuie sa aiba obligatoriu:
 * 
 * 		1. "@Entity" - pentru a stii EntityManager-ul ce clase din aplicatie sunt tabelele din BD.
 * 		2. "@Id" - ce reprezinta cheia primara a tabelului. Orice tabel are nevoie de un PRIMARY KEY (PK).
 * 		3. "@Column" - celelalte coloane din tabel.
 */
@Entity
@Table(name = "user")
public class User {

	/**
	 * PK-ul este de tip int si autogenerat.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column 
	private int varsta;
	
	@Column 
	private String adresa;
	
	@Column 
	private String email;
	
	@Column 
	private String password;
	
	@Column
	private String rol;
	
	
	@OneToMany(mappedBy = "user")
	private List<Comanda> comenzi;
	
	
	
	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<Comanda> getComenzi() {
		return comenzi;
	}

	public void setComenzi(List<Comanda> comenzi) {
		this.comenzi = comenzi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
