package com.vinod.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@Data
@ToString
@Table(name="Employee1")
public class Employee 
{
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String dept;
	
	public Employee(long id, String name,String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public Employee() {
		super();
	}

	
	
}
