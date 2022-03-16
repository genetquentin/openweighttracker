package com.quentingenet.openweighttracker.data.repository;

import com.quentingenet.openweighttracker.data.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    //TODO: find a specific user by his ID.
}
