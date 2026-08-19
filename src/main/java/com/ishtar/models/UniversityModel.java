package com.ishtar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "university")
public class UniversityModel extends AbstractModel {
	private String name;
	private String description;
	@OneToMany(fetch = FetchType.LAZY)
	private Set<CollageModel> collages;
	public UniversityModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UniversityModel(Long id, String name, String description, Set<CollageModel> collages) {
		super(id);
		this.name = name;
		this.description = description;
		this.collages = collages;
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
	public Set<CollageModel> getCollages() {
		return collages;
	}
	public void setCollages(Set<CollageModel> collages) {
		this.collages = collages;
	}
}
