package com.quentingenet.openweighttracker.data.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class WeightRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_weight_record", nullable = false)
    private Integer idWeightRecord;

    private LocalDate weightRecordDate;

    private Float WeightKgRecord;

    private Float percentFatMass;

    private Float percentMuscularMass;

    private Float percentBodyWater;

    private Float percentBoneMass;


    //Getters and setters
    public Integer getIdWeightRecord() {
        return idWeightRecord;
    }

    public void setIdWeightRecord(Integer idWeightRecord) {
        this.idWeightRecord = idWeightRecord;
    }

    public LocalDate getWeightRecordDate() {
        return weightRecordDate;
    }

    public void setWeightRecordDate(LocalDate weightRecordDate) {
        this.weightRecordDate = weightRecordDate;
    }

    public Float getWeightKgRecord() {
        return WeightKgRecord;
    }

    public void setWeightKgRecord(Float weightKgRecord) {
        WeightKgRecord = weightKgRecord;
    }

    public Float getPercentFatMass() {
        return percentFatMass;
    }

    public void setPercentFatMass(Float percentFatMass) {
        this.percentFatMass = percentFatMass;
    }

    public Float getPercentMuscularMass() {
        return percentMuscularMass;
    }

    public void setPercentMuscularMass(Float percentMuscularMass) {
        this.percentMuscularMass = percentMuscularMass;
    }

    public Float getPercentBodyWater() {
        return percentBodyWater;
    }

    public void setPercentBodyWater(Float percentBodyWater) {
        this.percentBodyWater = percentBodyWater;
    }

    public Float getPercentBoneMass() {
        return percentBoneMass;
    }

    public void setPercentBoneMass(Float percentBoneMass) {
        this.percentBoneMass = percentBoneMass;
    }
}
