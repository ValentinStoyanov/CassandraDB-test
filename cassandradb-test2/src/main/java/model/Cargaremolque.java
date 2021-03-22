package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Cargaremolque implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private int codigo;
	private int idcarga;
	private String iddestino;
	private String idorigen;
	private String marca;
	private String matricula;
	private String modelo;
	private String numerobastidor;
	private String peso;
	private String tipocarga;
	private String tiporemolque;
	
	public Cargaremolque() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIdcarga() {
		return idcarga;
	}
	public void setIdcarga(int idcarga) {
		this.idcarga = idcarga;
	}
	public String getIddestino() {
		return iddestino;
	}
	public void setIddestino(String iddestino) {
		this.iddestino = iddestino;
	}
	public String getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(String idorigen) {
		this.idorigen = idorigen;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumerobastidor() {
		return numerobastidor;
	}
	public void setNumerobastidor(String numerobastidor) {
		this.numerobastidor = numerobastidor;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getTipocarga() {
		return tipocarga;
	}
	public void setTipocarga(String tipocarga) {
		this.tipocarga = tipocarga;
	}
	public String getTiporemolque() {
		return tiporemolque;
	}
	public void setTiporemolque(String tiporemolque) {
		this.tiporemolque = tiporemolque;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
