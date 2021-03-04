package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class OrigenDestino implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	
	private String idPropietario;
	
	
	private String direccion;


	private String ciudad;
	
	
	private String provincia;
	
	
	private String idCoordenadas;

	public String getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getIdCoordenadas() {
		return idCoordenadas;
	}

	public void setIdCoordenadas(String idCoordenadas) {
		this.idCoordenadas = idCoordenadas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
