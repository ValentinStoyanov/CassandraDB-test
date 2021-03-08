package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Conductor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private String dni;

	private String nombre;

	private String apellidos;
	
	private String permisosconducir;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPermisosconducir() {
		return permisosconducir;
	}

	public void setPermisosconducir(String permisosconducir) {
		this.permisosconducir = permisosconducir;
	}



}
