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
	private String idconductor;
	

	private String idcamion;
	

	private String idremolque;



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getIdconductor() {
		return idconductor;
	}



	public void setIdconductor(String idconductor) {
		this.idconductor = idconductor;
	}



	public String getIdcamion() {
		return idcamion;
	}



	public void setIdcamion(String idcamion) {
		this.idcamion = idcamion;
	}



	public String getIdremolque() {
		return idremolque;
	}



	public void setIdremolque(String idremolque) {
		this.idremolque = idremolque;
	}


}
