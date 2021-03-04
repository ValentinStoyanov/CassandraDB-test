package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Viaje implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private String idConductor;
	

	private String idCamion;
	

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
