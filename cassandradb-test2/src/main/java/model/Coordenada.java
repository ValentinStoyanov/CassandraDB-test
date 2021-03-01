package model;

import java.io.Serializable;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Coordenada")
public class Coordenada implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@PrimaryKeyColumn(name = "latitud", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("latitud")
	private String latitud;
	
	@Column("longitud")
	private String longitud;
	
	@Column("altitud")
	private String altitud;
	
	@Column("tiempo")
	private String tiempo;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getAltitud() {
		return altitud;
	}

	public void setAltitud(String altitud) {
		this.altitud = altitud;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	
}
