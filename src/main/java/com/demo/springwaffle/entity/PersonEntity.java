package com.demo.springwaffle.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonEntity {
	@Id
	private String uid;
	private String firstName;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
