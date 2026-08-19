package com.ishtar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class Departments extends AbstractModel{
	@Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    // Optional field: null if the department doesn't specify a custom GPA requirement
    @Column(name = "minimum_gpa")
    private Double minimumGpa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    private CollageModel college;

	public Departments(Long id, String name, String description, Double minimumGpa, CollageModel college) {
		super(id);
		this.name = name;
		this.description = description;
		this.minimumGpa = minimumGpa;
		this.college = college;
	}

	public Departments() {
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

	public Double getMinimumGpa() {
		return minimumGpa;
	}

	public void setMinimumGpa(Double minimumGpa) {
		this.minimumGpa = minimumGpa;
	}

	public CollageModel getCollege() {
		return college;
	}

	public void setCollege(CollageModel college) {
		this.college = college;
	}
    }
