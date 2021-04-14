package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class OriginDestiny implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private String idowner;
	private String address;
	private String city;
	private String province;
	private String idcoordinate;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIdowner() {
		return idowner;
	}

	public void setIdowner(String idowner) {
		this.idowner = idowner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getIdcoordinate() {
		return idcoordinate;
	}

	public void setIdcoordinate(String idcoordinate) {
		this.idcoordinate = idcoordinate;
	}

	
}
