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
	private String coleccion;
	private String nombre;
	private String acabado;
	private String ley;
	private String anverso;
	private String reverso;
	private String comentario;
	
	
	
	
	public Coin() {
		super();
	}

	/**
	 * @param id
	 * @param valorFacial
	 * @param material
	 * @param diametro
	 * @param onzas
	 * @param colecion
	 * @param nombre
	 * @param acabado
	 * @param ley
	 * @param anverso
	 * @param reverso
	 * @param comentario
	 */
	public Coin(Long id, String valorFacial, String material, float diametro, float onzas, String coleccion,
			String nombre, String acabado, String ley, String anverso, String reverso, String comentario) {
		super();
		this.id = id;
		this.valorFacial = valorFacial;
		this.material = material;
		this.diametro = diametro;
		this.onzas = onzas;
		this.coleccion = coleccion;
		this.nombre = nombre;
		this.acabado = acabado;
		this.ley = ley;
		this.anverso = anverso;
		this.reverso = reverso;
		this.comentario = comentario;
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
	

	public String getColeccion() {
		return coleccion;
	}



	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getAcabado() {
		return acabado;
	}



	public void setAcabado(String acabado) {
		this.acabado = acabado;
	}



	public String getLey() {
		return ley;
	}



	public void setLey(String ley) {
		this.ley = ley;
	}



	public String getAnverso() {
		return anverso;
	}



	public void setAnverso(String anverso) {
		this.anverso = anverso;
	}



	public String getReverso() {
		return reverso;
	}



	public void setReverso(String reverso) {
		this.reverso = reverso;
	}



	public String getComentario() {
		return comentario;
	}



	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	
	

}
