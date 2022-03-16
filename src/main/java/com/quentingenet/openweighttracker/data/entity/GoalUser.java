package com.quentingenet.openweighttracker.data.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "goal_user")
public class GoalUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_goal_user", nullable = false, unique = true)
    private Integer idGoalUser;

    @NotNull
    @Column(name = "goal_weight", nullable = false, precision = 1)
    private Float goalWeight;

    @NotNull
    @Column(name = "initial_body_size", nullable = false, precision = 1)
    private Float initialBodySize;

    @NotNull
    @Column(name = "initial_weight", nullable = false, precision = 1)
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
