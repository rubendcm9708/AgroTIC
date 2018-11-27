package co.edu.icesi.demo.modelo;
// Generated 18/05/2017 01:24:35 PM by Hibernate Tools 5.1.4.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Caracteristica generated by hbm2java
 */
public class Caracteristica implements java.io.Serializable {

	private BigDecimal caractid;
	private Tipocaracteristica tipocaracteristica;
	private String descripcioncaract;
	private Set<GrupohomosueloCaracteristica> grupohomosueloCaracteristicas = new HashSet<GrupohomosueloCaracteristica>(
			0);

	public Caracteristica() {
	}

	public Caracteristica(BigDecimal caractid, String descripcioncaract) {
		this.caractid = caractid;
		this.descripcioncaract = descripcioncaract;
	}

	public Caracteristica(BigDecimal caractid, Tipocaracteristica tipocaracteristica, String descripcioncaract,
			Set<GrupohomosueloCaracteristica> grupohomosueloCaracteristicas) {
		this.caractid = caractid;
		this.tipocaracteristica = tipocaracteristica;
		this.descripcioncaract = descripcioncaract;
		this.grupohomosueloCaracteristicas = grupohomosueloCaracteristicas;
	}

	public BigDecimal getCaractid() {
		return this.caractid;
	}

	public void setCaractid(BigDecimal caractid) {
		this.caractid = caractid;
	}

	public Tipocaracteristica getTipocaracteristica() {
		return this.tipocaracteristica;
	}

	public void setTipocaracteristica(Tipocaracteristica tipocaracteristica) {
		this.tipocaracteristica = tipocaracteristica;
	}

	public String getDescripcioncaract() {
		return this.descripcioncaract;
	}

	public void setDescripcioncaract(String descripcioncaract) {
		this.descripcioncaract = descripcioncaract;
	}

	public Set<GrupohomosueloCaracteristica> getGrupohomosueloCaracteristicas() {
		return this.grupohomosueloCaracteristicas;
	}

	public void setGrupohomosueloCaracteristicas(Set<GrupohomosueloCaracteristica> grupohomosueloCaracteristicas) {
		this.grupohomosueloCaracteristicas = grupohomosueloCaracteristicas;
	}

}