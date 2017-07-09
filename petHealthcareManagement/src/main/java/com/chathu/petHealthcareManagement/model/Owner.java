package com.chathu.petHealthcareManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="OWNER")
public class Owner {
	
	@Id
	@GeneratedValue
	@Column(name="ownerId")
	private Long id;
	
	@Column(name="ownerName")
	private String ownerName;
	private String ownerAddress;
	private String ownerMobile;
	private String ownerNIC;
	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerMobile() {
		return ownerMobile;
	}
	public void setOwnerMobile(String ownerMobile) {
		this.ownerMobile = ownerMobile;
	}
	public String getOwnerNIC() {
		return ownerNIC;
	}
	public void setOwnerNIC(String ownerNIC) {
		this.ownerNIC = ownerNIC;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
