package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Propietario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private String dni;
	
	
	private String nombrefiscal;
	
	
	private String nombrecomercial;
	
	
	private String nombrepropietario;
	

	private String telefono;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNombrefiscal() {
		return nombrefiscal;
	}

	public void setNombrefiscal(String nombrefiscal) {
		this.nombrefiscal = nombrefiscal;
	}

	public String getNombrecomercial() {
		return nombrecomercial;
	}

	public void setNombrecomercial(String nombrecomercial) {
		this.nombrecomercial = nombrecomercial;
	}

	public String getNombrepropietario() {
		return nombrepropietario;
	}

	public void setNombrepropietario(String nombrepropietario) {
		this.nombrepropietario = nombrepropietario;
	}
	
}
