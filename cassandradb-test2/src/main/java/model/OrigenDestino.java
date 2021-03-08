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
	
	private String idpropietario;
	
	
	private String direccion;


	private String ciudad;
	
	
	private String provincia;
	
	
	private String idcoordenadas;



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



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIdpropietario() {
		return idpropietario;
	}

	public void setIdpropietario(String idpropietario) {
		this.idpropietario = idpropietario;
	}

	public String getIdcoordenadas() {
		return idcoordenadas;
	}

	public void setIdcoordenadas(String idcoordenadas) {
		this.idcoordenadas = idcoordenadas;
	}
	
}
