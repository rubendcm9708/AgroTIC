package co.edu.icesi.demo.modelo;
// Generated 18/05/2017 01:24:35 PM by Hibernate Tools 5.1.4.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Tipocaracteristica generated by hbm2java
 */
public class Tipocaracteristica implements java.io.Serializable {

	private BigDecimal tipocaractid;
	private String nombretipo;
	private Set<Caracteristica> caracteristicas = new HashSet<Caracteristica>(0);

	public Tipocaracteristica() {
	}

	public Tipocaracteristica(BigDecimal tipocaractid, String nombretipo) {
		this.tipocaractid = tipocaractid;
		this.nombretipo = nombretipo;
	}

	public Tipocaracteristica(BigDecimal tipocaractid, String nombretipo, Set<Caracteristica> caracteristicas) {
		this.tipocaractid = tipocaractid;
		this.nombretipo = nombretipo;
		this.caracteristicas = caracteristicas;
	}

	public BigDecimal getTipocaractid() {
		return this.tipocaractid;
	}

	public void setTipocaractid(BigDecimal tipocaractid) {
		this.tipocaractid = tipocaractid;
	}

	public String getNombretipo() {
		return this.nombretipo;
	}

	public void setNombretipo(String nombretipo) {
		this.nombretipo = nombretipo;
	}

	public Set<Caracteristica> getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(Set<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}
