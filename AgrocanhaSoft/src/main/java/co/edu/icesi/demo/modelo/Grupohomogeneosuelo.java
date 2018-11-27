package co.edu.icesi.demo.modelo;
// Generated 18/05/2017 01:24:35 PM by Hibernate Tools 5.1.4.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Grupohomogeneosuelo generated by hbm2java
 */
public class Grupohomogeneosuelo implements java.io.Serializable {

	private BigDecimal grhomosueloid;
	private int numerogrupo;
	private Set<GrupohomosueloCaracteristica> grupohomosueloCaracteristicas = new HashSet<GrupohomosueloCaracteristica>(
			0);
	private Set<GrupohomosueloFamiliatextural> grupohomosueloFamiliatexturals = new HashSet<GrupohomosueloFamiliatextural>(
			0);
	private Set<Zonaagroecologica> zonaagroecologicas = new HashSet<Zonaagroecologica>(0);
	private Set<GrupohomosueloOrdensuelo> grupohomosueloOrdensuelos = new HashSet<GrupohomosueloOrdensuelo>(0);

	public Grupohomogeneosuelo() {
	}

	public Grupohomogeneosuelo(BigDecimal grhomosueloid, int numerogrupo) {
		this.grhomosueloid = grhomosueloid;
		this.numerogrupo = numerogrupo;
	}

	public Grupohomogeneosuelo(BigDecimal grhomosueloid, int numerogrupo,
			Set<GrupohomosueloCaracteristica> grupohomosueloCaracteristicas,
			Set<GrupohomosueloFamiliatextural> grupohomosueloFamiliatexturals,
			Set<Zonaagroecologica> zonaagroecologicas, Set<GrupohomosueloOrdensuelo> grupohomosueloOrdensuelos) {
		this.grhomosueloid = grhomosueloid;
		this.numerogrupo = numerogrupo;
		this.grupohomosueloCaracteristicas = grupohomosueloCaracteristicas;
		this.grupohomosueloFamiliatexturals = grupohomosueloFamiliatexturals;
		this.zonaagroecologicas = zonaagroecologicas;
		this.grupohomosueloOrdensuelos = grupohomosueloOrdensuelos;
	}

	public BigDecimal getGrhomosueloid() {
		return this.grhomosueloid;
	}

	public void setGrhomosueloid(BigDecimal grhomosueloid) {
		this.grhomosueloid = grhomosueloid;
	}

	public int getNumerogrupo() {
		return this.numerogrupo;
	}

	public void setNumerogrupo(int numerogrupo) {
		this.numerogrupo = numerogrupo;
	}

	public Set<GrupohomosueloCaracteristica> getGrupohomosueloCaracteristicas() {
		return this.grupohomosueloCaracteristicas;
	}

	public void setGrupohomosueloCaracteristicas(Set<GrupohomosueloCaracteristica> grupohomosueloCaracteristicas) {
		this.grupohomosueloCaracteristicas = grupohomosueloCaracteristicas;
	}

	public Set<GrupohomosueloFamiliatextural> getGrupohomosueloFamiliatexturals() {
		return this.grupohomosueloFamiliatexturals;
	}

	public void setGrupohomosueloFamiliatexturals(Set<GrupohomosueloFamiliatextural> grupohomosueloFamiliatexturals) {
		this.grupohomosueloFamiliatexturals = grupohomosueloFamiliatexturals;
	}

	public Set<Zonaagroecologica> getZonaagroecologicas() {
		return this.zonaagroecologicas;
	}

	public void setZonaagroecologicas(Set<Zonaagroecologica> zonaagroecologicas) {
		this.zonaagroecologicas = zonaagroecologicas;
	}

	public Set<GrupohomosueloOrdensuelo> getGrupohomosueloOrdensuelos() {
		return this.grupohomosueloOrdensuelos;
	}

	public void setGrupohomosueloOrdensuelos(Set<GrupohomosueloOrdensuelo> grupohomosueloOrdensuelos) {
		this.grupohomosueloOrdensuelos = grupohomosueloOrdensuelos;
	}

}
