package com.quentingenet.openweighttracker.data.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    @NotBlank
    @Column(name = "email_user")
    private String emailUser;

    @NotBlank
    @Size(min = 4, max = 50, message = "Password must have at least 4 characters and maximum 50.")
    @Column(name = "password_user")
    private String passwordUser;

    @ManyToOne
    private RoleUser roleUser;

    @OneToOne
    private GoalUser goalUser;


    private List<WeightRecord> weightsList;


    //Getters and setters
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idAppUser) {
        this.idUser = idAppUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public RoleUser getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(RoleUser roleUser) {
        this.roleUser = roleUser;
    }

    public GoalUser getGoalUser() {
        return goalUser;
    }

    public void setGoalUser(GoalUser goalUser) {
        this.goalUser = goalUser;
    }

    public List<WeightRecord> getWeightsList() {
        return weightsList;
    }

    public void setWeightsList(List<WeightRecord> weightsList) {
        this.weightsList = weightsList;
    }
}

