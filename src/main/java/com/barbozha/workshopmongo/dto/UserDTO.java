package com.barbozha.workshopmongo.dto;

import java.io.Serializable;

import com.barbozha.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;

	public UserDTO() {
	}

	// Vamos criar um construtor sobrecarregado
	// é uma forma de automatizar de instanciar um UserDTO a partir de um user.
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
