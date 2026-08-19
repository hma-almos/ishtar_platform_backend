package com.ishtar.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "college")

public class CollageModel extends AbstractModel{

    @Column(nullable = false)
    private String name;
	@Column(nullable = false)
	private String studyType;
	@Column(nullable = false)
	private String gender;
	@JoinColumn(name = "university")
    @ManyToOne()
    private UniversityModel university;
	@OneToMany(mappedBy = "collage",cascade = CascadeType.ALL)
	private List<ShiftModel> shift;

    private String city;

    @Column(name = "is_private")
    private Boolean isPrivate;

    @Column(name = "logo_url")
    private String logoUrl;

    @Column(columnDefinition = "TEXT")
    private String overview;
    
    @Column(name = "established_year")
    private String establishedYear;

    @Column(name = "recognition_doc_number")
    private String recognitionDocNumber;

    @Column(columnDefinition = "TEXT", name = "extra_info")
    private String extraInfo;
    
    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Departments> departments = new HashSet<>();

    @ManyToMany()
    @JoinTable(
        name = "college_career_fields",
        joinColumns = @JoinColumn(name = "college_id"),
        inverseJoinColumns = @JoinColumn(name = "career_field_id")
    )
    private Set<CarrerFeilds> careerFields = new HashSet<>();
    
    private Double latitude;

    private Double longitude;

    private String address;

	public CollageModel(Long id, String name, UniversityModel university, String city, Boolean isPrivate, String logoUrl,
			String overview, String establishedYear, String recognitionDocNumber, String extraInfo,
			Set<Departments> departments, Set<CarrerFeilds> careerFields, Double latitude, Double longitude,
			String address,String gender,String studyType,List<ShiftModel> shift) {
		super(id);
		this.name = name;
		this.university = university;
		this.city = city;
		this.isPrivate = isPrivate;
		this.logoUrl = logoUrl;
		this.overview = overview;
		this.establishedYear = establishedYear;
		this.recognitionDocNumber = recognitionDocNumber;
		this.extraInfo = extraInfo;
		this.departments = departments;
		this.careerFields = careerFields;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.studyType=studyType;
		this.gender=gender;
		this.shift=shift;
	}

	public CollageModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollageModel(Long id) {
		super(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UniversityModel getUniversity() {
		return university;
	}

	public void setUniversity(UniversityModel university) {
		this.university = university;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(String establishedYear) {
		this.establishedYear = establishedYear;
	}

	public String getRecognitionDocNumber() {
		return recognitionDocNumber;
	}

	public void setRecognitionDocNumber(String recognitionDocNumber) {
		this.recognitionDocNumber = recognitionDocNumber;
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public Set<Departments> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Departments> departments) {
		this.departments = departments;
	}

	public Set<CarrerFeilds> getCareerFields() {
		return careerFields;
	}

	public void setCareerFields(Set<CarrerFeilds> careerFields) {
		this.careerFields = careerFields;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getStudyType() {
		return studyType;
	}

	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {	return gender;}

	public List<ShiftModel> getShift() {
		return shift;
	}

	public void setShift(List<ShiftModel> shift) {
		this.shift = shift;
	}
}