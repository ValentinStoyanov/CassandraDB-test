package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Carga implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private int codigo;
	private String tipo;
	private int peso;
	private String idorigen;
	private String iddestino;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIdorigen() {
		return idorigen;
	}

	public void setIdorigen(String idorigen) {
		this.idorigen = idorigen;
	}

	public String getIddestino() {
		return iddestino;
	}

	public void setIddestino(String iddestino) {
		this.iddestino = iddestino;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
