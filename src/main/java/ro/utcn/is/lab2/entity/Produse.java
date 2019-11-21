package ro.utcn.is.lab2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private String descriereProdus;
	
	@Column
	private int cantitateProdus;
	
	@Column
	private float pretProdus;

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

	public float getPretProdus() {
		return pretProdus;
	}

	public void setPretProdus(float pretProdus) {
		this.pretProdus = pretProdus;
	}
	
}
