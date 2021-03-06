package co.edu.icesi.demo.modelo;
// Generated 18/05/2017 01:24:35 PM by Hibernate Tools 5.1.4.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Rangometricas generated by hbm2java
 */
public class Rangometricas implements java.io.Serializable {

	private BigDecimal idrango;
	private Metrica metrica;
	private String nombrerango;
	private double valorminimo;
	private double valormaximo;
	private Set<Medicionmetricas> medicionmetricases = new HashSet<Medicionmetricas>(0);

	public Rangometricas() {
	}

	public Rangometricas(BigDecimal idrango, Metrica metrica, String nombrerango, double valorminimo,
			double valormaximo) {
		this.idrango = idrango;
		this.metrica = metrica;
		this.nombrerango = nombrerango;
		this.valorminimo = valorminimo;
		this.valormaximo = valormaximo;
	}

	public Rangometricas(BigDecimal idrango, Metrica metrica, String nombrerango, double valorminimo,
			double valormaximo, Set<Medicionmetricas> medicionmetricases) {
		this.idrango = idrango;
		this.metrica = metrica;
		this.nombrerango = nombrerango;
		this.valorminimo = valorminimo;
		this.valormaximo = valormaximo;
		this.medicionmetricases = medicionmetricases;
	}

	public BigDecimal getIdrango() {
		return this.idrango;
	}

	public void setIdrango(BigDecimal idrango) {
		this.idrango = idrango;
	}

	public Metrica getMetrica() {
		return this.metrica;
	}

	public void setMetrica(Metrica metrica) {
		this.metrica = metrica;
	}

	public String getNombrerango() {
		return this.nombrerango;
	}

	public void setNombrerango(String nombrerango) {
		this.nombrerango = nombrerango;
	}

	public double getValorminimo() {
		return this.valorminimo;
	}

	public void setValorminimo(double valorminimo) {
		this.valorminimo = valorminimo;
	}

	public double getValormaximo() {
		return this.valormaximo;
	}

	public void setValormaximo(double valormaximo) {
		this.valormaximo = valormaximo;
	}

	public Set<Medicionmetricas> getMedicionmetricases() {
		return this.medicionmetricases;
	}

	public void setMedicionmetricases(Set<Medicionmetricas> medicionmetricases) {
		this.medicionmetricases = medicionmetricases;
	}

}
