package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Owner implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private String dni;
	private String fiscalname;
	private String comercialname;
	private String ownername;
	private String telephone;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getFiscalname() {
		return fiscalname;
	}


	public void setFiscalname(String fiscalname) {
		this.fiscalname = fiscalname;
	}


	public String getComercialname() {
		return comercialname;
	}


	public void setComercialname(String comercialname) {
		this.comercialname = comercialname;
	}


	public String getOwnername() {
		return ownername;
	}


	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


}
