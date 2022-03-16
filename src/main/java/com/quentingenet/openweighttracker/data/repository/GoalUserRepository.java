package com.quentingenet.openweighttracker.data.repository;

import com.quentingenet.openweighttracker.data.entity.GoalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalUserRepository extends JpaRepository<GoalUser, Integer> {
}
