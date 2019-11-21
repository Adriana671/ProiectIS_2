package ro.utcn.is.lab2.entity;

import javax.persistence.*;

/**
 * Fiecare entitate (care reprezinta un tabel in baza de date) trebuie sa aiba obligatoriu:
 * 
 * 		1. "@Entity" - pentru a stii EntityManager-ul ce clase din aplicatie sunt tabelele din BD.
 * 		2. "@Id" - ce reprezinta cheia primara a tabelului. Orice tabel are nevoie de un PRIMARY KEY (PK).
 * 		3. "@Column" - celelalte coloane din tabel.
 */
@Entity
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
	private String rol;
	
	
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
	
	
}
