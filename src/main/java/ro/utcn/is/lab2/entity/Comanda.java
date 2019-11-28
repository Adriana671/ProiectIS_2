package ro.utcn.is.lab2.entity;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comanda {
	
	public Comanda() {

	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private int nrProduse;
	
	@Column 
	private float valoare;
	
	@Column
	private String tipPlata;
	
	@Column
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNrProduse() {
		return nrProduse;
	}

	public void setNrProduse(int nrProduse) {
		this.nrProduse = nrProduse;
	}

	public float getValoare() {
		return valoare;
	}

	public void setValoare(float valoare) {
		this.valoare = valoare;
	}

	public String getTipPlata() {
		return tipPlata;
	}

	public void setTipPlata(String tipPlata) {
		this.tipPlata = tipPlata;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}
