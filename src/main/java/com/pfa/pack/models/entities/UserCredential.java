package com.pfa.pack.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "user_credentials")
@Table(name = "user_credentials", indexes = {@Index(name = "user_credentials_username_IX", columnList = "username", unique = true)})
public final class UserCredential implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false, precision = 10)
	private Integer userId;
	
	@Column(unique = true, length = 200)
	private String username;
	
	@Column(name = "password", length = 200)
	private String password;
	
	@Column(name = "enabled")
	private Boolean enabled;
	
	@Column(name = "role", length = 200)
	private String role;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	public UserCredential() {
		
	}
	
	@Override
	public String toString() {
		return "UserCredential [userId=" + userId + ", username=" + username + ", password=" + password + ", enabled="
				+ enabled + ", role=" + role + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(final Boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(final String role) {
		this.role = role;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

	public Integer getUserId() {
		return userId;
	}
	
	
	
}













