package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Travel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private String iddriver;
	private String idtruck;
	private String idtrailer;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIddriver() {
		return iddriver;
	}

	public void setIddriver(String iddriver) {
		this.iddriver = iddriver;
	}

	public String getIdtruck() {
		return idtruck;
	}

	public void setIdtruck(String idtruck) {
		this.idtruck = idtruck;
	}

	public String getIdtrailer() {
		return idtrailer;
	}

	public void setIdtrailer(String idtrailer) {
		this.idtrailer = idtrailer;
	}


}
