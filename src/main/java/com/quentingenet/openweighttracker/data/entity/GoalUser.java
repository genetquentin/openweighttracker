package com.quentingenet.openweighttracker.data.entity;

import javax.persistence.*;

@Entity
public class GoalUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_goal_user", nullable = false)
    private Integer idGoalUser;

    private Float goalWeight;

    private Float initialBodySize;

    private Float initialWeight;

    //Getters and setters
    public Integer getIdGoalUser() {
        return idGoalUser;
    }

    public void setIdGoalUser(Integer idGoalUser) {
        this.idGoalUser = idGoalUser;
    }

    public Float getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(Float goalWeight) {
        this.goalWeight = goalWeight;
    }

    public Float getInitialBodySize() {
        return initialBodySize;
    }

    public void setInitialBodySize(Float initialBodySize) {
        this.initialBodySize = initialBodySize;
    }

    public Float getInitialWeight() {
        return initialWeight;
    }

    public void setInitialWeight(Float initialWeight) {
        this.initialWeight = initialWeight;
    }
}
