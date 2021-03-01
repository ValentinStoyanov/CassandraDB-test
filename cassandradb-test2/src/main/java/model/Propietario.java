package model;

import java.io.Serializable;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Propietario")
public class Propietario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKeyColumn(name = "dni", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("dni")
	private String dni;
	
	@Column("nombreFiscal")
	private String nombreFiscal;
	
	@Column("nombreComercial")
	private String nombreComercial;
	
	@Column("nombrePropietario")
	private String nombrePropietario;
	
	@Column("telefono")
	private String telefono;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreFiscal() {
		return nombreFiscal;
	}

	public void setNombreFiscal(String nombreFiscal) {
		this.nombreFiscal = nombreFiscal;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
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
	
}
