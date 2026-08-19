package com.ishtar.models;

import com.ishtar.enums.StudyShift;
import jakarta.persistence.*;

@Entity
@Table(name="shifts")
public class ShiftModel extends AbstractModel{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id", nullable = false)
    private CollageModel collage;
    @Enumerated(EnumType.STRING) // Stores string values like "MORNING", "EVENING", "PARALLEL"
    @Column(name = "shift")
    private StudyShift shift;
    private Double requiredGpa;
    private Integer cost;

    public ShiftModel(Long id,CollageModel collage, StudyShift shift, Double requiredGpa, Integer cost) {
        super(id);
        this.collage = collage;
        this.shift = shift;
        this.requiredGpa = requiredGpa;
        this.cost = cost;
    }

    public ShiftModel() {
    }

    public CollageModel getCollage() {
        return collage;
    }

    public void setCollage(CollageModel collage) {
        this.collage = collage;
    }

    public StudyShift getShift() {
        return shift;
    }

    public void setShift(StudyShift shift) {
        this.shift = shift;
    }

    public Double getRequiredGpa() {
        return requiredGpa;
    }

    public void setRequiredGpa(Double requiredGpa) {
        this.requiredGpa = requiredGpa;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
