package model;

import java.io.Serializable;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("OrigenDestino")
public class OrigenDestino implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column("idPropietario")
	private String idPropietario;
	
	@PrimaryKeyColumn(name = "direccion", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("direccion")
	private String direccion;

	@Column("ciudad")
	private String ciudad;
	
	@Column("provincia")
	private String provincia;
	
	@Column("idCoordenadas")
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
