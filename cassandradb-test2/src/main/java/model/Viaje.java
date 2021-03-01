package model;

import java.io.Serializable;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Viaje")
public class Viaje implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKeyColumn(name = "idConductor", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("idConductor")
	private String idConductor;
	
	@PrimaryKeyColumn(name = "idCamion", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("idCamion")
	private String idCamion;
	
	@PrimaryKeyColumn(name = "idRemolque", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("idRemolque")
	private String idRemolque;

	public String getIdConductor() {
		return idConductor;
	}

	public void setIdConductor(String idConductor) {
		this.idConductor = idConductor;
	}

	public String getIdCamion() {
		return idCamion;
	}

	public void setIdCamion(String idCamion) {
		this.idCamion = idCamion;
	}

	public String getIdRemolque() {
		return idRemolque;
	}

	public void setIdRemolque(String idRemolque) {
		this.idRemolque = idRemolque;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
