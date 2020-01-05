package ro.utcn.is.lab2.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Produse {
	
	public Produse()
	{	
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String denumireProdus;
	
	@Column 
	private String categorieProdus;
	
	@Column 
	private String descriereProdus;
	
	@Column
	private int cantitateProdus;
	
	@Column
	private int pretProdus;
	
	@ManyToMany
	@JoinTable(
	   name="produs_comandat",
	   joinColumns=@JoinColumn(name="produs_id", referencedColumnName="id"),
	   inverseJoinColumns=@JoinColumn(name="comanda_id", referencedColumnName="id"))
	private Set<Comanda> comenzi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDenumireProdus() {
		return denumireProdus;
	}

	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}

	public String getDescriereProdus() {
		return descriereProdus;
	}

	public void setDescriereProdus(String descriereProdus) {
		this.descriereProdus = descriereProdus;
	}

	public int getCantitateProdus() {
		return cantitateProdus;
	}

	public void setCantitateProdus(int cantitateProdus) {
		this.cantitateProdus = cantitateProdus;
	}

	public int getPretProdus() {
		return pretProdus;
	}
	

	public String getCategorieProdus() {
		return categorieProdus;
	}

	public void setCategorieProdus(String categorieProdus) {
		this.categorieProdus = categorieProdus;
	}

	public void setPretProdus(int pretProdus) {
		this.pretProdus = pretProdus;
	}

	public Set<Comanda> getComenzi() {
		return comenzi;
	}

	public void setComenzi(Set<Comanda> comenzi) {
		this.comenzi = comenzi;
	}

	
}
