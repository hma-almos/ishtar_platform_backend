package com.ishtar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrer_feilds")
public class CarrerFeilds extends AbstractModel{
//needed for data entry guy
	@Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

	public CarrerFeilds(Long id, String name, String description) {
		super(id);
		this.name = name;
		this.description = description;
	}

	public CarrerFeilds() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
