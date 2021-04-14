package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Trailer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private String chassisnumber;
	private String registrationtag;
	private String brand;
	private String model;
	private String type;
	private int idload;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getChassisnumber() {
		return chassisnumber;
	}


	public void setChassisnumber(String chassisnumber) {
		this.chassisnumber = chassisnumber;
	}


	public String getRegistrationtag() {
		return registrationtag;
	}


	public void setRegistrationtag(String registrationtag) {
		this.registrationtag = registrationtag;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getIdload() {
		return idload;
	}


	public void setIdload(int idload) {
		this.idload = idload;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


}
