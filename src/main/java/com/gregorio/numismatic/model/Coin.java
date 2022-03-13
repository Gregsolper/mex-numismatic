package com.gregorio.numismatic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "coins")
public class Coin {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="valorfacial")
	private String valorFacial;
	private String material;
	private float diametro;
	private float onzas;
	
	
	
	public Coin() {
		super();
	}
	
	public Coin(String valorFacial, String material, float diametro, float onzas) {
		super();
		this.valorFacial = valorFacial;
		this.material = material;
		this.diametro = diametro;
		this.onzas = onzas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getValorFacial() {
		return valorFacial;
	}
	public void setValorFacial(String valorFacial) {
		this.valorFacial = valorFacial;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	public float getOnzas() {
		return onzas;
	}
	public void setOnzas(float onzas) {
		this.onzas = onzas;
	}
	
	
	
	

}
