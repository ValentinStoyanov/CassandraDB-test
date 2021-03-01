package model;

import java.io.Serializable;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Remolque")
public class Remolque implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKeyColumn(name = "numeroBastidor", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("numeroBastidor")
	private String numeroBastidor;
	
	
	@Column("matricula")
	private String matricula;
	
	@Column("marca")
	private String marca;
	
	@Column("modelo")
	private String modelo;
	
	@Column("tipo")
	private String tipo;
	
	@Column("idCarga")
	private String idCarga;

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIdCarga() {
		return idCarga;
	}

	public void setIdCarga(String idCarga) {
		this.idCarga = idCarga;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
