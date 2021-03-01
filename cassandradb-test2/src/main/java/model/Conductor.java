package model;

import java.io.Serializable;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Conductor")
public class Conductor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKeyColumn(name = "dni", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("dni")
	private String dni;
	
	@Column("nombre")
	private String nombre;
	
	@Column("apellidos")
	private String apellidos;
	
	@Column("permisoConducir")
	private String permisoConducir;

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

	public String getPermisoConducir() {
		return permisoConducir;
	}

	public void setPermisoConducir(String permisoConducir) {
		this.permisoConducir = permisoConducir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
