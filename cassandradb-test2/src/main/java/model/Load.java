package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Load implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private int code;
	private String type;
	private int load;
	private String idorigin;
	private String iddestiny;
	private double loadtons;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getLoad() {
		return load;
	}


	public void setLoad(int load) {
		this.load = load;
	}


	public String getIdorigin() {
		return idorigin;
	}


	public void setIdorigin(String idorigin) {
		this.idorigin = idorigin;
	}


	public String getIddestiny() {
		return iddestiny;
	}


	public void setIddestiny(String iddestiny) {
		this.iddestiny = iddestiny;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public double getLoadtons() {
		return loadtons;
	}


	public void setLoadtons(double loadtons) {
		this.loadtons = loadtons;
	}




}
