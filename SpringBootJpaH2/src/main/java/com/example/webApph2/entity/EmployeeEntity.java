package com.example.webApph2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class EmployeeEntity {
	
	@Id
	private int employeeId;
	
	private String name;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", name=" + name + "]";
	}

}
