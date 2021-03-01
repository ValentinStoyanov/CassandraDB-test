package model;

import java.io.Serializable;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Carga")
public class Carga implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKeyColumn(name = "codigo", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("codigo")
	private String codigo;
	
	@Column("tipo")
	private String tipo;
	
	@Column("peso")
	private String peso;
	
	@Column("idOrigen")
	private String idOrigen;
	
	@Column("idDestino")
	private String idDestino;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getIdOrigen() {
		return idOrigen;
	}

	public void setIdOrigen(String idOrigen) {
		this.idOrigen = idOrigen;
	}

	public String getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(String idDestino) {
		this.idDestino = idDestino;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
