package co.edu.icesi.demo.modelo;
// Generated 18/05/2017 01:24:35 PM by Hibernate Tools 5.1.4.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Puntorecoleccion generated by hbm2java
 */
public class Puntorecoleccion implements java.io.Serializable {

	private BigDecimal puntoid;
	private EstrategiaLote estrategiaLote;
	private Double latitud;
	private Double altitud;
	private Set<Fotografia> fotografias = new HashSet<Fotografia>(0);

	public Puntorecoleccion() {
	}

	public Puntorecoleccion(BigDecimal puntoid) {
		this.puntoid = puntoid;
	}

	public Puntorecoleccion(BigDecimal puntoid, EstrategiaLote estrategiaLote, Double latitud, Double altitud,
			Set<Fotografia> fotografias) {
		this.puntoid = puntoid;
		this.estrategiaLote = estrategiaLote;
		this.latitud = latitud;
		this.altitud = altitud;
		this.fotografias = fotografias;
	}

	public BigDecimal getPuntoid() {
		return this.puntoid;
	}

	public void setPuntoid(BigDecimal puntoid) {
		this.puntoid = puntoid;
	}

	public EstrategiaLote getEstrategiaLote() {
		return this.estrategiaLote;
	}

	public void setEstrategiaLote(EstrategiaLote estrategiaLote) {
		this.estrategiaLote = estrategiaLote;
	}

	public Double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getAltitud() {
		return this.altitud;
	}

	public void setAltitud(Double altitud) {
		this.altitud = altitud;
	}

	public Set<Fotografia> getFotografias() {
		return this.fotografias;
	}

	public void setFotografias(Set<Fotografia> fotografias) {
		this.fotografias = fotografias;
	}

}
