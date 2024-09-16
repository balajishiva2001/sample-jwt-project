package com.samplejwtproject.app.dtos;

public class StudentDto {

	private int id;
	
	private String name;
	
	private String tech;

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDto(int id, String name, String tech) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	
}
