package co.edu.icesi.demo.modelo;
// Generated 18/05/2017 01:24:35 PM by Hibernate Tools 5.1.4.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Diagnosticoagronomo generated by hbm2java
 */
public class Diagnosticoagronomo implements java.io.Serializable {

	private BigDecimal diagnosticid;
	private Estrategiamuestreo estrategiamuestreo;
	private Usuario usuario;
	private Zonaagroecologica zonaagroecologica;
	private Date fechacreaciondiag;
	private String descripciondiag;
	private Set<Estrategiamuestreo> estrategiamuestreos = new HashSet<Estrategiamuestreo>(0);

	public Diagnosticoagronomo() {
	}

	public Diagnosticoagronomo(BigDecimal diagnosticid, Estrategiamuestreo estrategiamuestreo, Date fechacreaciondiag,
			String descripciondiag) {
		this.diagnosticid = diagnosticid;
		this.estrategiamuestreo = estrategiamuestreo;
		this.fechacreaciondiag = fechacreaciondiag;
		this.descripciondiag = descripciondiag;
	}

	public Diagnosticoagronomo(BigDecimal diagnosticid, Estrategiamuestreo estrategiamuestreo, Usuario usuario,
			Zonaagroecologica zonaagroecologica, Date fechacreaciondiag, String descripciondiag,
			Set<Estrategiamuestreo> estrategiamuestreos) {
		this.diagnosticid = diagnosticid;
		this.estrategiamuestreo = estrategiamuestreo;
		this.usuario = usuario;
		this.zonaagroecologica = zonaagroecologica;
		this.fechacreaciondiag = fechacreaciondiag;
		this.descripciondiag = descripciondiag;
		this.estrategiamuestreos = estrategiamuestreos;
	}

	public BigDecimal getDiagnosticid() {
		return this.diagnosticid;
	}

	public void setDiagnosticid(BigDecimal diagnosticid) {
		this.diagnosticid = diagnosticid;
	}

	public Estrategiamuestreo getEstrategiamuestreo() {
		return this.estrategiamuestreo;
	}

	public void setEstrategiamuestreo(Estrategiamuestreo estrategiamuestreo) {
		this.estrategiamuestreo = estrategiamuestreo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Zonaagroecologica getZonaagroecologica() {
		return this.zonaagroecologica;
	}

	public void setZonaagroecologica(Zonaagroecologica zonaagroecologica) {
		this.zonaagroecologica = zonaagroecologica;
	}

	public Date getFechacreaciondiag() {
		return this.fechacreaciondiag;
	}

	public void setFechacreaciondiag(Date fechacreaciondiag) {
		this.fechacreaciondiag = fechacreaciondiag;
	}

	public String getDescripciondiag() {
		return this.descripciondiag;
	}

	public void setDescripciondiag(String descripciondiag) {
		this.descripciondiag = descripciondiag;
	}

	public Set<Estrategiamuestreo> getEstrategiamuestreos() {
		return this.estrategiamuestreos;
	}

	public void setEstrategiamuestreos(Set<Estrategiamuestreo> estrategiamuestreos) {
		this.estrategiamuestreos = estrategiamuestreos;
	}

}
