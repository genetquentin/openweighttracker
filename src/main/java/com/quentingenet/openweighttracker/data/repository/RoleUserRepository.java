package com.quentingenet.openweighttracker.data.repository;

import com.quentingenet.openweighttracker.data.entity.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleUserRepository extends JpaRepository<RoleUser, Integer> {

}
